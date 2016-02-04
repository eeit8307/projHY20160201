package module.dao;

import java.util.List;

import module.model._12_ItemVO;

public interface _12_Item_InterfaceDAO {
	public void insert(_12_ItemVO itemVo);
	public void update(_12_ItemVO itemVo);
	public void delete(Integer item_no);
	public _12_ItemVO findById(Integer item_no);
	public List<_12_ItemVO> getAll();
}