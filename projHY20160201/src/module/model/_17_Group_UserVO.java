package module.model;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import module.util.HibernateUtil;





public class _17_Group_UserVO {
	private Integer group_user_no;	
	private _16_Group_RecordVO group_RecordVO;		//�h��@	group_no
//	private Integer group_no;
	private _04_EmployeeVO employeeVO;		//�h��@	group_user_id
//	private Integer group_user_id;
	private String group_user_name;
	private String co_holder;
	private Double user_amount;
	private Double user_amount_after;
	private java.util.Date order_time;
	private Set<_18_Order_DetailVO> order_Details = new HashSet<_18_Order_DetailVO>();	//�@��h
	
	public static void main(String[] args) {
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
			
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	//select
			_17_Group_UserVO bean = (_17_Group_UserVO) session.get(_17_Group_UserVO.class, 1);
			System.out.println(bean);
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
	}

	
	

	public Integer getGroup_user_no() {
		return group_user_no;
	}


	public void setGroup_user_no(Integer group_user_no) {
		this.group_user_no = group_user_no;
	}


	public _16_Group_RecordVO getGroup_RecordVO() {
		return group_RecordVO;
	}


	public void setGroup_RecordVO(_16_Group_RecordVO group_RecordVO) {
		this.group_RecordVO = group_RecordVO;
	}


	public _04_EmployeeVO getEmployeeVO() {
		return employeeVO;
	}


	public void setEmployeeVO(_04_EmployeeVO employeeVO) {
		this.employeeVO = employeeVO;
	}


	public String getGroup_user_name() {
		return group_user_name;
	}


	public void setGroup_user_name(String group_user_name) {
		this.group_user_name = group_user_name;
	}


	public String getCo_holder() {
		return co_holder;
	}


	public void setCo_holder(String co_holder) {
		this.co_holder = co_holder;
	}


	public Double getUser_amount() {
		return user_amount;
	}


	public void setUser_amount(Double user_amount) {
		this.user_amount = user_amount;
	}


	public Double getUser_amount_after() {
		return user_amount_after;
	}


	public void setUser_amount_after(Double user_amount_after) {
		this.user_amount_after = user_amount_after;
	}


	public java.util.Date getOrder_time() {
		return order_time;
	}


	public void setOrder_time(java.util.Date order_time) {
		this.order_time = order_time;
	}


	public Set<_18_Order_DetailVO> getOrder_Details() {
		return order_Details;
	}


	public void setOrder_Details(Set<_18_Order_DetailVO> order_Details) {
		this.order_Details = order_Details;
	}


	@Override
	public String toString() {
		return  group_user_no + "," + group_RecordVO
				+ "," + employeeVO + ", " + group_user_name + ", " + co_holder
				+ "," + user_amount + "," + user_amount_after + ", "
				+ order_time ;
	}


	


	
	
	
	
	
}
