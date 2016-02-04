package module.model;

import java.util.HashSet;
import java.util.Set;

public class _03_JobVO implements java.io.Serializable{
	private Integer job_no;
	private String job_name;
	private Set<_04_EmployeeVO> emps =new HashSet<_04_EmployeeVO>();
	
	public String toString(){
		return job_no+","+job_name;
	}
	
	public Integer getJob_no() {
		return job_no;
	}
	public void setJob_no(Integer job_no) {
		this.job_no = job_no;
	}
	public String getJob_name() {
		return job_name;
	}
	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}
	public Set<_04_EmployeeVO> getEmps() {
		return emps;
	}
	public void setEmps(Set<_04_EmployeeVO> emps) {
		this.emps = emps;
	}
	

}
