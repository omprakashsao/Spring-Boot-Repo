package in.pw.om.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import in.pw.om.bean.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service
public class ProductServiceImpl implements IProductService{
	
	@Autowired
	private EntityManager em;

	@Override
	public List<Product> fetchProductByName(String name1, String name2) {
		// TODO Auto-generated method stub
		
		StoredProcedureQuery query = em.createStoredProcedureQuery("get_productdetails_by_name", Product.class);
		
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		
		query.setParameter(1, name1);
		query.setParameter(2, name2);
		
		List list = query.getResultList();
		
		return list;
	}


}
