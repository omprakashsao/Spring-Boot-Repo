package in.pwskills.om.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import in.pwskills.om.beans.StudentBO;
import in.pwskills.om.beans.StudentDTO;
import in.pwskills.om.dao.IStudentDao;

@Service("service")
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private IStudentDao dao;

	@Override
	public int resgisterStudent(StudentDTO dto) {
		
		StudentBO bo = new StudentBO();
		
		BeanUtils.copyProperties(dto, bo);
		
		
		
		return dao.resgisterStudent(bo);
	}
	
	

}
