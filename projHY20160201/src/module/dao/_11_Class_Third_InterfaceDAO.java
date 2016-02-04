package module.dao;

import java.util.List;

import module.model._11_Class_ThirdVO;


public interface _11_Class_Third_InterfaceDAO {
	public void insert(_11_Class_ThirdVO class_ThirdVO);
	public void update(_11_Class_ThirdVO class_ThirdVO);
	public void delete(Integer class3_no);
	public _11_Class_ThirdVO findById(Integer class3_no);
	public List<_11_Class_ThirdVO> getAll();
}
