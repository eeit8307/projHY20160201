package module.model;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import module.util.HibernateUtil;

public class _01_OrganizationVO implements java.io.Serializable{
	private String org_id;
	private String org_name;
	private String discription;
	private String parent;
	private Set<_04_EmployeeVO> emps =new HashSet<_04_EmployeeVO>();


	public String getOrg_id() {
		return org_id;
	}

	public void setOrg_id(String org_id) {
		this.org_id = org_id;
	}

	public String getOrg_name() {
		return org_name;
	}

	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public Set<_04_EmployeeVO> getEmps() {
		return emps;
	}

	public void setEmps(Set<_04_EmployeeVO> emps) {
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "_01_OrganizationVO [org_id=" + org_id + ", org_name=" + org_name + ", discription=" + discription
				+ ", parent=" + parent + "]";
	}
	
//public static void main(String args[]){
//		
//		try {
//			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
//			Session session=HibernateUtil.getSessionFactory().getCurrentSession();
//			
//			_01_OrganizationVO organizationVO=(_01_OrganizationVO)session.get(_01_OrganizationVO.class, "DEP0001");
//			System.out.println(organizationVO);
//			
//			
//			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
//		} finally{
//			HibernateUtil.closeSessionFactory();
//		}
//	}
}
