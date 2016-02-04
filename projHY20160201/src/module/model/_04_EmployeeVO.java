package module.model;

import java.util.HashSet;
import java.util.Set;

public class _04_EmployeeVO implements java.io.Serializable{
	private Integer user_id;	
	private String c_name;
	private String name;
	private String comp_id;	
	private String email;	
	private String title;
	private Integer level;
	private _01_OrganizationVO organizationVO;//dep_id
	private _02_Employee_StatusVO employee_StatusVO;
	private _03_JobVO jobVO;
	private Set<_05_AdminVO> adms =new HashSet<_05_AdminVO>();
	private Set<_07_StoreVO> Stores =new HashSet<_07_StoreVO>();
	private Set<_08_EvaluateVO> Evas =new HashSet<_08_EvaluateVO>();
	private Set<_16_Group_RecordVO> grs =new HashSet<_16_Group_RecordVO>();
	private Set<_17_Group_UserVO> gus =new HashSet<_17_Group_UserVO>();
	private Set<_19_FavoriteVO> fvo =new HashSet<_19_FavoriteVO>();
	
	public String toString(){
		return user_id +","+ c_name +","+
			name +","+ comp_id +","+ organizationVO.getOrg_id() +","+ 
				email +","+ employee_StatusVO.getStatus_no()+ ","+
					jobVO.getJob_no()+","+ title +","+ level;
	}

	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComp_id() {
		return comp_id;
	}
	public void setComp_id(String comp_id) {
		this.comp_id = comp_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public _01_OrganizationVO getOrganizationVO() {
		return organizationVO;
	}
	public void setOrganizationVO(_01_OrganizationVO organizationVO) {
		this.organizationVO = organizationVO;
	}
	public _02_Employee_StatusVO getEmployee_StatusVO() {
		return employee_StatusVO;
	}
	public void setEmployee_StatusVO(_02_Employee_StatusVO employee_StatusVO) {
		this.employee_StatusVO = employee_StatusVO;
	}
	public _03_JobVO getJobVO() {
		return jobVO;
	}
	public void setJobVO(_03_JobVO jobVO) {
		this.jobVO = jobVO;
	}
	public Set<_05_AdminVO> getAdms() {
		return adms;
	}
	public void setAdms(Set<_05_AdminVO> adms) {
		this.adms = adms;
	}
	public Set<_07_StoreVO> getStores() {
		return Stores;
	}
	public void setStores(Set<_07_StoreVO> stores) {
		Stores = stores;
	}
	public Set<_08_EvaluateVO> getEvas() {
		return Evas;
	}
	public void setEvas(Set<_08_EvaluateVO> evas) {
		Evas = evas;
	}
	public Set<_16_Group_RecordVO> getGrs() {
		return grs;
	}
	public void setGrs(Set<_16_Group_RecordVO> grs) {
		this.grs = grs;
	}
	public Set<_17_Group_UserVO> getGus() {
		return gus;
	}
	public void setGus(Set<_17_Group_UserVO> gus) {
		this.gus = gus;
	}
	public Set<_19_FavoriteVO> getFvo() {
		return fvo;
	}
	public void setFvo(Set<_19_FavoriteVO> fvo) {
		this.fvo = fvo;
	}
}
