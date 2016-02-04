package module.model;

import java.util.HashSet;
import java.util.Set;

public class _02_Employee_StatusVO implements java.io.Serializable{
	private Integer status_no;
	private String status_name;
	private Set<_04_EmployeeVO> emps =new HashSet<_04_EmployeeVO>();
	
	public String toString(){
		return status_no +","+ status_name;
	}
	
	public Integer getStatus_no() {
		return status_no;
	}
	public void setStatus_no(Integer status_no) {
		this.status_no = status_no;
	}
	public String getStatus_name() {
		return status_name;
	}
	public void setStatus_name(String status_name) {
		this.status_name = status_name;
	}
	public Set<_04_EmployeeVO> getEmps() {
		return emps;
	}
	public void setEmps(Set<_04_EmployeeVO> emps) {
		this.emps = emps;
	}
}
