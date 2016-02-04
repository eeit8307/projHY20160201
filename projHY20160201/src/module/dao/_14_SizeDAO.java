package module.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import module.model._14_SizeVO;
import module.util.HibernateUtil;

public class _14_SizeDAO implements _14_Size_InterfaceDAO {
	
	private SessionFactory sessionFactory;
	public _14_SizeDAO(){
		sessionFactory=HibernateUtil.getSessionFactory();
	}
	public Session getSession(){
		if(sessionFactory!=null){
			Session session= sessionFactory.getCurrentSession();
			return session;
		}
		return null;
	}
	
	
	public static void main(String args[]){		
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
			_14_SizeDAO dao=new _14_SizeDAO();
			_14_SizeVO bean=new _14_SizeVO();
			//----------------------------------
//			System.out.println(dao.findByPK(2));
			//----------------------------------
//			System.out.println(dao.getAll());
			//-------------------------------			
//			bean.setSize_name("xxxxx");
//			dao.insert(bean);
			//---------------------------
//			bean.setSize_no(5);
//			bean.setSize_name("aaaa");
//			dao.update(bean);
			//-----------------------
//			dao.delete(5);
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally{
			HibernateUtil.closeSessionFactory();
		}
	}

	@Override
	public void insert(_14_SizeVO sizeVO) {		
		getSession().save(sizeVO);		
	}

	@Override
	public void update(_14_SizeVO sizeVO) {		
		getSession().update(sizeVO);		
	}

	@Override
	public void delete(Integer size_no) {
		_14_SizeVO bean=new _14_SizeVO();
		bean.setSize_no(size_no);
		getSession().delete(bean);	
	}

	@Override
	public _14_SizeVO findByPK(Integer size_no) {
		return (_14_SizeVO)getSession().get(_14_SizeVO.class, size_no);		
	}

	@Override
	public List<_14_SizeVO> getAll() {
		return getSession().createQuery("from _14_SizeVO").list();		
	}

	
	
	

}
