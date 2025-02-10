package in.pwskills.om.service;

import java.util.List;

import in.pwskills.om.beans.ProductDTO;

public interface IProductService {
	
	public List<ProductDTO> getproductDetails(String pname1, String pname2);
	
}
