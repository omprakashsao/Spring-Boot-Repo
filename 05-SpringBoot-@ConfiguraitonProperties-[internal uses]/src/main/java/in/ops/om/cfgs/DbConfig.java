package in.ops.om.cfgs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class DbConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	public DataSource getConnection() {
		ComboPooledDataSource ds = new ComboPooledDataSource();
		
	    ds.setJdbcUrl(env.getProperty("spring.datasource.url"));
	    ds.setUser(env.getProperty("spring.datasource.username"));
	    ds.setPassword(env.getProperty("spring.datasource.password"));
	    
	    return ds;
		
	}

}
