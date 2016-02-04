package module.dao;

import java.util.List;

import module.model._17_Group_UserVO;

public interface _17_Group_User_InterfaceDAO {
	
	public void insert(_17_Group_UserVO group_UserVO);
	public void update(_17_Group_UserVO group_UserVO);
	public void delete(Integer group_user_no);
	public _17_Group_UserVO findById(Integer group_user_no);
	public List<_17_Group_UserVO> getAll(); 


}
