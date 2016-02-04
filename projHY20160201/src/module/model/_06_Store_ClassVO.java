package module.model;

import java.util.HashSet;
import java.util.Set;

public class _06_Store_ClassVO implements java.io.Serializable{

	
	private Set<_21_Store_In_ClassVO> store_in_classs = new HashSet<_21_Store_In_ClassVO>();	
    private Integer class_no;
    private String class_name;
    
	public Set<_21_Store_In_ClassVO> getStore_in_classs() {
		return store_in_classs;
	}
	public void setStore_in_classs(Set<_21_Store_In_ClassVO> store_in_classs) {
		this.store_in_classs = store_in_classs;
	}
	public Integer getClass_no() {
		return class_no;
	}
	public void setClass_no(Integer class_no) {
		this.class_no = class_no;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	
    
   

}
