package in.pwskills.om.service;

import java.util.List;

import in.pwskills.om.beans.StudentBO;
import in.pwskills.om.beans.StudentDTO;

public interface IStudentService {
	public StudentDTO getStudentById(Integer sid);
	public List<StudentBO> getAllStudent();
	public List<StudentBO> getStudentByAddress(String address1,String address2);
	
}
