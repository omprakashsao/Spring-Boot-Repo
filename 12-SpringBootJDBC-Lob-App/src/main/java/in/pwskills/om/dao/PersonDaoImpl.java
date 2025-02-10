package in.pwskills.om.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.AbstractLobCreatingPreparedStatementCallback;
import org.springframework.jdbc.support.lob.LobCreator;
import org.springframework.jdbc.support.lob.LobHandler;
import org.springframework.stereotype.Repository;
import org.springframework.util.FileCopyUtils;

import in.pwskills.om.beans.NaukriBO;

@Repository
public class PersonDaoImpl implements IPersonDao {
	
	private static final String SELECT_QUERY = "select * from person_profile";

	@Autowired 
	private JdbcTemplate template;
	
	@SuppressWarnings("deprecation")
	@Autowired 
	private LobHandler lobHandler;



	
	@SuppressWarnings("deprecation")
	@Override
	public void registerProfile(NaukriBO bo) {
		
		template.execute(
			    "INSERT INTO person_profile (`pname`, `paddress`, `resumeloc`,`photoloc`) VALUES (?, ?, ?, ?)",
			    new AbstractLobCreatingPreparedStatementCallback(lobHandler) { 
			        protected void setValues(PreparedStatement ps, LobCreator lobCreator) throws SQLException {
			           ps.setString(1, bo.getPname());
			           ps.setString(2, bo.getPaddress());
			           
			           try {
						FileInputStream stream = new FileInputStream(bo.getImage());
						FileReader reader = new FileReader(bo.getResume());   
					
						lobCreator.setClobAsCharacterStream(ps, 3, reader, (int)bo.getResume().length());
					   lobCreator.setBlobAsBinaryStream(ps, 4, stream, (int)bo.getImage().length());
					   
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			           
			           
			        }
			    }
			);
		
		
		
	}




	@Override
	public List<NaukriBO> getNaukriDetails() {
		// TODO Auto-generated method stub
		List<NaukriBO> listbo = new ArrayList<NaukriBO>();
		NaukriBO bo = new NaukriBO();
		template.query(SELECT_QUERY, new RowMapper<List<NaukriBO>>() {

			@SuppressWarnings("deprecation")
			@Override
			public List<NaukriBO> mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				
				while(rs.next()) {
					
					bo.setPid(rs.getInt(1));
					bo.setPname(rs.getString(2));
					bo.setPaddress(rs.getString(3));
					
					try {
						
						File resumeFile = new File("resume1.txt");
						FileWriter writer = new FileWriter(resumeFile);
						FileCopyUtils.copy(lobHandler.getClobAsCharacterStream(rs, 4), writer);
						bo.setResume(resumeFile);
						
						File imageFile = new File("imag1.jpg");
						FileOutputStream stream = new FileOutputStream(imageFile);				
						FileCopyUtils.copy(lobHandler.getBlobAsBinaryStream(rs, 5), stream);
						bo.setImage(imageFile);
						
						listbo.add(bo);
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				return listbo;
			}
			
		});
		return  listbo;
	}
	
	
	
	
	

}
