package module.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import module.model._02_Employee_StatusVO;
import module.model._03_JobVO;
import module.util.HibernateUtil;

public class _03_JobDAO implements _03_Job_InterfaceDAO{
	private SessionFactory sessionFactory;
	public _03_JobDAO() {
		sessionFactory = HibernateUtil.getSessionFactory();
	}
	public Session getSession() {
		if(sessionFactory!=null) {
			return sessionFactory.getCurrentSession();
		}
		return null;
	}
	

	@Override
	public _03_JobVO findById(Integer job_no) {
		return (_03_JobVO) getSession().get(_03_JobVO.class, job_no);
	}
	@Override
	public List<_03_JobVO> getAll() {
		return getSession().createQuery("from _03_JobVO").list();
	}
	@Override
	public void insert(_03_JobVO jobVO){
		getSession().save(jobVO);
	}
	@Override
	public void update(_03_JobVO jobVO){
		getSession().update(jobVO);
	}
	@Override
	public void delete(Integer job_no){
		_03_JobVO jobVO = new _03_JobVO();
		jobVO.setJob_no(job_no);
		getSession().delete(jobVO);
	}


	public static void main(String[] args) {
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
			_03_JobDAO dao=new _03_JobDAO();
			_03_JobVO bean=new _03_JobVO();
//			System.out.println(dao.findById(1));
//			System.out.println(dao.getAll());
			
			//Insert
//			bean.setJob_no(9);
//			bean.setJob_name("DOG");
//			dao.insert(bean);
			//Update
//			bean.setJob_no(9);
//			bean.setJob_name("DOGS");
//			dao.update(bean);
			//Delete
//			dao.delete(9);
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
	}
}
