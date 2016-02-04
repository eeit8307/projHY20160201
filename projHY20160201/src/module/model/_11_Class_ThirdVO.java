package module.model;

import java.util.HashSet;
import java.util.Set;

public class _11_Class_ThirdVO  implements java.io.Serializable{
	
	private Integer class3_no;  //PK
	private String class3_name;
//	private Integer class2_no;  //FK	
	private _10_Class_SecondVO class_SecondVO;
	private Set<_13_Item_Class_ThirdVO> Item_Class_Thirds = new HashSet<_13_Item_Class_ThirdVO>();
	private Set<_20_Favorite_DetailVO> Favorite_Details = new HashSet<_20_Favorite_DetailVO>();
	
	

	public Set<_20_Favorite_DetailVO> getFavorite_Details() {
		return Favorite_Details;
	}
	public void setFavorite_Details(Set<_20_Favorite_DetailVO> favorite_Details) {
		Favorite_Details = favorite_Details;
	}
	public Integer getClass3_no() {
		return class3_no;
	}
	public void setClass3_no(Integer class3_no) {
		this.class3_no = class3_no;
	}
	public String getClass3_name() {
		return class3_name;
	}
	public void setClass3_name(String class3_name) {
		this.class3_name = class3_name;
	}
	public _10_Class_SecondVO getClass_SecondVO() {
		return class_SecondVO;
	}
	public void setClass_SecondVO(_10_Class_SecondVO class_SecondVO) {
		this.class_SecondVO = class_SecondVO;
	}
	public Set<_13_Item_Class_ThirdVO> getItem_Class_Thirds() {
		return Item_Class_Thirds;
	}
	public void setItem_Class_Thirds(Set<_13_Item_Class_ThirdVO> item_Class_Thirds) {
		Item_Class_Thirds = item_Class_Thirds;
	}
	
	
	
	
}
