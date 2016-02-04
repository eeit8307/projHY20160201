package module.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import module.model._01_OrganizationVO;
import module.model._02_Employee_StatusVO;
import module.util.HibernateUtil;

public class _02_Employee_StatusDAO implements _02_Employee_Status_InterfaceDAO{
	private SessionFactory sessionFactory;
	public _02_Employee_StatusDAO() {
		sessionFactory = HibernateUtil.getSessionFactory();
	}
	public Session getSession() {
		if(sessionFactory!=null) {
			return sessionFactory.getCurrentSession();
		}
		return null;
	}
	
	@Override
	public _02_Employee_StatusVO findById(Integer status_no) {
		return (_02_Employee_StatusVO) getSession().get(_02_Employee_StatusVO.class, status_no);
	}
	@Override
	public List<_02_Employee_StatusVO> getAll() {
		return getSession().createQuery("from _02_Employee_StatusVO").list();
	}
	@Override
	public void insert(_02_Employee_StatusVO employee_StatusVO){
		getSession().save(employee_StatusVO);
	}
	@Override
	public void update(_02_Employee_StatusVO employee_StatusVO){
		getSession().update(employee_StatusVO);
	}
	@Override
	public void delete(Integer status_no){
		_02_Employee_StatusVO employee_StatusVO = new _02_Employee_StatusVO();
		employee_StatusVO.setStatus_no(status_no);
		getSession().delete(employee_StatusVO);
	}


	public static void main(String[] args) {
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
			_02_Employee_StatusDAO dao=new _02_Employee_StatusDAO();
			_02_Employee_StatusVO bean=new _02_Employee_StatusVO();
//			System.out.println(dao.getAll());
//			System.out.println(dao.findById(2));
			
			//Insert
//			bean.setStatus_no(4);
//			bean.setStatus_name("123");
//			dao.insert(bean);
			//Update
//			bean.setStatus_no(4);
//			bean.setStatus_name("12345");
//			dao.update(bean);
			//Delete
			dao.delete(4);
			
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
	}
}
