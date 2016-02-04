package module.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import module.model._04_EmployeeVO;
import module.model._07_StoreVO;
import module.model._16_Group_RecordVO;
import module.util.HibernateUtil;



public class _16_Group_RecordDAO implements _16_Group_Record_InterfaceDAO {
	private SessionFactory sessionFactory;

	public _16_Group_RecordDAO() {
		sessionFactory = HibernateUtil.getSessionFactory();
	}

	public Session getSession() {
		if (sessionFactory != null) {
			return sessionFactory.getCurrentSession();
		}
		return null;
	}

	public static void main(String[] args) {
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			_16_Group_RecordDAO dao = new _16_Group_RecordDAO();
			_16_Group_RecordVO bean = new _16_Group_RecordVO();
			//-------------------------
//			System.out.println(dao.getAll());
			//-----------------------
//			System.out.println(dao.findById(2));
			//------------------------
//			_04_EmployeeVO emp=new _04_EmployeeVO();
//			emp.setUser_id(166);
//			bean.setEmployeeVO(emp);
//			_07_StoreVO store=new _07_StoreVO();
//			store.setStore_no(6);
//			bean.setStoreVO(store);
//			bean.setGroup_name("aaa");
//			bean.setStart_date(new java.util.Date());
//			bean.setEnd_date(new java.util.Date());
//			bean.setAnn("aaaaa");
//			bean.setGroup_amount(166.0);
//			bean.setGroup_amount_after(230.0);
//			bean.setStatus("s");
//			bean.setFailure("aa");
//			bean.setDiscount("xxxxxxx");
//			bean.setShipment("qqqqqqqqqqqqq");
//			dao.insert(bean);
			//---------------------------------------
//			bean.setGroup_no(4);
//			_04_EmployeeVO emp=new _04_EmployeeVO();
//			emp.setUser_id(166);
//			bean.setEmployeeVO(emp);
//			_07_StoreVO store=new _07_StoreVO();
//			store.setStore_no(6);
//			bean.setStoreVO(store);
//			bean.setGroup_name("aaa");
//			bean.setStart_date(new java.util.Date());
//			bean.setEnd_date(new java.util.Date());
//			bean.setAnn("aaaaa");
//			bean.setGroup_amount(166.0);
//			bean.setGroup_amount_after(230.0);
//			bean.setStatus("s");
//			bean.setFailure("aa");
//			bean.setDiscount("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
//			bean.setShipment("ppppppppppppppppppppppppppppppppppppppppppppppp");			
//			dao.update(bean);
			//---------------------------
//			dao.delete(4);

			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
	}

	/*----------------------------------------------------------------------------------------------*/
	@Override
	public void insert(_16_Group_RecordVO group_RecordVO) {
		getSession().save(group_RecordVO);
	}

	/*----------------------------------------------------------------------------------------------*/
	@Override
	public void update(_16_Group_RecordVO group_RecordVO) {
		getSession().update(group_RecordVO);
	}

	/*----------------------------------------------------------------------------------------------*/
	@Override
	public void delete(Integer group_no) {
		_16_Group_RecordVO group_RecordVO = new _16_Group_RecordVO();
		group_RecordVO.setGroup_no(group_no);
		getSession().delete(group_RecordVO);
	}

	/*----------------------------------------------------------------------------------------------*/
	@Override
	public _16_Group_RecordVO findById(Integer group_no) {
		return (_16_Group_RecordVO) getSession().get(_16_Group_RecordVO.class, group_no);
	}

	/*----------------------------------------------------------------------------------------------*/
	@Override
	public List<_16_Group_RecordVO> getAll() {
		return getSession().createQuery("from _16_Group_RecordVO").list();
	}

}
