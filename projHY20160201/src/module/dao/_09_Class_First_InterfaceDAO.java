package module.dao;

import java.util.List;

import module.model._09_Class_FirstVO;


public interface _09_Class_First_InterfaceDAO {	
	public void insert(_09_Class_FirstVO class_FirstVO);
	public void update(_09_Class_FirstVO class_FirstVO);
	public void delete(Integer class1_no);
	public _09_Class_FirstVO findById(Integer class1_no);
	public List<_09_Class_FirstVO> getAll();
	  	
	  	
}
