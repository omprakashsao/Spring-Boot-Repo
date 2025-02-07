package in.pwskills.om.runner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;

import in.pwskills.om.beans.StudentBO;
import in.pwskills.om.beans.StudentDTO;
import in.pwskills.om.dao.StudentDao;
import in.pwskills.om.dao.StudentDaoImpl;
import in.pwskills.om.service.IStudentService;
import in.pwskills.om.service.StudentServiceImpl;

@Component
public class RunnerApp implements ApplicationRunner {
	
	@Autowired
	private StudentServiceImpl service;
	

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
			int noOfRecords = service.resgisterStudent(new StudentDTO("shivam", 32, "Supela Bhiali"));
			System.out.println(noOfRecords);
		
		
	}

}
