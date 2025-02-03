package in.ops.om.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ops.om.beans.Employee;

@Component
public class RunnerApp implements CommandLineRunner {
	
	@Autowired
	private Employee emp;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(emp);
		 System.out.println(args);
		
	}
	

}
