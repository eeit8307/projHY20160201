package module.dao;

import java.util.List;

import module.model._14_SizeVO;

public interface _14_Size_InterfaceDAO {
	public void insert(_14_SizeVO sizeVO);
	public void update(_14_SizeVO sizeVO);
	public void delete(Integer size_no);
	public _14_SizeVO findByPK(Integer size_no);
	public List<_14_SizeVO> getAll();
		
}