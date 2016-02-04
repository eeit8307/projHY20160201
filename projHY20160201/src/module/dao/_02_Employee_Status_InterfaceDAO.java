package module.dao;

import java.util.List;

import module.model._02_Employee_StatusVO;

public interface _02_Employee_Status_InterfaceDAO {

	public _02_Employee_StatusVO findById(Integer status_no);

	public List<_02_Employee_StatusVO> getAll();

	public void insert(_02_Employee_StatusVO employee_StatusVO);

	public void update(_02_Employee_StatusVO employee_StatusVO);

	public void delete(Integer status_no);

}
