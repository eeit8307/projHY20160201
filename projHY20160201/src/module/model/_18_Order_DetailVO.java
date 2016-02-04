package module.model;

import org.hibernate.Session;

import module.util.HibernateUtil;




public class _18_Order_DetailVO implements java.io.Serializable{
	
	private Integer detail_no;
	private _17_Group_UserVO group_userVO; //�h��@	group_user_no	
//	private Integer group_user_no;
	private String ostore_name;
	private Integer oprice_no;	
	private String oitem_name;	
	private byte[] oimage;
	private Double oprice;	
	private Double oprice_after;	
	private String oclass;
	private String ps;
	private Integer quantity;
	private String pay_status;
	private String take_status;
	
	public static void main(String[] arg){
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
			
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			//select
			_18_Order_DetailVO bean = (_18_Order_DetailVO) session.get(_18_Order_DetailVO.class, 2);
			System.out.println(bean);
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally{
			HibernateUtil.closeSessionFactory();
		}
		
	}
	
	@Override
	public String toString() {
		return  detail_no + "," + group_userVO+ "," + ostore_name+ "," 
	            +oprice_no+ ","+oitem_name+","+oimage+","+oprice+","+oprice_after+","
				+oclass+","+ps+","+quantity+","+pay_status+","+take_status;
	}

	public Integer getDetail_no() {
		return detail_no;
	}

	public void setDetail_no(Integer detail_no) {
		this.detail_no = detail_no;
	}

	public _17_Group_UserVO getGroup_userVO() {
		return group_userVO;
	}

	public void setGroup_userVO(_17_Group_UserVO group_userVO) {
		this.group_userVO = group_userVO;
	}

	public String getOstore_name() {
		return ostore_name;
	}

	public void setOstore_name(String ostore_name) {
		this.ostore_name = ostore_name;
	}

	public Integer getOprice_no() {
		return oprice_no;
	}

	public void setOprice_no(Integer oprice_no) {
		this.oprice_no = oprice_no;
	}

	public String getOitem_name() {
		return oitem_name;
	}

	public void setOitem_name(String oitem_name) {
		this.oitem_name = oitem_name;
	}

	public byte[] getOimage() {
		return oimage;
	}

	public void setOimage(byte[] oimage) {
		this.oimage = oimage;
	}

	public Double getOprice() {
		return oprice;
	}

	public void setOprice(Double oprice) {
		this.oprice = oprice;
	}

	public Double getOprice_after() {
		return oprice_after;
	}

	public void setOprice_after(Double oprice_after) {
		this.oprice_after = oprice_after;
	}

	public String getOclass() {
		return oclass;
	}

	public void setOclass(String oclass) {
		this.oclass = oclass;
	}

	public String getPs() {
		return ps;
	}

	public void setPs(String ps) {
		this.ps = ps;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getPay_status() {
		return pay_status;
	}

	public void setPay_status(String pay_status) {
		this.pay_status = pay_status;
	}

	public String getTake_status() {
		return take_status;
	}

	public void setTake_status(String take_status) {
		this.take_status = take_status;
	}

	
	
	
	


	


}
