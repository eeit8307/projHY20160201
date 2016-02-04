package module.service;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.metamodel.SetAttribute;

import module.dao._06_Store_ClassDAO;
import module.dao._06_Store_Class_InterfaceDAO;
import module.dao._07_StoreDAO;
import module.dao._07_Store_InterfaceDAO;
import module.dao._21_Store_In_ClassDAO;
import module.dao._21_Store_In_Class_InterfaceDAO;
import module.model._06_Store_ClassVO;
import module.model._07_StoreVO;
import module.model._09_Class_FirstVO;
import module.model._21_Store_In_ClassVO;
import module.util.HibernateUtil;

public class _07_StoreService {
	private  _07_Store_InterfaceDAO _07DAO = new _07_StoreDAO();
	private _06_Store_Class_InterfaceDAO _06DAO = new _06_Store_ClassDAO();
	private _21_Store_In_Class_InterfaceDAO _21DAO=new _21_Store_In_ClassDAO();
	
	public void insert(_07_StoreVO bean , _21_Store_In_ClassVO bean2 , _06_Store_ClassVO bean3) {
		_07_StoreVO result = new _07_StoreVO();
		int pk = 0 ;
		int pk2 = 0;
		if(bean!=null) {			
	
			_07DAO.insert(bean);			
			_07_StoreVO fk7=new _07_StoreVO();			
			pk =(int) _07DAO.getSession().getIdentifier(bean);	
			fk7.setStore_no(pk);
			
			_06DAO.insert(bean3);
			_06_Store_ClassVO fk6=new _06_Store_ClassVO();			
			pk2 =(int) _06DAO.getSession().getIdentifier(bean3);	
			fk6.setClass_no(pk2);
			
			
			bean2.setStoreVO(fk7);	
			bean2.setStore_classVO(fk6);
			_21DAO.insert(bean2);

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
//		  _07_StoreVO beans = service.findById(1);
//		System.out.println("beans="+beans);
		
		//insert
//		bean.setStore_name("雞排店");
//		bean.setPhone("55226688");	
//		bean.setAddress("台北市大安捷運站");
//		bean.setFinal_update(java.sql.Date.valueOf("2016-01-22"));	
//		bean3.setClass_name("冰品類");
//		service.insert(bean, bean2, bean3);
		//int pk =(int) dao.getSession().getIdentifier(bean);	
		
		
		
		//update
		bean.setStore_no(31);
		bean.setStore_name("超大雞排店");
		bean.setPhone("0123-1456-45");
//		int fk = 2;	
		bean3.getClass_no();
		bean2.setStore_classVO(bean3);	
		service.update(bean, bean2, bean3);
		
		
		//delete
//		bean.setStore_no(30);
//		service.delete(bean);
		
		//getAll
	    List<_07_StoreVO> beans = service.getAll();		
		for (_07_StoreVO aDept : beans) {
			System.out.print(aDept.getStore_no() + ",");
			System.out.print(aDept.getStore_name() + ",");
			System.out.print(aDept.getPhone() + ",");
			System.out.print(aDept.getAddress() + ",");
			System.out.print(aDept.getFinal_update() + ",");
			System.out.print(aDept.getEmployeeVO() );			
			System.out.println();
		}
		
		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
	}
	
}
