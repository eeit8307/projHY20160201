package module.model;

public class _20_Favorite_DetailVO {
	private Integer detail_no;
	private _19_FavoriteVO favorite_no; 	 //fk
	private _11_Class_ThirdVO class3_no;		//fk
	private Double extra;
	
	
	
	public Integer getDetail_no() {
		return detail_no;
	}
	public void setDetail_no(Integer detail_no) {
		this.detail_no = detail_no;
	}
	public _19_FavoriteVO getFavorite_no() {
		return favorite_no;
	}
	public void setFavorite_no(_19_FavoriteVO favorite_no) {
		this.favorite_no = favorite_no;
	}
	public _11_Class_ThirdVO getClass3_no() {
		return class3_no;
	}
	public void setClass3_no(_11_Class_ThirdVO class3_no) {
		this.class3_no = class3_no;
	}
	public Double getExtra() {
		return extra;
	}
	public void setExtra(Double extra) {
		this.extra = extra;
	}
	@Override
	public String toString() {
		return "_20_Favorite_DetailVO [detail_no=" + detail_no + ", favorite_no=" + favorite_no + ", class3_no="
				+ class3_no + ", extra=" + extra + "]";
	}	
	
	
}
