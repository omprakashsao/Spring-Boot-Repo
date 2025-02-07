package in.pwskills.om.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import in.pwskills.om.beans.StudentBO;

@Repository
public class StudentDaoImpl implements IStudentDao {
	
	@Autowired
	private SimpleJdbcInsert sji;
	

	@Override
	public int resgisterStudent(StudentBO bo) {
		
		sji.setTableName("student");
		sji.setColumnNames(List.of("sname","sage","saddress"));
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(bo);
		return sji.execute(param);
		
	}
	
	

}
