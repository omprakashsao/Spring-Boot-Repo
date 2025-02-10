package in.pwskills.om.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import in.pwskills.om.beans.ProductBO;
import in.pwskills.om.beans.ProductDTO;
import in.pwskills.om.beans.StudentBO;
import in.pwskills.om.beans.StudentDTO;
import in.pwskills.om.dao.IPersonDao;

@Service("service")
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IPersonDao dao;
	
	@Override
	public List<ProductDTO> getproductDetails(String pname1, String pname2) {
		
		ArrayList<ProductDTO> listdto = new ArrayList<>();
		
		// TODO Auto-generated method stub
		List<ProductBO> listbo = dao.getproductDetails(pname1, pname2);
		ProductDTO dto = new ProductDTO();
		listbo.forEach(bo->{
			BeanUtils.copyProperties(bo, dto);
			listdto.add(dto);
		});
		return listdto;
	}
	
	
	
	

}
