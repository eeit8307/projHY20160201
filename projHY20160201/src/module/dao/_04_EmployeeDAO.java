package module.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import module.model._01_OrganizationVO;
import module.model._02_Employee_StatusVO;
import module.model._03_JobVO;
import module.model._04_EmployeeVO;
import module.util.HibernateUtil;

public class _04_EmployeeDAO implements _04_Employee_interfaceDAO  {
	private SessionFactory sessionFactory;
	public _04_EmployeeDAO() {
		sessionFactory = HibernateUtil.getSessionFactory();
	}
	public Session getSession() {
		if(sessionFactory!=null) {
			return sessionFactory.getCurrentSession();
		}
		return null;
	}
	
	@Override
	public _04_EmployeeVO findById(Integer user_id) {
		return (_04_EmployeeVO) getSession().get(_04_EmployeeVO.class, user_id);
	}
	@Override
	public List<_04_EmployeeVO> getAll() {
		return getSession().createQuery("from _04_EmployeeVO").list();
	}
	@Override
	public void insert(_04_EmployeeVO employeeVO){
		getSession().save(employeeVO);			
	}
	@Override
	public void update(_04_EmployeeVO employeeVO){
		getSession().update(employeeVO);
	}
	@Override
	public void delete(Integer user_id){
		_04_EmployeeVO employeeVO = new _04_EmployeeVO();
		employeeVO.setUser_id(user_id);
		getSession().delete(employeeVO);
	}
	
	
	public static void main(String[] args) {
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			_04_EmployeeDAO dao=new _04_EmployeeDAO();
			_04_EmployeeVO bean=new _04_EmployeeVO();
//			System.out.println(dao.getAll());
//			System.out.println(dao.findById(1));
			
			//Insert
//		    bean.setUser_id(998);		    
//		    bean.setC_name("JY");
//		    bean.setName("JIMMY");
//		    bean.setComp_id("CO99999999");
//		    bean.setEmail("xxx@xxx.com");
//		    bean.setTitle("專案經理");
//		    bean.setLevel(2);
//		    _01_OrganizationVO ovo=new _01_OrganizationVO();
//		    ovo.setOrg_id("DEP0001");
//		    bean.setOrganizationVO(ovo);
//		    _02_Employee_StatusVO svo=new _02_Employee_StatusVO();
//		    svo.setStatus_no(1);
//		    bean.setEmployee_StatusVO(svo);
//		    _03_JobVO jvo=new _03_JobVO();
//		    jvo.setJob_no(1);
//		    bean.setJobVO(jvo);   
//		    dao.insert(bean);
			
			//Update
//			bean.setUser_id(998);
//			bean.setName("KITTY");
//			_01_OrganizationVO ovo=new _01_OrganizationVO();
//			ovo.setOrg_id("DEP0002");
//			bean.setOrganizationVO(ovo);
//			bean.setLevel(1);
//			dao.update(bean);
			
			//Delete
			dao.delete(998);
			
			
			
			
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
	}
}
