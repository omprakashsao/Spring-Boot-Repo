package in.pw.om.bean.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

import in.pw.om.bean.Employee;
import in.pw.om.dao.IEmployeePagingAndSortingRepo;

@Component
public class EmployeeRunner implements CommandLineRunner {
	
//	@Autowired
//	private IEmployeeCrudRepo repo;

	@Autowired
	private IEmployeePagingAndSortingRepo dao;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("EmployeeRunner.run()");
		
		
		/*
		repo.saveAll(
				
				Arrays.asList(
						
						new Employee(10, "sonu", 300, "DEV"),
						new Employee(11, "monu", 300, "QA"),
						new Employee(12, "radha", 300, "TEST"),
						new Employee(13, "gita", 400, "DEV"),
						new Employee(14, "rahul", 400, "QA"),
						new Employee(15, "om", 400, "TEST"),
						new Employee(16, "mohan", 500, "DEV"),
						new Employee(17, "chintu", 500, "QA"),
						new Employee(18, "ujjval", 500, "TEST")
						
						
						)
				
				);
		 */
		
		// select * from employee  order by esal  asc;
		//dao.findAll(Sort.by("empsal")).forEach(System.out::println);
		
		//select * from employee order by esal desc;
//		dao.findAll(Sort.by(Direction.DESC, "empsal")).forEach(System.out::println);
		
		//select * from employee order by esal asc, edept asc;
//		dao.findAll(Sort.by("empsal", "empdept")).forEach(System.out::println);
		
		//select * from employee order by esal asc, edept desc;
		//dao.findAll(Sort.by(Order.asc("empsal"),Order.desc("empdept"))).forEach(System.out::println);
		
		//select * from employee order by esal desc , edept desc;
		//dao.findAll(Sort.by(Order.desc("empsal"), Order.desc("empdept"))).forEach(System.out::println);
		
		
		System.out.println("******************************Paging******************************");
		
		Page<Employee> page = dao.findAll(PageRequest.of(1, 3));
		
		page.forEach(System.out::println);
		
		System.out.println("next page :: "+ page.hasNext());
		System.out.println("previous page :: "+ page.hasPrevious());
		System.out.println("Total Records :: "+ page.getTotalElements());
		System.out.println("Total pages :: "+ page.getTotalPages());
		System.out.println("Records  each page :: "+ page.getSize());
		System.out.println("is page contains records :: "+page.hasContent());
		
		
		
	
		
		
		
		
		
		
		

	}

}
