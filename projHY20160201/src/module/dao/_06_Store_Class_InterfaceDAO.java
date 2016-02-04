package module.dao;

import java.util.List;

import org.hibernate.Session;

import module.model._06_Store_ClassVO;



public interface _06_Store_Class_InterfaceDAO {
	 public void insert(_06_Store_ClassVO store_classVO);
     public void update(_06_Store_ClassVO store_classVO);
     public void delete(Integer class_no);
  	 public _06_Store_ClassVO findById(Integer class_no);
 	 public List<_06_Store_ClassVO> getAll();
	public Session getSession();
	
}
