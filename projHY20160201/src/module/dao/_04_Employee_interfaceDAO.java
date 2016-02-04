package module.dao;

import java.util.List;

import module.model._04_EmployeeVO;

public interface _04_Employee_interfaceDAO {


	public _04_EmployeeVO findById(Integer user_id);

	public List<_04_EmployeeVO> getAll();

	public void insert(_04_EmployeeVO employeeVO);

	public void update(_04_EmployeeVO employeeVO);

	public void delete(Integer user_id);

}