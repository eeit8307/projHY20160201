package module.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import module.model._17_Group_UserVO;
import module.model._18_Order_DetailVO;
import module.util.HibernateUtil;



public class _18_Order_DetailDAO implements _18_Order_Detail_InterfaceDAO{
	
	private SessionFactory sessionFactory;
	public _18_Order_DetailDAO() {
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
			
			_18_Order_Detail_InterfaceDAO dao = new _18_Order_DetailDAO();
			_18_Order_DetailVO bean = new _18_Order_DetailVO();
			//---------------------
//			System.out.println(dao.getAll());	
			//----------------------------
//			System.out.println(dao.findById(2));
			//---------------------
//			dao.delete(2);
			
			//-------------------------
//			bean.setDetail_no(3);			
//			_17_Group_UserVO first = new _17_Group_UserVO();
//			first.setGroup_user_no(1);			
//			bean.setGroup_userVO(first);
//			bean.setOstore_name("茶店");
//			bean.setOprice_no(999);
//			dao.update(bean);
			
			//------------------------
			
//			_17_Group_UserVO first = new _17_Group_UserVO();
//			first.setGroup_user_no(1);
//			bean.setGroup_userVO(first);
//			bean.setOstore_name("綠茶店");
//			dao.insert(bean);
			

			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
	}
	
	@Override
	public void insert(_18_Order_DetailVO order_DetailVO) {		
			this.getSession().save(order_DetailVO);		
	}
	
	@Override
	public void update(_18_Order_DetailVO order_DetailVO) {	
			getSession().update(order_DetailVO);		
	}
	
	@Override
	public void delete(Integer detail_no) {
		_18_Order_DetailVO order_DetailVO = new _18_Order_DetailVO();
		order_DetailVO.setDetail_no(detail_no);
			getSession().delete(order_DetailVO);
	}	
	
	@Override
	public _18_Order_DetailVO findById(Integer detail_no) {
		return (_18_Order_DetailVO) getSession().get(_18_Order_DetailVO.class, detail_no);
	}
	
	@Override
	public List<_18_Order_DetailVO> getAll() {
		return getSession().createQuery("from _18_Order_DetailVO").list();
	}		

}
