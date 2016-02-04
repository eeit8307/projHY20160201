package module.model;

import java.util.HashSet;
import java.util.Set;

public class _10_Class_SecondVO {
	private Integer class2_no;  //PK
	private String class2_name;
//	private Integer class1_no; //FK
	private _09_Class_FirstVO class_FirstVO;
	private Set<_11_Class_ThirdVO> class_Thirds = new HashSet<_11_Class_ThirdVO>();
	
	
	
	
	public Integer getClass2_no() {
		return class2_no;
	}
	public void setClass2_no(Integer class2_no) {
		this.class2_no = class2_no;
	}
	public String getClass2_name() {
		return class2_name;
	}
	public void setClass2_name(String class2_name) {
		this.class2_name = class2_name;
	}
	public _09_Class_FirstVO getClass_FirstVO() {
		return class_FirstVO;
	}
	public void setClass_FirstVO(_09_Class_FirstVO class_FirstVO) {
		this.class_FirstVO = class_FirstVO;
	}
	public Set<_11_Class_ThirdVO> getClass_Thirds() {
		return class_Thirds;
	}
	public void setClass_Thirds(Set<_11_Class_ThirdVO> class_Thirds) {
		this.class_Thirds = class_Thirds;
	}
	@Override
	public String toString() {
		return "Class_SecondVO [class2_no=" + class2_no + ", class2_name=" + class2_name + ", class_FirstVO="
				+ class_FirstVO + ", class_Thirds=" + class_Thirds + "]";
	}
	
	

	

	
	
}
