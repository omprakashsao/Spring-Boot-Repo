package in.pw.om.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pw.om.bean.Student;

public interface IEmployeeJapRepo extends JpaRepository<Student, Integer> {
	

}

