package module.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import module.model._04_EmployeeVO;
import module.model._07_StoreVO;
import module.util.HibernateUtil;

public class _07_StoreDAO implements _07_Store_InterfaceDAO {
	private SessionFactory sessionFactory;

	public _07_StoreDAO() {
		sessionFactory = HibernateUtil.getSessionFactory();
	}

	public Session getSession() {
		if (sessionFactory != null) {
			return sessionFactory.getCurrentSession();
		}
		return null;
	}

	@Override
	public void insert(_07_StoreVO storeVO) {
		getSession().save(storeVO);

	}

	@Override
	public void update(_07_StoreVO storeVO) {
		getSession().update(storeVO);
	}

	@Override
	public void delete(Integer store_no) {
		_07_StoreVO bean = new _07_StoreVO();
		bean.setStore_no(store_no);
		getSession().delete(bean);
	}

	@Override
	public _07_StoreVO findById(Integer store_no) {
		return (_07_StoreVO) getSession().get(_07_StoreVO.class, store_no);
	}

	@Override
	public List<_07_StoreVO> getAll() {
		return getSession().createQuery("from _07_StoreVO").list();
	}

	public static void main(String[] args) {
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();

			_07_StoreDAO dao = new _07_StoreDAO();
			_07_StoreVO bean = new _07_StoreVO();

//            getAll
//			System.out.println(dao.getAll());
//
//			// findById
			System.out.println(dao.findById(1));

			//delete
//          dao.delete(2);
			
          //update閬釣���-------------------------------------

//
//     		 bean.setStore_name("aaa");
//     		 bean.setStore_no(3);
//     		 dao.update(bean);

			
//			 insert閬釣���---------------	
//			 _07_StoreVO emp=new _07_StoreVO();
//     		emp.setStore_no(1); 		
////			bean.setStoreVO(storeVO);
//	   		bean.setStore_name("asfasf");
//	   		dao.insert(bean);
			
			
			
			
			
			
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
	}

}
