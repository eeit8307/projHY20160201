package module.model;

public class _21_Store_In_ClassVO {
	private Integer no;
	private _07_StoreVO storeVO;
	private _06_Store_ClassVO store_classVO;
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public _07_StoreVO getStoreVO() {
		return storeVO;
	}
	public void setStoreVO(_07_StoreVO storeVO) {
		this.storeVO = storeVO;
	}
	public _06_Store_ClassVO getStore_classVO() {
		return store_classVO;
	}
	public void setStore_classVO(_06_Store_ClassVO store_classVO) {
		this.store_classVO = store_classVO;
	}
	@Override
	public String toString() {
		return "_21_Store_In_ClassVO [no=" + no + ", storeVO=" + storeVO + ", store_classVO=" + store_classVO + "]";
	}
	
	
}
