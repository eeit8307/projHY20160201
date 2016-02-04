package module.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import module.model._09_Class_FirstVO;
import module.model._10_Class_SecondVO;
import module.model._11_Class_ThirdVO;
import module.util.HibernateUtil;

public class _11_Class_ThirdDAO implements _11_Class_Third_InterfaceDAO{

	private SessionFactory sessionFactory;
	public _11_Class_ThirdDAO() {
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
			
			_11_Class_ThirdDAO dao = new _11_Class_ThirdDAO();
			_11_Class_ThirdVO bean=new _11_Class_ThirdVO();
			

				
//			_10_Class_SecondVO fk = new _10_Class_SecondVO();
//			fk.setClass2_no(2);
//			bean.setClass3_name("多冰");
//			bean.setClass_SecondVO(fk);
//			dao.insert(bean);
		

			
//			_10_Class_SecondVO fk = new _10_Class_SecondVO();
//			fk.setClass2_no(3);			
//			bean.setClass3_no(18);
//			bean.setClass3_name("薄冰");
//			bean.setClass_SecondVO(fk);
//			dao.update(bean);
					
//			dao.delete(18);
			
//			_11_Class_ThirdVO show11 = dao.findById(1);
//			System.out.print(show11.getClass3_no() + ",");
//			System.out.print(show11.getClass3_name() + ",");
//			System.out.print(show11.getClass_SecondVO().getClass2_no() );			
//			System.out.println();
//	
//			List<_11_Class_ThirdVO> list22 = dao.getAll();
//			for (_11_Class_ThirdVO aDept : list22) {
//				System.out.print(aDept.getClass3_no() + ",");
//				System.out.print(aDept.getClass3_name() + ",");
//				System.out.print(aDept.getClass_SecondVO().getClass2_no() );			
//				System.out.println();
//			}
			
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
		
	}
	
	
	@Override
	public void insert(_11_Class_ThirdVO class_ThirdVO) {
		getSession().save(class_ThirdVO);  
		
	}
	@Override
	public void update(_11_Class_ThirdVO class_ThirdVO) {
		 getSession().update(class_ThirdVO); 	
	}
	@Override
	public void delete(Integer class3_no) {
		_11_Class_ThirdVO bean=new _11_Class_ThirdVO();
	   	 bean.setClass3_no(class3_no);
	   	 getSession().delete(bean); 	
	}
	@Override
	public _11_Class_ThirdVO findById(Integer class3_no) {
		return (_11_Class_ThirdVO)getSession().get(_11_Class_ThirdVO.class, class3_no); 
	}
	@Override
	public List<_11_Class_ThirdVO> getAll() {
		return getSession().createQuery("from _11_Class_ThirdVO").list();   
	}
	
	
	
}
