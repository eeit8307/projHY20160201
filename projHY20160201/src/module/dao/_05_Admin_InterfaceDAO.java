package module.dao;

import java.util.List;

import module.model._05_AdminVO;

public interface _05_Admin_InterfaceDAO {

	public _05_AdminVO findById(Integer admin_no);

	public List<_05_AdminVO> getAll();

	public void insert(_05_AdminVO adminVO);

	public void update(_05_AdminVO adminVO);

	public void delete(Integer admin_no);

}