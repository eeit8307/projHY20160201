package module.model;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import module.util.HibernateUtil;




public class _16_Group_RecordVO {
	private Integer group_no;		//�@��h	
	private _04_EmployeeVO employeeVO;		//�h��@	 holder

	private String group_name;	
	private _07_StoreVO storeVO;	//�h��@  group_store

	private java.util.Date start_date;
	private java.util.Date end_date;
	private String ann;
	private Double group_amount;
	private Double group_amount_after;	
	private String status;	
	private String failure;
	private String discount;
	private String shipment;
	private Set<_17_Group_UserVO> group_Users = new HashSet<_17_Group_UserVO>();//�@��h

	public static void main(String[] args) {
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
			
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//select
			_16_Group_RecordVO group_RecordVO = (_16_Group_RecordVO) session.get(_16_Group_RecordVO.class, 1);
			System.out.println(group_RecordVO);
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
	}
	
	
	
	
	public Integer getGroup_no() {
		return group_no;
	}
	public void setGroup_no(Integer group_no) {
		this.group_no = group_no;
	}
	public _04_EmployeeVO getEmployeeVO() {
		return employeeVO;
	}
	public void setEmployeeVO(_04_EmployeeVO employeeVO) {
		this.employeeVO = employeeVO;
	}
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	public _07_StoreVO getStoreVO() {
		return storeVO;
	}
	public void setStoreVO(_07_StoreVO storeVO) {
		this.storeVO = storeVO;
	}
	public java.util.Date getStart_date() {
		return start_date;
	}
	public void setStart_date(java.util.Date start_date) {
		this.start_date = start_date;
	}
	public java.util.Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(java.util.Date end_date) {
		this.end_date = end_date;
	}
	public String getAnn() {
		return ann;
	}
	public void setAnn(String ann) {
		this.ann = ann;
	}
	public Double getGroup_amount() {
		return group_amount;
	}
	public void setGroup_amount(Double group_amount) {
		this.group_amount = group_amount;
	}
	public Double getGroup_amount_after() {
		return group_amount_after;
	}
	public void setGroup_amount_after(Double group_amount_after) {
		this.group_amount_after = group_amount_after;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFailure() {
		return failure;
	}
	public void setFailure(String failure) {
		this.failure = failure;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getShipment() {
		return shipment;
	}
	public void setShipment(String shipment) {
		this.shipment = shipment;
	}
	public Set<_17_Group_UserVO> getGroup_Users() {
		return group_Users;
	}
	public void setGroup_Users(Set<_17_Group_UserVO> group_Users) {
		this.group_Users = group_Users;
	}




	@Override
	public String toString() {
		return "_16_Group_RecordVO [group_no=" + group_no + ", employeeVO=" + employeeVO + ", group_name=" + group_name
				+ ", storeVO=" + storeVO + ", start_date=" + start_date + ", end_date=" + end_date + ", ann=" + ann
				+ ", group_amount=" + group_amount + ", group_amount_after=" + group_amount_after + ", status=" + status
				+ ", failure=" + failure + ", discount=" + discount + ", shipment=" + shipment+  "]";
	}
	
	
	
	
	
	
	

	

		

}
