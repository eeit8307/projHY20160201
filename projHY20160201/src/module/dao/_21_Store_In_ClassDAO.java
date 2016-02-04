package module.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import module.model._06_Store_ClassVO;
import module.model._07_StoreVO;
import module.model._21_Store_In_ClassVO;
import module.util.HibernateUtil;

public class _21_Store_In_ClassDAO implements _21_Store_In_Class_InterfaceDAO {

	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	private SessionFactory sessionFactory;

	public _21_Store_In_ClassDAO() {
		sessionFactory = HibernateUtil.getSessionFactory();
	}

	public Session getSession() {
		if (sessionFactory != null) {
			return sessionFactory.getCurrentSession();
		}
		return null;
	}

	@Override
	public void insert(_21_Store_In_ClassVO store_in_classVO) {

		getSession().save(store_in_classVO);

	}

	@Override
	public void update(_21_Store_In_ClassVO store_in_classVO) {

		getSession().update(store_in_classVO);

	}

	@Override
	public void delete(Integer no) {
		_21_Store_In_ClassVO bean=new _21_Store_In_ClassVO();
		bean.setNo(no);
		getSession().delete(bean);
	}

	@Override
	public _21_Store_In_ClassVO findById(Integer no) {
		return (_21_Store_In_ClassVO) getSession().get(_21_Store_In_ClassVO.class, no);
	}

	@Override

	public List<_21_Store_In_ClassVO> getAll() {

		return getSession().createQuery("from _21_Store_In_ClassVO").list();
	}

	public static void main(String[] args) {
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();

			_21_Store_In_ClassDAO dao = new _21_Store_In_ClassDAO();
			_21_Store_In_ClassVO bean=new _21_Store_In_ClassVO();
			
			
			
		   // getAll
//			System.out.println(dao.getAll());

			// findById
//			System.out.println(dao.findById(1));
//
			//delete
//			dao.delete(2);
			
          //update要注???-------------------------------------

//			_07_StoreVO store=new _07_StoreVO();
//			store.setStore_no(3);
//			_06_Store_ClassVO cl=new _06_Store_ClassVO();
//			cl.setClass_no(3);
//			bean.setStore_classVO(cl);
//			bean.setStoreVO(store);
//			dao.insert(bean);
			

			
		//insert要注???---------------
//			bean.setNo(11);
			_07_StoreVO store=new _07_StoreVO();
			store.setStore_no(8);
			_06_Store_ClassVO cl=new _06_Store_ClassVO();
			cl.setClass_no(3);
			bean.setStore_classVO(cl);
			bean.setStoreVO(store);
			dao.update(bean);
			
			
			
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
	
	}
}
	
