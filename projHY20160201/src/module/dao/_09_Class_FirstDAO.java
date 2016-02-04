package module.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import module.model._09_Class_FirstVO;
import module.util.HibernateUtil;

public class _09_Class_FirstDAO implements  _09_Class_First_InterfaceDAO{	
	private SessionFactory sessionFactory;
	public _09_Class_FirstDAO() {
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
			
			_09_Class_FirstDAO dao = new _09_Class_FirstDAO();
			_09_Class_FirstVO bean=new _09_Class_FirstVO();
			

				
//			bean.setClass1_name("中式");
//			dao.insert(bean);
//			
//			
//			System.out.println(dao.getSession().getIdentifier(bean));
			
//			bean.setClass1_no(2);
//			bean.setClass1_name("客家");
//			dao.update(bean);
					
//			dao.delete(5);
			
//			_09_Class_FirstVO show11 = dao.findById(1);
//			System.out.print(show11.getClass1_no()+",");
//			System.out.println(show11.getClass1_name());
	
//			List<_09_Class_FirstVO> list22 = dao.getAll();
//			for (_09_Class_FirstVO aDept : list22) {
//				System.out.print(aDept.getClass1_name() + ",");
//				System.out.print(aDept.getClass1_no() );			
//				System.out.println();
//			}
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
		
	}
	@Override
	public void insert(_09_Class_FirstVO class_FirstVO) {
		 getSession().save(class_FirstVO);  
	}
	@Override
	public void update(_09_Class_FirstVO class_FirstVO) {
		 getSession().update(class_FirstVO);  	
	}
	@Override
	public void delete(Integer class1_no) {
		_09_Class_FirstVO bean=new _09_Class_FirstVO();
	   	 bean.setClass1_no(class1_no);
	   	 getSession().delete(bean);   	
	}
	@Override
	public _09_Class_FirstVO findById(Integer class1_no) {
		return (_09_Class_FirstVO)getSession().get(_09_Class_FirstVO.class, class1_no);   		
	}
	@Override
	public List<_09_Class_FirstVO> getAll() {
		 return getSession().createQuery("from _09_Class_FirstVO").list();   	 
	}
}
