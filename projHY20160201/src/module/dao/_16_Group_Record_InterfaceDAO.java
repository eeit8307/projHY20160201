package module.dao;

import java.util.List;

import module.model._16_Group_RecordVO;

public interface _16_Group_Record_InterfaceDAO {
	
	public void insert(_16_Group_RecordVO group_RecordVO);
	public void update(_16_Group_RecordVO group_RecordVO);
	public void delete(Integer group_no);
	public _16_Group_RecordVO findById(Integer group_no);
	public List<_16_Group_RecordVO> getAll(); 

}
