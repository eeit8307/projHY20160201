package module.dao;

import java.util.List;

import module.model._01_OrganizationVO;
import module.model._19_FavoriteVO;

public interface _19_Favorite_InterfaceDAO {
	public _19_FavoriteVO findById(Integer favorite_no);
	public List<_19_FavoriteVO> getAll();
	public void insert(_19_FavoriteVO favoriteVO);
	public void update(_19_FavoriteVO favoriteVO);
	public void delete(Integer favorite_no);

}
