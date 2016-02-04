package module.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import module.model._09_Class_FirstVO;
import module.model._11_Class_ThirdVO;
import module.model._12_ItemVO;
import module.model._13_Item_Class_ThirdVO;
import module.util.HibernateUtil;

public class _13_Item_Class_ThirdDAO implements _13_Item_Class_Third_InterfaceDAO{
	private SessionFactory sessionFactory;
	public _13_Item_Class_ThirdDAO() {
		sessionFactory = HibernateUtil.getSessionFactory();
	}
	public Session getSession() {
		if(sessionFactory!=null) {
			return sessionFactory.getCurrentSession();
		}
		return null;
	}
	public static void main(String[] args) {
		
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			
			_13_Item_Class_ThirdDAO dao = new _13_Item_Class_ThirdDAO();
			_13_Item_Class_ThirdVO bean=new _13_Item_Class_ThirdVO();
			

//			_11_Class_ThirdVO fk = new _11_Class_ThirdVO();
//			fk.setClass3_no(3);
//			_12_ItemVO fk2 = new _12_ItemVO();
//			fk2.setItem_no(5);
//			bean.setClass_ThirdVO(fk);
//			bean.setItemVO(fk2);
//			bean.setClass3_name("加蛋蛋");
//			bean.setExtra(7.0);
//			dao.insert(bean);
		
			
//			_11_Class_ThirdVO fk = new _11_Class_ThirdVO();
//			fk.setClass3_no(7);
//			_12_ItemVO fk2 = new _12_ItemVO();
//			fk2.setItem_no(6);
//			bean.setClass_ThirdVO(fk);
//			bean.setItemVO(fk2);
//			bean.setClass3_name("加倍蛋");
//			bean.setExtra(7.0);
//			dao.update(bean);
					
//			_12_ItemVO item=new _12_ItemVO();
//			item.setItem_no(7);
//			_11_Class_ThirdVO c3=new _11_Class_ThirdVO();
//			c3.setClass3_no(1);			
//			dao.delete(item,c3);
			
			
//			_11_Class_ThirdVO fk = new _11_Class_ThirdVO();
//			fk.setClass3_no(9);
//			_12_ItemVO fk2 = new _12_ItemVO();
//			fk2.setItem_no(6);
//			_13_Item_Class_ThirdVO show11 = dao.findById(fk2,fk);
//			System.out.print("複合PK:("+show11.getItemVO().getItem_no() + ","+show11.getClass_ThirdVO().getClass3_no()+"),");
//			System.out.print(show11.getClass3_name() + ",");		
//			System.out.print(show11.getExtra() );	
//			System.out.println();
//	
//			List<_13_Item_Class_ThirdVO> list22 = dao.getAll();
//			for (_13_Item_Class_ThirdVO aDept : list22) {
//				System.out.print("複合PK:("+aDept.getItemVO().getItem_no() + ","+aDept.getClass_ThirdVO().getClass3_no()+"),");
//				System.out.print(aDept.getClass3_name() + ",");		
//				System.out.print(aDept.getExtra() );	
//				System.out.println();
//			}
			
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
		
	}
	
	
	
	
	
	
	
	
	@Override
	public void insert(_13_Item_Class_ThirdVO item_Class_ThirdVO) {
		getSession().save(item_Class_ThirdVO);
		
	}

	@Override
	public void update(_13_Item_Class_ThirdVO item_Class_ThirdVO) {
		 getSession().update(item_Class_ThirdVO);  	
		
	}

	@Override
	public void delete(_12_ItemVO itemVO , _11_Class_ThirdVO class_ThirdVO) {
		_13_Item_Class_ThirdVO bean=new _13_Item_Class_ThirdVO();
	   	 bean.setItemVO(itemVO);
	   	 bean.setClass_ThirdVO(class_ThirdVO);;
	   	_13_Item_Class_ThirdVO del = (_13_Item_Class_ThirdVO)getSession().get(_13_Item_Class_ThirdVO.class, bean);
	   	getSession().delete(del);
	   	return;
	}
	//複合主鍵
	@Override
	public _13_Item_Class_ThirdVO findById(_12_ItemVO itemVO , _11_Class_ThirdVO class_ThirdVO) {
		_13_Item_Class_ThirdVO bean=new _13_Item_Class_ThirdVO();
	   	 bean.setItemVO(itemVO);
	   	 bean.setClass_ThirdVO(class_ThirdVO);;
	   	return (_13_Item_Class_ThirdVO)getSession().get(_13_Item_Class_ThirdVO.class, bean);  	 
	}
	@Override
	public List<_13_Item_Class_ThirdVO> getAll() {
		return getSession().createQuery("from _13_Item_Class_ThirdVO").list();  
	}

}
