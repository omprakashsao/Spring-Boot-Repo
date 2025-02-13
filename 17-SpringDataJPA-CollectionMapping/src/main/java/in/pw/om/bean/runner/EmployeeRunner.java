package in.pw.om.bean.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.pw.om.bean.Student;
import in.pw.om.dao.IEmployeeJapRepo;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeJapRepo repo;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		
	
		repo.save(new Student("om", 23, List.of("shivam","rahul","ankit"), Set.of(234,343), Map.of("sbi","12", "icici","343")));
		
		
	}
}