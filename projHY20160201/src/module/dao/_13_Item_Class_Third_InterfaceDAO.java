package module.dao;

import java.util.List;

import module.model._11_Class_ThirdVO;
import module.model._12_ItemVO;
import module.model._13_Item_Class_ThirdVO;

public interface _13_Item_Class_Third_InterfaceDAO {
	public void insert(_13_Item_Class_ThirdVO item_Class_ThirdVO);
	public void update(_13_Item_Class_ThirdVO item_Class_ThirdVO);
	public void delete(_12_ItemVO itemVO , _11_Class_ThirdVO class_ThirdVO);
	public _13_Item_Class_ThirdVO findById(_12_ItemVO itemVO , _11_Class_ThirdVO class_ThirdVO);
	public List<_13_Item_Class_ThirdVO> getAll();
}
