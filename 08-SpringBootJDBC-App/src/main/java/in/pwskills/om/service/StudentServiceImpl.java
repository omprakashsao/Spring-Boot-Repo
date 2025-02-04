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
	public StudentDTO getStudentById(Integer sid) {
		// TODO Auto-generated method stub
		
		StudentBO bo = dao.getStudentById(sid);
		StudentDTO dto = new StudentDTO();
		
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}


	@Override
	public List<StudentBO> getAllStudent() {
		ArrayList<StudentDTO> listdto = new ArrayList<>();
		List<StudentBO> list = dao.getAllStudent();
		StudentDTO dto = new StudentDTO();
		
		list.forEach(bo->{
			BeanUtils.copyProperties(bo, dto);
			listdto.add(dto);
			
		});	
		return list;
	}


	@Override
	public List<StudentBO> getStudentByAddress(String address1, String address2) {
		ArrayList<StudentDTO> listdto = new ArrayList<>();
		List<StudentBO> list = dao.getStudentByAddress(address1, address2);
		StudentDTO dto = new StudentDTO();
		
		list.forEach(bo->{
			BeanUtils.copyProperties(bo, dto);
			listdto.add(dto);
			
		});	
		return list;
	}

}
