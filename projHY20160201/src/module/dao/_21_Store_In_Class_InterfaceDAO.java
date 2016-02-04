package module.dao;

import java.util.List;

import module.model._06_Store_ClassVO;
import module.model._21_Store_In_ClassVO;



public interface _21_Store_In_Class_InterfaceDAO {
	 public void insert(_21_Store_In_ClassVO store_in_classVO);
     public void update(_21_Store_In_ClassVO store_in_classVO);
     public void delete(Integer no);
  	 public _21_Store_In_ClassVO findById(Integer no);
 	 public List<_21_Store_In_ClassVO> getAll();
	
}
