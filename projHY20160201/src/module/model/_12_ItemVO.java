package module.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import module.util.HibernateUtil;

public class _12_ItemVO implements Serializable {
	private Integer item_no;
	private _07_StoreVO storeVO;
	private _09_Class_FirstVO class_firstVO;
//	private Integer store_no;
//	private Integer class1_no;
	private String item_name;
	private byte[] pic;
	private Set<_15_Item_PriceVO> item_prices=new HashSet<_15_Item_PriceVO>();
	private Set<_13_Item_Class_ThirdVO> item_class_thirds=new HashSet<_13_Item_Class_ThirdVO>();
	
	public static void main(String args[]){
		
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
			Session session=HibernateUtil.getSessionFactory().getCurrentSession();
			//------------------------------------------------
//			_12_ItemVO itemVo=(_12_ItemVO)session.get(_12_ItemVO.class, 1);
//			System.out.println(itemVo);
			//----------------------------
//			List<_12_ItemVO> itemVo=session.createQuery("from _12_ItemVO").list();
//			System.out.println(itemVo);
			//------------------------------
//			_12_ItemVO bean=new _12_ItemVO();
//			_07_StoreVO store=new _07_StoreVO();
//			store.setStore_no(1);
//			_09_Class_FirstVO classf=new _09_Class_FirstVO();
//			classf.setClass1_no(1);
//			bean.setClass_firstVO(classf);
//			bean.setStoreVO(store);
//			bean.setItem_name("test23456");
//			session.save(bean);
			//------------------------------
//			_12_ItemVO bean=new _12_ItemVO();
//			bean.setItem_name("update test");
//			bean.setItem_no(21);
//			session.update(bean);			
			
			//----------------------------
//			_12_ItemVO bean=new _12_ItemVO();
//			bean.setItem_no(22);
//			session.delete(bean);
			
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally{
			HibernateUtil.closeSessionFactory();
		}
	}

	public Integer getItem_no() {
		return item_no;
	}

	public void setItem_no(Integer item_no) {
		this.item_no = item_no;
	}

	public _07_StoreVO getStoreVO() {
		return storeVO;
	}

	public void setStoreVO(_07_StoreVO storeVO) {
		this.storeVO = storeVO;
	}

	public _09_Class_FirstVO getClass_firstVO() {
		return class_firstVO;
	}

	public void setClass_firstVO(_09_Class_FirstVO class_firstVO) {
		this.class_firstVO = class_firstVO;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public byte[] getPic() {
		return pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}

	public Set<_15_Item_PriceVO> getItem_prices() {
		return item_prices;
	}

	public void setItem_prices(Set<_15_Item_PriceVO> item_prices) {
		this.item_prices = item_prices;
	}

	public Set<_13_Item_Class_ThirdVO> getItem_class_thirds() {
		return item_class_thirds;
	}

	public void setItem_class_thirds(Set<_13_Item_Class_ThirdVO> item_class_thirds) {
		this.item_class_thirds = item_class_thirds;
	}

	@Override
	public String toString() {
		return "_12_ItemVO [item_no=" + item_no + ", storeVO=" + storeVO + ", class_firstVO=" + class_firstVO
				+ ", item_name=" + item_name + ", pic=" + pic + "]";
	}

	
	
	


	
	
}
