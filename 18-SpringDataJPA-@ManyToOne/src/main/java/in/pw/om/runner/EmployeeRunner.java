package in.pw.om.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.pw.om.bean.Department;
import in.pw.om.bean.Employee;
import in.pw.om.dao.IDepartmentRepo;
import in.pw.om.dao.IEmployeeRepo;

@Component
public class EmployeeRunner implements ApplicationRunner {

	@Autowired
	private IEmployeeRepo erepo;
	
	@Autowired
	private IDepartmentRepo drepo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
	Department d1 = new Department(1, "DEV", "IT_Dev");
	Department d2 = new Department(2, "QA", "Test");
	
	drepo.save(d1);
	drepo.save(d2);
	
	Employee emp1 = new Employee(101, "Prabhas", "Mahesmati", d1);
	Employee emp2 = new Employee(102, "Ironman", "Avengers", d1);
	Employee emp3 = new Employee(103, "Howki", "DC", d2);
	
	erepo.save(emp1);
	erepo.save(emp2);
	erepo.save(emp3);
		
	
	
		

	}

}
