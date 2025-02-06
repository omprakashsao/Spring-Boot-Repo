package in.pwskills.om.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import in.pwskills.om.beans.StudentBO;

@Repository
public class StudentDaoImpl implements IStudentDao {
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private static final String GET_QUERY_BY_ID = "SELECT * FROM STUDENT WHERE SID=:studentId";
	private static final String SELECT_QUERY = "select * from student";
	private static final String SELECT_BY_ADDRESS = "select * from student where saddress in (:addr1,:addr2) order by sname";

	private static final String INSERT_QUERY_BY_OBJECT = "insert into student(`sname`,`sage`,`saddress`) values(:sname, :sage, :saddress)";
		

	@Override
	public StudentBO getStudentById(Integer sid) {
		
		Map<String, Integer> map = Map.of("studentId", 1);
		return template.queryForObject(GET_QUERY_BY_ID, map, StudentBO.class);
		
	}
	
		
		@Override
		public List<StudentBO> getStudentByAddress(String address1,String address2){
			
			MapSqlParameterSource map = new MapSqlParameterSource();
			map.addValue("addr1", address1);
			map.addValue("addr2", address2);
			
			ArrayList<StudentBO> list = new ArrayList<>();
			
			return template.query(SELECT_BY_ADDRESS, map, (ResultSetExtractor<List<StudentBO>>) rs -> {
				
				
				while(rs.next()) {
					
					StudentBO student = new StudentBO();
					student.setSid(rs.getInt(1));
					student.setSaddress(rs.getString(2));
					student.setSage(rs.getInt(3));
					student.setSname(rs.getString(4));
					
					list.add(student);
				}
				
				 
				return list;
			});
			
		}
		
		@Override
		public List<StudentBO> getAllStudent() {
			
			
			return null;
		}


		@Override
		public void registerStudent(StudentBO bo)  {
			
			template.update(INSERT_QUERY_BY_OBJECT,new BeanPropertySqlParameterSource(bo));
			
		}

}
