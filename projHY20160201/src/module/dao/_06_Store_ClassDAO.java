package module.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import module.model._06_Store_ClassVO;
import module.util.HibernateUtil;

public class _06_Store_ClassDAO implements _06_Store_Class_InterfaceDAO {

	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	private SessionFactory sessionFactory;

	public _06_Store_ClassDAO() {
		sessionFactory = HibernateUtil.getSessionFactory();
	}

	public Session getSession() {
		if (sessionFactory != null) {
			return sessionFactory.getCurrentSession();
		}
		return null;
	}

	@Override
	public void insert(_06_Store_ClassVO store_classVO) {

		getSession().save(store_classVO);

	}

	@Override
	public void update(_06_Store_ClassVO store_classVO) {

		getSession().update(store_classVO);

	}

	@Override
	public void delete(Integer class_no) {
		_06_Store_ClassVO store_classVO=new _06_Store_ClassVO();
		store_classVO.setClass_no(class_no);
		getSession().delete(store_classVO);
	}

	@Override
	public _06_Store_ClassVO findById(Integer class_no) {
		return (_06_Store_ClassVO) getSession().get(_06_Store_ClassVO.class, class_no);
	}

	@Override

	public List<_06_Store_ClassVO> getAll() {

		return getSession().createQuery("from _06_Store_ClassVO").list();
	}

	public static void main(String[] args) {
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();

			_06_Store_ClassDAO dao = new _06_Store_ClassDAO();
			_06_Store_ClassVO bean = new _06_Store_ClassVO();
			
			
			
		   // getAll
//			System.out.println(dao.getAll());
//
//			// findById
//			System.out.println(dao.findById(1));

			//delete
//          dao.delete(2);
			
          //update要注意-------------------------------------

//			_06_Store_ClassVO first=new _06_Store_ClassVO();
//     		 first.setClass_no(3);
//   	
// 		      bean.setClass_name("DSGFDSG");
//     		 bean.setClass_no(3);
//     		 dao.update(bean);

			
			 //insert要注意---------------
	   		
//	   		 bean.setClass_name("asfasf");
//	   		 dao.insert(bean);
			
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
	}

}
