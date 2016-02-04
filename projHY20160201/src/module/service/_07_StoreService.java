package module.service;

import java.util.List;

import module.dao._06_Store_ClassDAO;
import module.dao._06_Store_Class_InterfaceDAO;
import module.dao._07_StoreDAO;
import module.dao._07_Store_InterfaceDAO;
import module.dao._21_Store_In_ClassDAO;
import module.dao._21_Store_In_Class_InterfaceDAO;
import module.model._06_Store_ClassVO;
import module.model._07_StoreVO;
import module.model._21_Store_In_ClassVO;
import module.util.HibernateUtil;

public class _07_StoreService {
	private  _07_Store_InterfaceDAO _07DAO = new _07_StoreDAO();
	private _06_Store_Class_InterfaceDAO _06DAO = new _06_Store_ClassDAO();
	private _21_Store_In_Class_InterfaceDAO _21DAO=new _21_Store_In_ClassDAO();
	
	public void insertStore(_07_StoreVO bean , _21_Store_In_ClassVO bean2 , _06_Store_ClassVO bean3) {
		_07_StoreVO result = new _07_StoreVO();
		int pk = 0 ;
		int pk2 = 0;
		if(bean!=null) {			
			
			bean.setPublic_state("1");
			_07DAO.insert(bean);			
			_07_StoreVO fk7=new _07_StoreVO();			
			pk =(int) _07DAO.getSession().getIdentifier(bean);	
			fk7.setStore_no(pk);
			
			//1重資料庫取得資料;3參數傳進來的資料與資料庫資料做比對(有比對成功就進入if);4取得資料庫的參考鍵;5將傳進來的資料套用參考鍵(主鍵)
			List<_06_Store_ClassVO> beans =_06DAO.getAll();
			for(_06_Store_ClassVO list:beans){			
			 if(bean3.getClass_name().equals(list.getClass_name())){
				 pk2 = list.getClass_no();
				 bean3.setClass_no(pk2);
				 break;
				}
			}
			//2傳進來的參數有帶主鍵(進入if);3將主鍵存入表(21)要用的參考鍵;5沒有參考到舊有資料就新增一個;6取得剛才新增的PK值;7將主鍵存入表(21)
			_06_Store_ClassVO fk6=new _06_Store_ClassVO();			
			if(bean3.getClass_no() != null){
				fk6.setClass_no(pk2);
			}else{
				_06DAO.insert(bean3);							
				pk2 =(int) _06DAO.getSession().getIdentifier(bean3);	
				fk6.setClass_no(pk2);
			}
			
			
			
			bean2.setStoreVO(fk7);	
			bean2.setStore_classVO(fk6);
			_21DAO.insert(bean2);
			
//			List<_06_Store_ClassVO> beans =_06DAO.getAll();
//			for(_06_Store_ClassVO list:beans){							
//				if(bean3.getClass_name().equals(list.getClass_name())){
//					bean2.setStoreVO(fk7);	
//					fk6.setClass_no(list.getClass_no());
//					bean2.setStore_classVO(fk6);
//					_21DAO.insert(bean2);
//				}else{					
//					bean2.setStoreVO(fk7);	
//					bean2.setStore_classVO(fk6);
//					_21DAO.insert(bean2);
//				}
//			}
		}		
	}
	public void update(_07_StoreVO bean , _21_Store_In_ClassVO bean2 , _06_Store_ClassVO bean3) {
		_07_StoreVO result = null;
		if(bean!=null) {
			
			_07DAO.update(bean);
//			_21DAO.update(bean2);
		}		
	}
	public void delete(_07_StoreVO bean) {
		if(bean!=null) {
			_07DAO.delete(bean.getStore_no());			
		}		
	}
	public List<_07_StoreVO> getAll() {
		List<_07_StoreVO> result = null;
	    result =  _07DAO.getAll();		    
		return result;
	}
	public _07_StoreVO findById(Integer store_no){
		_07_StoreVO result = null;
		result = _07DAO.findById(store_no);		
		return result;
	}
	
	
	
	
	public static void main(String[] args) {
		try {
			 HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();	
//		_07_StoreDAO dao = new _07_StoreDAO();
		_07_StoreService service = new _07_StoreService();
		_07_StoreVO bean = new _07_StoreVO();
		_21_Store_In_ClassVO bean2 = new _21_Store_In_ClassVO();
		_06_Store_ClassVO bean3 = new _06_Store_ClassVO();
		
		//findById
//		  _07_StoreVO beans = service.findById(34);
//			System.out.print(beans.getStore_no() + ",");
//			System.out.print(beans.getStore_name() + ",");
//			System.out.print(beans.getPhone() + ",");
//			System.out.print(beans.getAddress() + ",");
//			System.out.print(beans.getFinal_update() + ",");
//			System.out.print(beans.getEmployeeVO() );			
//			System.out.println();
		
		//insertStore
		bean.setStore_name("雞排店");
		bean.setPhone("55226688");	
		bean.setAddress("台北市大安捷運站");
		bean.setFinal_update(java.sql.Date.valueOf("2016-01-22"));		
		bean3.setClass_name("冰品類");
		service.insertStore(bean, bean2, bean3);
		//int pk =(int) dao.getSession().getIdentifier(bean);	
		
//		String class_name="冰品類,下午茶";
//		String[] split = class_name.split(",");
//		for (String list:split){			
//		System.out.println(list);		
//		}
		
		//update
//		bean.setStore_no(31);
//		bean.setStore_name("超大雞排店");
//		bean.setPhone("0123-1456-45");
//		int fk = 2;	
//		bean3.getClass_no();
//		bean2.setStore_classVO(bean3);	
//		service.update(bean, bean2, bean3);
		
		
		//delete
//		bean.setStore_no(35);
//		service.delete(bean);
		
		//getAll
//	    List<_07_StoreVO> beans = service.getAll();		
//		for (_07_StoreVO aDept : beans) {
//			System.out.print(aDept.getStore_no() + ",");
//			System.out.print(aDept.getStore_name() + ",");
//			System.out.print(aDept.getPhone() + ",");
//			System.out.print(aDept.getAddress() + ",");
//			System.out.print(aDept.getFinal_update() + ",");
//			System.out.print(aDept.getEmployeeVO() );			
//			System.out.println();
//		}
		
		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
	}
	
}
