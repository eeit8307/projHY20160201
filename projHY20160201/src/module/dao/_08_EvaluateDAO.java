package module.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import module.model._04_EmployeeVO;
import module.model._06_Store_ClassVO;
import module.model._07_StoreVO;
import module.model._08_EvaluateVO;
import module.util.HibernateUtil;

public class _08_EvaluateDAO implements _08_Evaluate_InterfaceDAO {

	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	private SessionFactory sessionFactory;

	public _08_EvaluateDAO() {
		sessionFactory = HibernateUtil.getSessionFactory();
	}

	public Session getSession() {
		if (sessionFactory != null) {
			return sessionFactory.getCurrentSession();
		}
		return null;
	}

	@Override
	public void insert(_08_EvaluateVO evaluateVO) {

		getSession().save(evaluateVO);

	}

	@Override
	public void update(_08_EvaluateVO evaluateVO) {

		getSession().update(evaluateVO);
	}

	@Override
	public void delete(Integer e_record) {
		_08_EvaluateVO bean=new _08_EvaluateVO();
		bean.setE_record(e_record);
		getSession().delete(bean);

	}

	@Override
	public _08_EvaluateVO findById(Integer e_record) {
		
		return (_08_EvaluateVO) session.get(_08_EvaluateVO.class, e_record);

	}

	@Override
	public List<_08_EvaluateVO> getAll() {

		return getSession().createQuery("from _08_EvaluateVO").list();

	}

	public static void main(String[] args) {
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();

			_08_EvaluateDAO dao = new _08_EvaluateDAO();
			_08_EvaluateVO bean = new _08_EvaluateVO();

////            getAll
//			System.out.println(dao.getAll());
//
//			// findById
//			System.out.println(dao.findById(1));

			//delete
//          dao.delete(2);
			
          //update要注意-------------------------------------

//			_04_EmployeeVO emp=new _04_EmployeeVO();
//			emp.setUser_id(2);
//			_07_StoreVO store=new _07_StoreVO();
//			store.setStore_no(3);
//			bean.setStoreVO(store);
//			bean.setEmployeeVO(emp);
//     		bean.setContent("asdasd");
//     		bean.setE_record(3);
//     		dao.update(bean);

			
			 //insert要注意---------------
//			_04_EmployeeVO emp=new _04_EmployeeVO();
//			emp.setUser_id(2);
//			_07_StoreVO store=new _07_StoreVO();
//			store.setStore_no(3);
//			bean.setContent("aaaaaaa");
//			bean.setRank("6rs");
//			bean.setStoreVO(store);
//			bean.setEmployeeVO(emp);
//	   		dao.insert(bean);
			
			
			
			
			
			
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
	}

	
	
	
	
}
