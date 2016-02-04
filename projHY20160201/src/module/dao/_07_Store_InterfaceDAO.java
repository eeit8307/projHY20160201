package module.dao;

import java.util.List;

import org.hibernate.Session;

import module.model._07_StoreVO;
import module.model._09_Class_FirstVO;

public interface _07_Store_InterfaceDAO {
	 public void insert(_07_StoreVO storeVO);
     public void update(_07_StoreVO storeVO);
     public void delete(Integer store_no);
 	public _07_StoreVO findById(Integer store_no);

	public List<_07_StoreVO> getAll();
	public Session getSession();
	
}
