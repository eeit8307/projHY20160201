package module.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import module.model._11_Class_ThirdVO;
import module.model._19_FavoriteVO;
import module.model._20_Favorite_DetailVO;
import module.util.HibernateUtil;

public class _20_Favorite_DetailDAO implements _20_Favorite_Detail_InterfaceDAO{


		private SessionFactory sessionFactory;
		public _20_Favorite_DetailDAO() {
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
				
				_20_Favorite_DetailDAO dao = new _20_Favorite_DetailDAO();
				_20_Favorite_DetailVO bean =new _20_Favorite_DetailVO();
				//---------------------
//				System.out.println(dao.getAll());
				//------------------
//				System.out.println(dao.findById(1));
				
				//Insert
//			    bean.setExtra(11.0);
//			    _11_Class_ThirdVO ctvo=new _11_Class_ThirdVO();
//			    ctvo.setClass3_no(10);
//			    bean.setClass3_no(ctvo);
//			    _19_FavoriteVO fvo =new _19_FavoriteVO();
//			    fvo.setFavorite_no(1);
//			    bean.setFavorite_no(fvo);
//			    dao.insert(bean);
				
				//Update
//			    bean.setDetail_no(9);
//			    bean.setExtra(10.0);
//			    _11_Class_ThirdVO ctvo=new _11_Class_ThirdVO();
//			    ctvo.setClass3_no(11);
//			    bean.setClass3_no(ctvo);
//			    _19_FavoriteVO fvo =new _19_FavoriteVO();
//			    fvo.setFavorite_no(1);
//			    bean.setFavorite_no(fvo);
//			    dao.update(bean);
				//Delete
//				dao.delete(9);
				
				HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
			} finally {
				HibernateUtil.closeSessionFactory();
			}
		}
		
	@Override
	public void insert(_20_Favorite_DetailVO favorite_detailVO) {
		getSession().save(favorite_detailVO);  
	}

	@Override
	public void update(_20_Favorite_DetailVO favorite_detailVO) {
		getSession().update(favorite_detailVO); 
	}

	@Override
	public void delete(Integer detail_no) {
		_20_Favorite_DetailVO bean=new _20_Favorite_DetailVO();
	   	 bean.setDetail_no(detail_no);
	   	 getSession().delete(bean); 
	}
	@Override
	public _20_Favorite_DetailVO findById(Integer detail_no) {
		return (_20_Favorite_DetailVO)getSession().get(_20_Favorite_DetailVO.class, detail_no);   
	}
	@Override
	public List<_20_Favorite_DetailVO> getAll() {
		 return getSession().createQuery("from _20_Favorite_DetailVO").list();   	
	}
}
