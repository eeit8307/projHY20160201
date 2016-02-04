package module.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import module.model._09_Class_FirstVO;
import module.model._10_Class_SecondVO;
import module.util.HibernateUtil;

public class _10_Class_SecondDAO implements _10_Class_Second_InterfaceDAO{

	private SessionFactory sessionFactory;
	public _10_Class_SecondDAO() {
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
			
			_10_Class_SecondDAO dao = new _10_Class_SecondDAO();
			_10_Class_SecondVO bean=new _10_Class_SecondVO();
			

//			_09_Class_FirstVO fk = new _09_Class_FirstVO();
//			fk.setClass1_no(1);
//			bean.setClass2_name("加肉");
//			bean.setClass_FirstVO(fk);
//			dao.insert(bean);

			
			
//			_09_Class_FirstVO fk = new _09_Class_FirstVO();
//			fk.setClass1_no(2);
//			bean.setClass2_no(5);
//			bean.setClass2_name("加菜");
//			bean.setClass_FirstVO(fk);
//			dao.update(bean);
					
//			dao.delete(5);
			
//			_10_Class_SecondVO show11 = dao.findById(1);
//			System.out.print(show11.getClass2_no() + ",");
//			System.out.print(show11.getClass2_name() + ",");	
//			System.out.print(show11.getClass_FirstVO().getClass1_no() );	
//			System.out.println();
//	
//			List<_10_Class_SecondVO> list22 = dao.getAll();
//			for (_10_Class_SecondVO aDept : list22) {
//				System.out.print(aDept.getClass2_no() + ",");
//				System.out.print(aDept.getClass2_name() + ",");	
//				System.out.print(aDept.getClass_FirstVO().getClass1_no() );	
//				System.out.println();
//			}
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
		
	}
	
	
	
	@Override
	public void insert(_10_Class_SecondVO class_SecondVO) {
		 getSession().save(class_SecondVO);   
	}

	@Override
	public void update(_10_Class_SecondVO class_SecondVO) {
		 getSession().update(class_SecondVO);
		
	}

	@Override
	public void delete(Integer class2_no) {
		_10_Class_SecondVO bean=new _10_Class_SecondVO();
	   	 bean.setClass2_no(class2_no);
	   	 getSession().delete(bean); 
		
	}

	@Override
	public _10_Class_SecondVO findById(Integer class2_no) {
		return (_10_Class_SecondVO)getSession().get(_10_Class_SecondVO.class, class2_no); 
	}

	@Override
	public List<_10_Class_SecondVO> getAll() {
		return getSession().createQuery("from _10_Class_SecondVO").list(); 
	}

}
