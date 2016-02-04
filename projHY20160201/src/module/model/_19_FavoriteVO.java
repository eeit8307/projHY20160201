package module.model;

import java.util.HashSet;
import java.util.Set;

public class _19_FavoriteVO {

	private Integer favorite_no;
	private String favorite_name;
	private _04_EmployeeVO employeeVO;
	private Set<_20_Favorite_DetailVO> fdvo = new HashSet<_20_Favorite_DetailVO>();
	public Integer getFavorite_no() {
		return favorite_no;
	}
	public void setFavorite_no(Integer favorite_no) {
		this.favorite_no = favorite_no;
	}
	public String getFavorite_name() {
		return favorite_name;
	}
	public void setFavorite_name(String favorite_name) {
		this.favorite_name = favorite_name;
	}
	public _04_EmployeeVO getEmployeeVO() {
		return employeeVO;
	}
	public void setEmployeeVO(_04_EmployeeVO employeeVO) {
		this.employeeVO = employeeVO;
	}
	public Set<_20_Favorite_DetailVO> getFdvo() {
		return fdvo;
	}
	public void setFdvo(Set<_20_Favorite_DetailVO> fdvo) {
		this.fdvo = fdvo;
	}
	@Override
	public String toString() {
		return "_19_FavoriteVO [favorite_no=" + favorite_no + ", favorite_name=" + favorite_name + ", employeeVO="
				+ employeeVO + "]";
	}
	
	
}
