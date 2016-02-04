package module.dao;

import java.util.List;

import module.model._18_Order_DetailVO;

public interface _18_Order_Detail_InterfaceDAO {
	
	public void insert(_18_Order_DetailVO order_DetailVO);
	public void update(_18_Order_DetailVO order_DetailVO);
	public void delete(Integer detail_no);
	public _18_Order_DetailVO findById(Integer detail_no);
	public List<_18_Order_DetailVO> getAll();
}
