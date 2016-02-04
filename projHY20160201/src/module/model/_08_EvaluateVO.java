package module.model;

import java.util.Date;

public class _08_EvaluateVO {
	private Integer e_record;
	private String rank;
	private String content;
	private Date evaluate_time;
	private _04_EmployeeVO employeeVO;
	private	_07_StoreVO storeVO;
	public Integer getE_record() {
		return e_record;
	}
	public void setE_record(Integer e_record) {
		this.e_record = e_record;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getEvaluate_time() {
		return evaluate_time;
	}
	public void setEvaluate_time(Date evaluate_time) {
		this.evaluate_time = evaluate_time;
	}
	public _04_EmployeeVO getEmployeeVO() {
		return employeeVO;
	}
	public void setEmployeeVO(_04_EmployeeVO employeeVO) {
		this.employeeVO = employeeVO;
	}
	public _07_StoreVO getStoreVO() {
		return storeVO;
	}
	public void setStoreVO(_07_StoreVO storeVO) {
		this.storeVO = storeVO;
	}
	
	
	
	


}





