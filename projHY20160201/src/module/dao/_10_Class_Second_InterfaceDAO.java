package module.dao;

import java.util.List;

import module.model._10_Class_SecondVO;

public interface _10_Class_Second_InterfaceDAO {
	public void insert(_10_Class_SecondVO class_SecondVO);
	public void update(_10_Class_SecondVO class_SecondVO);
	public void delete(Integer class2_no);
	public _10_Class_SecondVO findById(Integer class2_no);
	public List<_10_Class_SecondVO> getAll();
}
