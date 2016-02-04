package module.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import module.model._01_OrganizationVO;
import module.model._16_Group_RecordVO;
import module.util.HibernateUtil;

public class _01_OrganizationDAO implements _01_Organization_InterfaceDAO{
	private SessionFactory sessionFactory;
	public _01_OrganizationDAO() {
		sessionFactory = HibernateUtil.getSessionFactory();
	}
	public Session getSession() {
		if(sessionFactory!=null) {
			return sessionFactory.getCurrentSession();
		}
		return null;
	}
/*----------------------------------------------------------------------------------------*/
	@Override
	public _01_OrganizationVO findById(String org_id) {
		return (_01_OrganizationVO) getSession().get(_01_OrganizationVO.class, org_id);
	}
/*----------------------------------------------------------------------------------------*/
	@Override
	public List<_01_OrganizationVO> getAll() {
		return getSession().createQuery("from _01_OrganizationVO").list();
	}
/*----------------------------------------------------------------------------------------*/
	@Override
	public void insert(_01_OrganizationVO organizationVO){
		getSession().save(organizationVO);
	}
/*----------------------------------------------------------------------------------------*/
	@Override
	public void update(_01_OrganizationVO organizationVO){
		getSession().update(organizationVO);
	}
/*----------------------------------------------------------------------------------------*/
	@Override
	public void delete(String org_id){
		_01_OrganizationVO organizationVO = new _01_OrganizationVO();
		organizationVO.setOrg_id(org_id);
		getSession().delete(organizationVO);
	}
	
/*----------------------------------------------------------------------------------------*/
	public static void main(String[] args) {
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			_01_OrganizationDAO dao=new _01_OrganizationDAO();
			_01_OrganizationVO bean=new _01_OrganizationVO();
//			System.out.println(dao.getAll());
//			System.out.println(dao.findById("DEP0001"));
			
			//Insert
//			bean.setOrg_id("DEP0011");
//			bean.setOrg_name("DOG");
//			bean.setDiscription("GOD");
//			bean.setParent("CO99999999");
//			dao.insert(bean);
			//Update
//			bean.setOrg_id("DEP0011");
//			bean.setOrg_name("DOG");
//			bean.setDiscription("GOD1");
//			bean.setParent("CO99999999");
//			dao.update(bean);
			//Delete
//			dao.delete("DEP0011");
			
		
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}	
	}
}
