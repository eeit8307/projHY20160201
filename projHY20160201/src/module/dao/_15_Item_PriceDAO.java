package module.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import module.model._12_ItemVO;
import module.model._14_SizeVO;
import module.model._15_Item_PriceVO;
import module.util.HibernateUtil;

public class _15_Item_PriceDAO implements _15_Item_Price_InterfaceDAO {
	private SessionFactory sessionFactory;
	public _15_Item_PriceDAO(){
		sessionFactory=HibernateUtil.getSessionFactory();
	}
	public Session getSession(){
		if(sessionFactory!=null){
			Session session= sessionFactory.getCurrentSession();
			return session;
		}
		return null;
	}

	public static void main(String args[]){			
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
			_15_Item_PriceDAO dao=new _15_Item_PriceDAO();
			_15_Item_PriceVO bean=new _15_Item_PriceVO();
			//-----------------
//			System.out.println(dao.findById(502));
			//------------------------
//			System.out.println(dao.getAll());
			//------------------------
//			bean.setIprice(203.0);
//			_12_ItemVO item=new _12_ItemVO();
//			item.setItem_no(2);
//			_14_SizeVO size=new _14_SizeVO();
//			size.setSize_no(3);
//			bean.setItemVo(item);
//			bean.setSizeVO(size);
//			dao.insert(bean);
			//------------------
//			bean.setIprice(66666.0);
//			_12_ItemVO item=new _12_ItemVO();
//			item.setItem_no(1);
//			_14_SizeVO size=new _14_SizeVO();
//			size.setSize_no(2);
//			bean.setItemVo(item);
//			bean.setSizeVO(size);
//			dao.insert(bean);
			//---------------------
			dao.delete(528);
			
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally{
			HibernateUtil.closeSessionFactory();
		}
	}
	@Override
	public void insert(_15_Item_PriceVO item_PriceVO) {	
			getSession().save(item_PriceVO);
	}
	@Override
	public void update(_15_Item_PriceVO item_PriceVO) {	
			getSession().update(item_PriceVO);		
	}
	@Override
	public void delete(Integer price_no) {
			_15_Item_PriceVO bean=new _15_Item_PriceVO();
			bean.setPrice_no(price_no);			
			getSession().delete(bean);		
	}
	@Override
	public _15_Item_PriceVO findById(Integer price_no) {
		return (_15_Item_PriceVO)getSession().get(_15_Item_PriceVO.class, price_no);		
	}
	@Override
	public List<_15_Item_PriceVO> getAll() {
		return getSession().createQuery("from _15_Item_PriceVO").list();		
	}



}
