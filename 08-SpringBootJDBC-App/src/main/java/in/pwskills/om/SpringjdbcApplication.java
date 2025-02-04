package in.pwskills.om;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import in.pwskills.om.beans.StudentBO;

@SpringBootApplication
public class SpringjdbcApplication {
	

	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringjdbcApplication.class, args);
		
	              
		
	}

}
