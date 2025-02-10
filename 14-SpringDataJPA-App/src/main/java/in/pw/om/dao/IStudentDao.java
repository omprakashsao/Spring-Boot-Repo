package in.pw.om.dao;

import org.springframework.data.repository.CrudRepository;

import in.pw.om.bean.Student;

public interface IStudentDao extends CrudRepository<Student, Integer> {
	// method are created automatically using dynamic proxy classes concept
}
