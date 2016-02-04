package module.model;

import java.util.HashSet;
import java.util.Set;

public class _09_Class_FirstVO  implements java.io.Serializable{
	
	private Integer class1_no;  //PK
	private String class1_name;
	private Set<_10_Class_SecondVO> class_Seconds = new HashSet<_10_Class_SecondVO>();
	private Set<_12_ItemVO> itemVOs = new HashSet<_12_ItemVO>();
	
	public Integer getClass1_no() {
		return class1_no;
	}
	public void setClass1_no(Integer class1_no) {
		this.class1_no = class1_no;
	}
	public String getClass1_name() {
		return class1_name;
	}
	public void setClass1_name(String class1_name) {
		this.class1_name = class1_name;
	}
	public Set<_10_Class_SecondVO> getClass_Seconds() {
		return class_Seconds;
	}
	public void setClass_Seconds(Set<_10_Class_SecondVO> class_Seconds) {
		this.class_Seconds = class_Seconds;
	}
	public Set<_12_ItemVO> getItemVOs() {
		return itemVOs;
	}
	public void setItemVOs(Set<_12_ItemVO> itemVOs) {
		this.itemVOs = itemVOs;
	}
	
	
	
	
	

	
	
}
