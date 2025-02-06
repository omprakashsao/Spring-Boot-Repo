package in.pwskills.om.dao;

import java.util.List;

import in.pwskills.om.beans.StudentBO;
import in.pwskills.om.beans.StudentDTO;

public interface IStudentDao {
	
	public StudentBO getStudentById(Integer sid);
	public List<StudentBO> getAllStudent();
	public List<StudentBO> getStudentByAddress(String address1,String address2);
	public void registerStudent(StudentBO bo);
	

}
