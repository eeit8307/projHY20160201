package module.model;

public class _05_AdminVO implements java.io.Serializable{
	private Integer admin_no;
	private _04_EmployeeVO employeeVO;
	private String auth;
	
	public String toString(){
		return admin_no+","+auth+","+employeeVO.getUser_id();
	}
	
	public Integer getAdmin_no() {
		return admin_no;
	}
	public void setAdmin_no(Integer admin_no) {
		this.admin_no = admin_no;
	}
	public _04_EmployeeVO getEmployeeVO() {
		return employeeVO;
	}
	public void setEmployeeVO(_04_EmployeeVO employeeVO) {
		this.employeeVO = employeeVO;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	
	
	

//	public static void main(String[] args) {}
}
