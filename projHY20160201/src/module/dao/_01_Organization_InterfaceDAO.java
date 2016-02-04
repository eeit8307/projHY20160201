package module.dao;

import java.util.List;

import module.model._01_OrganizationVO;

public interface _01_Organization_InterfaceDAO {

	public _01_OrganizationVO findById(String org_id);

	public List<_01_OrganizationVO> getAll();

	public void insert(_01_OrganizationVO organizationVO);

	public void update(_01_OrganizationVO organizationVO);

	public void delete(String org_id);

}
