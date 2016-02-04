package module.dao;

import java.util.List;

import module.model._06_Store_ClassVO;
import module.model._08_EvaluateVO;



public interface _08_Evaluate_InterfaceDAO {
	 public void insert(_08_EvaluateVO evaluateVO);
     public void update(_08_EvaluateVO evaluateVO);
     public void delete(Integer e_record);    
     public _08_EvaluateVO findById(Integer class_no);
 	 public List<_08_EvaluateVO> getAll();
}
