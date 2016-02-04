package module.dao;

import java.util.List;

import module.model._20_Favorite_DetailVO;

public interface _20_Favorite_Detail_InterfaceDAO {

	public void insert(_20_Favorite_DetailVO favorite_detailVO);

	public void update(_20_Favorite_DetailVO favorite_detailVO);

	public void delete(Integer detail_no);

	public _20_Favorite_DetailVO findById(Integer detail_no);

	public List<_20_Favorite_DetailVO> getAll();

}
