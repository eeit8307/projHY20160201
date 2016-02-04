package module.dao;

import java.util.List;

import module.model._15_Item_PriceVO;

public interface _15_Item_Price_InterfaceDAO {
	public void insert(_15_Item_PriceVO item_PriceVO);
	public void update(_15_Item_PriceVO item_PriceVO);
	public void delete(Integer price_no);
	public _15_Item_PriceVO findById(Integer price_no);
	public List<_15_Item_PriceVO> getAll();

}