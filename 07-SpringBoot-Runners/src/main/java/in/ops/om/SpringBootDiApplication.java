package in.ops.om;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ops.om.beans.BTechThela;
import in.ops.om.beans.BillGenerate;
import in.ops.om.beans.Employee;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, JdbcTemplateAutoConfiguration.class})
public class SpringBootDiApplication {
	

	public static void main(String[] args) {
			SpringApplication.run(SpringBootDiApplication.class, args);	
	}

}
