package in.pw.om.bean.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import in.pw.om.bean.Student;
import in.pw.om.bean.exception.StudentNotFoundException;
import in.pw.om.dao.IStudentDao;

@Component
public class StudentRunner implements ApplicationRunner {

	@Autowired
	private IStudentDao dao;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
//		Student s = new Student();
//		s.setSid(1);
//		s.setSaddress("bhiali");
//		s.setSage(23);
//		s.setSname("om");
//		dao.save(s);
//		System.out.println("record is inserted..");
		
		
		
		
		//dao.saveAll(List.of(new Student(2, "mahasamund", 21, "jitesh"),new Student(3, "Bhatapara", 20, "Aaryan")));
		
//		Optional<Student> optional = dao.findById(2);
//		if(optional.isPresent()) {
//			Student student = optional.get();
//			System.out.println(student);
//		}else {
//			System.out.println("Record is not not available for given id"+ 2);
//		}

		
//		Student student = dao.findById(20).orElseThrow(()->new StudentNotFoundException("Record is not availble"));
//		System.out.println(student);
		
//		dao.findAllById(List.of(2,3)).forEach(System.out::println);
		
//		dao.findAll().forEach(System.out::println);
//		
//		long count = dao.count();
//		System.out.println(count);
		
//		dao.deleteById(2);
//		dao.deleteAll();
		
//		dao.deleteAllById(List.of(2,3));
		
		
		
		
	}

}
