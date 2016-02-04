package module.model;

import org.hibernate.Session;

import module.util.HibernateUtil;

public class _15_Item_PriceVO {
	private Integer price_no;
	private _12_ItemVO itemVo;
	private _14_SizeVO sizeVO;

	private Double iprice;
	
	
		public static void main(String args[]){		
			try {
				HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
				Session session=HibernateUtil.getSessionFactory().getCurrentSession();
				_15_Item_PriceVO bean=(_15_Item_PriceVO)session.get(_15_Item_PriceVO.class, 500);
				System.out.println(bean);
				HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
			} finally{
				HibernateUtil.closeSessionFactory();
			}		
		}


		public Integer getPrice_no() {
			return price_no;
		}


		public void setPrice_no(Integer price_no) {
			this.price_no = price_no;
		}


		public _12_ItemVO getItemVo() {
			return itemVo;
		}


		public void setItemVo(_12_ItemVO itemVo) {
			this.itemVo = itemVo;
		}


		public _14_SizeVO getSizeVO() {
			return sizeVO;
		}


		public void setSizeVO(_14_SizeVO sizeVO) {
			this.sizeVO = sizeVO;
		}


		public Double getIprice() {
			return iprice;
		}


		public void setIprice(Double iprice) {
			this.iprice = iprice;
		}


		@Override
		public String toString() {
			return "_15_Item_PriceVO [price_no=" + price_no + ", itemVo=" + itemVo + ", sizeVO=" + sizeVO + ", iprice="
					+ iprice + "]";
		}

		

	
	
		
	
	
	
	
}
