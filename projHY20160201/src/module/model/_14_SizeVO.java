package module.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import module.util.HibernateUtil;

public class _14_SizeVO implements Serializable {
	private Integer size_no;
	private String size_name;
	
	private Set<_15_Item_PriceVO> item_prices=new HashSet<_15_Item_PriceVO>();
	
	public static void main(String args[]){		
		try {
			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
			Session session=HibernateUtil.getSessionFactory().getCurrentSession();
			_14_SizeVO bean=(_14_SizeVO)session.get(_14_SizeVO.class, 1);
			System.out.println(bean);
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		} finally{
			HibernateUtil.closeSessionFactory();
		}
	}

	public Integer getSize_no() {
		return size_no;
	}

	public void setSize_no(Integer size_no) {
		this.size_no = size_no;
	}

	public String getSize_name() {
		return size_name;
	}

	public void setSize_name(String size_name) {
		this.size_name = size_name;
	}

	public Set<_15_Item_PriceVO> getItem_prices() {
		return item_prices;
	}

	public void setItem_prices(Set<_15_Item_PriceVO> item_prices) {
		this.item_prices = item_prices;
	}

	@Override
	public String toString() {
		return "_14_SizeVO [size_no=" + size_no + ", size_name=" + size_name + "]";
	}

	
	
	
	

	
	
}
