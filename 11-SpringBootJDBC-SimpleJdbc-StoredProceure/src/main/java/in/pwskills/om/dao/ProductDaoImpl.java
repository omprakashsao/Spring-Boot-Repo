package in.pwskills.om.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import in.pwskills.om.beans.ProductBO;

@Repository
public class ProductDaoImpl implements IProductDao {
	
	@Autowired
	private SimpleJdbcCall sjc;

	@Override
	public List<ProductBO> getproductDetails(String pname1, String pname2) {
sjc.setProcedureName("PRODUCT_DETAILS");
		
		MapSqlParameterSource map = new MapSqlParameterSource();
		map.addValue("name1", pname1);
		map.addValue("name2", pname2);
		
		
		
		sjc.returningResultSet("result", new RowMapper<ProductBO>() {
			

			@Override
			public ProductBO mapRow(ResultSet rs, int rowNum) throws SQLException {
				ProductBO bo = new ProductBO();
				bo.setPid(rs.getInt(1));
				bo.setPname(rs.getString(2));
				bo.setPrice(rs.getInt(3));
				bo.setQuantity(rs.getInt(4));
				
				
				return bo;
			}
			
		});
		
		Map<String, Object> output = sjc.execute(map);
		List<ProductBO> listbo = (List<ProductBO>) output.get("result");
		
		
		return listbo;
	}
	
	
	
	

}
