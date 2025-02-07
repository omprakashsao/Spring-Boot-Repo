package in.pwskills.om.cfgs;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

@Configuration

public class PersistanceConfig {

	@Bean
	public SimpleJdbcInsert getSimpleJdbc(DataSource dataSource) {
		return new SimpleJdbcInsert(dataSource);
	}
}
