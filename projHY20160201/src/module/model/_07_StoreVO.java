package module.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import module.util.HibernateUtil;



public class _07_StoreVO implements java.io.Serializable {
	
	private Integer store_no;
	private Set<_07_StoreVO> stores =new HashSet<_07_StoreVO>();
	private Set<_21_Store_In_ClassVO> store_in_classs = new HashSet<_21_Store_In_ClassVO>();
	private Set<_08_EvaluateVO> evaluates =new HashSet<_08_EvaluateVO>();
	private Set<_16_Group_RecordVO>  group_records =new HashSet<_16_Group_RecordVO>();
	private Set<_12_ItemVO> items =new HashSet<_12_ItemVO>();
	private String store_name;
	private String phone;
	private String address;                         
	private Date final_update;
	private _04_EmployeeVO employeeVO;
	private String public_state;
	private _07_StoreVO use_by_group;
	public Integer getStore_no() {
		return store_no;
	}
	public void setStore_no(Integer store_no) {
		this.store_no = store_no;
	}
	public Set<_21_Store_In_ClassVO> getStore_in_classs() {
		return store_in_classs;
	}
	public void setStore_in_classs(Set<_21_Store_In_ClassVO> store_in_classs) {
		this.store_in_classs = store_in_classs;
	}
	public Set<_08_EvaluateVO> getEvaluates() {
		return evaluates;
	}
	public void setEvaluates(Set<_08_EvaluateVO> evaluates) {
		this.evaluates = evaluates;
	}
	public Set<_16_Group_RecordVO> getGroup_records() {
		return group_records;
	}
	public void setGroup_records(Set<_16_Group_RecordVO> group_records) {
		this.group_records = group_records;
	}
	public Set<_12_ItemVO> getItems() {
		return items;
	}
	public void setItems(Set<_12_ItemVO> items) {
		this.items = items;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getFinal_update() {
		return final_update;
	}
	public void setFinal_update(Date final_update) {
		this.final_update = final_update;
	}
	public _04_EmployeeVO getEmployeeVO() {
		return employeeVO;
	}
	public void setEmployeeVO(_04_EmployeeVO employeeVO) {
		this.employeeVO = employeeVO;
	}
	public String getPublic_state() {
		return public_state;
	}
	public void setPublic_state(String public_state) {
		this.public_state = public_state;
	}
	public _07_StoreVO getUse_by_group() {
		return use_by_group;
	}
	public void setUse_by_group(_07_StoreVO use_by_group) {
		this.use_by_group = use_by_group;
	}
	@Override
	public String toString() {
		return "_07_StoreVO [store_no=" + store_no + ", store_name=" + store_name + ", phone=" + phone + ", address="
				+ address + ", final_update=" + final_update + ", employeeVO=" + employeeVO + ", public_state="
				+ public_state + ", use_by_group=" + use_by_group + "]";
	}
	public Set<_07_StoreVO> getStores() {
		return stores;
	}
	public void setStores(Set<_07_StoreVO> stores) {
		this.stores = stores;
	}
	
	
	
	
//	public static void main(String[] args) {
//		try {
//			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
//			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
////select
//			_07_StoreVO bean = (_07_StoreVO) session.get(_07_StoreVO.class, 1);
//			System.out.println(bean);
//			
//			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
//		} finally {
//			HibernateUtil.closeSessionFactory();
//		}
//	}


	


	
	
}
