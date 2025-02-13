package in.pw.om.bean.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import in.pw.om.bean.Employee;
import in.pw.om.dao.IEmployeeJapRepo;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeJapRepo repo;
	
	
	@Override
	public void run(String... args) throws Exception {
	
		repo.findAllById(List.of(10,12)).forEach(System.out::println);
		
		Employee employee = new Employee();
//		employee.setEmpsal(300);
		employee.setEmpdept("dev");
		repo.findAll(Example.of(employee)).forEach(System.out::println);
		
		repo.findAll(Example.of(employee), Sort.by(Direction.DESC, "empsal")).forEach(System.out::println);
		
		
		repo.findByEmpsal(300).forEach(System.out::println);
		
		//hebernate  query
//		repo.fetchEmployeeById(10);
		
		System.out.println("**********************************************************");
		
		repo.fetchAllEmp().forEach(System.out::println);
		System.out.println();
		
		Optional<Employee> emp = repo.fetchEmployeeById(10);
		if(emp.isPresent()) System.out.println(emp.get());
		else System.out.println("Record not found...");
		
		repo.updateEmp(10);

}
}