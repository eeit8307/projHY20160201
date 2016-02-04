package module.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import module.model._04_EmployeeVO;
import module.model._19_FavoriteVO;
import module.util.HibernateUtil;

public class _19_FavoriteDAO implements _19_Favorite_InterfaceDAO{
	private SessionFactory sessionFactory;
	public _19_FavoriteDAO() {
		sessionFactory = HibernateUtil.getSessionFactory();
	}
	public Session getSession() {
		if(sessionFactory!=null) {
			return sessionFactory.getCurrentSession();
		}
		return null;
	}
	
	@Override
	public _19_FavoriteVO findById(Integer favorite_no) {
		return (_19_FavoriteVO) getSession().get(_19_FavoriteVO.class, favorite_no);
	}
	@Override
	public List<_19_FavoriteVO> getAll() {
		return getSession().createQuery("from _19_FavoriteVO").list();
	}
	@Override
	public void insert(_19_FavoriteVO favoriteVO) {
		getSession().save(favoriteVO);	
	}
	@Override
	public void update(_19_FavoriteVO favoriteVO) {		
		getSession().update(favoriteVO);
	}
	@Override
	public void delete(Integer favorite_no) {
		_19_FavoriteVO favoriteVO = new _19_FavoriteVO();
		favoriteVO.setFavorite_no(favorite_no);
		getSession().delete(favoriteVO);
	}

	public static void main(String[] args) {
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			_19_FavoriteDAO dao=new _19_FavoriteDAO();
			_19_FavoriteVO bean=new _19_FavoriteVO();
			//--------------------------
//			System.out.println(dao.getAll());
			//---------------------------
//			System.out.println(dao.findById(1));
			
			//Insert
//			_04_EmployeeVO emp=new _04_EmployeeVO();
//			emp.setUser_id(12);
//			bean.setEmployeeVO(emp);
//		    bean.setFavorite_name("123");
//		    dao.insert(bean);
			
			//Update
//		    bean.setFavorite_no(3);    
//		    bean.setFavorite_name("321");
//		    _04_EmployeeVO emp=new _04_EmployeeVO();
//			emp.setUser_id(12);
//			bean.setEmployeeVO(emp);
//		    dao.update(bean);
			
			//Delete
			dao.delete(3);

			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
	}
}
