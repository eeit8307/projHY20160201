package module.model;

import java.io.Serializable;

public class _13_Item_Class_ThirdVO implements Serializable {
//	private Integer item_no;  //PK	//FK
//	private Integer class3_no; //PK	//FK
	private String class3_name;
	private Double extra;
	private _12_ItemVO itemVO;
	private _11_Class_ThirdVO class_ThirdVO;
	
	
	
	public String getClass3_name() {
		return class3_name;
	}
	public void setClass3_name(String class3_name) {
		this.class3_name = class3_name;
	}
	public Double getExtra() {
		return extra;
	}
	public void setExtra(Double extra) {
		this.extra = extra;
	}
	public _12_ItemVO getItemVO() {
		return itemVO;
	}
	public void setItemVO(_12_ItemVO itemVO) {
		this.itemVO = itemVO;
	}
	public _11_Class_ThirdVO getClass_ThirdVO() {
		return class_ThirdVO;
	}
	public void setClass_ThirdVO(_11_Class_ThirdVO class_ThirdVO) {
		this.class_ThirdVO = class_ThirdVO;
	}
	
	
	
	
	
}
