package module.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import module.model._04_EmployeeVO;
import module.model._16_Group_RecordVO;
import module.model._17_Group_UserVO;
import module.util.HibernateUtil;



public class _17_Group_UserDAO implements _17_Group_User_InterfaceDAO {
	private SessionFactory sessionFactory;
	public _17_Group_UserDAO() {
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
			_17_Group_User_InterfaceDAO dao = new _17_Group_UserDAO();
			_17_Group_UserVO bean = new _17_Group_UserVO();
			//-------------------
//			System.out.println(dao.getAll());
			//-----------------------------
//			System.out.println(dao.findById(1));
			//----------------------------
//			_18_Order_DetailDAO detail=new _18_Order_DetailDAO();
//			detail.delete(25);
//			dao.delete(19);
			//------------------------------------------
			
//			_16_Group_RecordVO first = new _16_Group_RecordVO();
//			first.setGroup_no(1);
//			bean.setGroup_RecordVO(first);			
//			
//			_04_EmployeeVO first2 = new _04_EmployeeVO();
//			first2.setUser_id(1);
//			bean.setEmployeeVO(first2);
//			
//			bean.setGroup_user_name("dog");
//			bean.setGroup_user_no(1);
//			dao.update(bean);
			
			//--------------------------
//			_16_Group_RecordVO first = new _16_Group_RecordVO();
//			first.setGroup_no(1);
//			bean.setGroup_RecordVO(first);			
//			
//			_04_EmployeeVO first2 = new _04_EmployeeVO();
//			first2.setUser_id(1);
//			bean.setEmployeeVO(first2);
//			
//			bean.setGroup_user_name("dogggggggg");
//		
//			dao.insert(bean);
			
			
			
	
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
	}
	

	@Override
	public void insert(_17_Group_UserVO group_UserVO) {		
			this.getSession().save(group_UserVO);		
	}

	@Override
	public void update(_17_Group_UserVO group_UserVO) {
			getSession().update(group_UserVO);
	}

	@Override
	public void delete(Integer group_user_no) {
		_17_Group_UserVO group_UserVO =new _17_Group_UserVO();
		group_UserVO.setGroup_user_no(group_user_no);
		getSession().delete(group_UserVO);		
	}

	@Override
	public _17_Group_UserVO findById(Integer group_user_no) {
		return (_17_Group_UserVO) getSession().get(_17_Group_UserVO.class, group_user_no);
	}

	@Override
	public List<_17_Group_UserVO> getAll() {
		return getSession().createQuery("from _17_Group_UserVO").list();
	}

}
