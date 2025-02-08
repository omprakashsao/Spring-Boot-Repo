package in.pwskills.om.runner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;

import in.pwskills.om.beans.ProductBO;
import in.pwskills.om.beans.ProductDTO;
import in.pwskills.om.beans.StudentBO;
import in.pwskills.om.beans.StudentDTO;
import in.pwskills.om.dao.StudentDao;
import in.pwskills.om.dao.ProductDaoImpl;
import in.pwskills.om.service.IProductService;
import in.pwskills.om.service.ProductServiceImpl;

@Component
public class RunnerApp implements ApplicationRunner {
	
	@Autowired
	private ProductServiceImpl service;
	
	
	
	
	

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		List<ProductDTO> list = service.getproductDetails("book", "copy");
		list.forEach(System.out::println);
	
	}
	

	

}
