package in.pwskills.om.dao;

import java.util.List;

import in.pwskills.om.beans.ProductBO;
import in.pwskills.om.beans.StudentBO;

public interface IProductDao {
	
	public List<ProductBO> getproductDetails(String pname1, String pname2);
	
	

}
