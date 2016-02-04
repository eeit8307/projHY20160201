package module.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import module.model._07_StoreVO;
import module.model._09_Class_FirstVO;
import module.model._12_ItemVO;
import module.model._15_Item_PriceVO;
import module.util.HibernateUtil;

public class _12_ItemDAO implements _12_Item_InterfaceDAO{
	private SessionFactory sessionFactory;
	public _12_ItemDAO(){
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
			_12_ItemDAO dao=new _12_ItemDAO();
			_12_ItemVO bean=new _12_ItemVO();
			//------------------------------
//			_12_ItemDAO dao=new _12_ItemDAO();
//			System.out.println(dao.findById(2));
			//------------------------------
//			_12_ItemDAO dao=new _12_ItemDAO();
//			System.out.println(dao.getAll());
			//-----------------------------------
//			bean.setItem_name("xxxxx");			
//			_09_Class_FirstVO c1=new _09_Class_FirstVO();
//			c1.setClass1_no(2);
//			_07_StoreVO store=new _07_StoreVO();
//			store.setStore_no(2);			
//			bean.setStoreVO(store);
//			bean.setClass_firstVO(c1);
//			dao.insert(bean);
			//--------------------------------------			
//			dao.delete(21);
			//-------------------
//			bean.setItem_no(20);
//			bean.setItem_name("ttttttttt");
//			dao.update(bean);
			
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally{
			
			HibernateUtil.closeSessionFactory();;
		}
		
	}
	
	@Override
	public void insert(_12_ItemVO itemVo) {		
		getSession().save(itemVo);		
	}
	@Override
	public void update(_12_ItemVO itemVo) {
		getSession().update(itemVo);		
	}
	@Override
	public void delete(Integer item_no) {
		_12_ItemVO bean=new _12_ItemVO();
		bean.setItem_no(item_no);
		getSession().delete(bean);		
	}
	@Override
	public _12_ItemVO findById(Integer item_no) {
		return (_12_ItemVO)getSession().get(_12_ItemVO.class, item_no);		
	}
	@Override
	public List<_12_ItemVO> getAll() {
		return getSession().createQuery("from _12_ItemVO").list();
		
	}

	
	

}
