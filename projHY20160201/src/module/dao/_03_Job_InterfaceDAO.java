package module.dao;

import java.util.List;

import module.model._03_JobVO;

public interface _03_Job_InterfaceDAO {

	_03_JobVO findById(Integer job_no);

	List<_03_JobVO> getAll();

	void insert(_03_JobVO jobVO);

	void update(_03_JobVO jobVO);

	void delete(Integer job_no);

}