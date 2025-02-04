package in.pwskills.om.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import in.pwskills.om.beans.StudentBO;

@Repository
public class StudentDaoImpl implements IStudentDao {
	
	@Autowired
	private JdbcTemplate template;
	
	private static final String GET_QUERY_BY_ID = "SELECT * FROM STUDENT WHERE SID=?";
	private static final String SELECT_QUERY = "select * from student";
	private static final String SELECT_BY_ADDRESS = "select * from student where saddress in (?,?) order by sname";
		

	@Override
	public StudentBO getStudentById(Integer sid) {
		
		// TODO Auto-generated method stub
		return (StudentBO) template.queryForObject(GET_QUERY_BY_ID,(RowMapper<StudentBO>) (rs, rowNum) -> {
			// TODO Auto-generated method stub
			
			StudentBO student = new StudentBO();
			student.setSid(rs.getInt(1));
			student.setSaddress(rs.getString(2));
			student.setSage(rs.getInt(3));
			student.setSname(rs.getString(4));
			
			
			
			return student;
		},sid);
		
		
	}
	
	@Override
	public List<StudentBO> getAllStudent() {
		
		
		  return  template.query(SELECT_QUERY, (ResultSetExtractor<List<StudentBO>>) rs -> {
			// TODO Auto-generated method stub
			
			ArrayList<StudentBO> list = new ArrayList<>();
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
		public List<StudentBO> getStudentByAddress(String address1,String address2){
			
			ArrayList<StudentBO> list = new ArrayList<>();
			
			template.query(SELECT_BY_ADDRESS, new RowCallbackHandler() {
				
				

				@Override
				public void processRow(ResultSet rs) throws SQLException {
					
					StudentBO student = new StudentBO();
					student.setSid(rs.getInt(1));
					student.setSaddress(rs.getString(2));
					student.setSage(rs.getInt(3));
					student.setSname(rs.getString(4));
					
					list.add(student);
					
				}
				
			}, address1,address2);
			return list;
			
		}

}
