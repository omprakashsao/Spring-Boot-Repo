package in.pw.om.runner;

import java.util.Iterator;
import java.util.List;

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
		
	
		List<Object[]> emp = erepo.findEmployeeNamesWithDepartments();
		for (Object[] objects : emp) {
			for (Object obj : objects) {
				System.out.print(obj+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("****************************************************************");
		
		List<Object[]> emp1 = erepo.findEmployeeRecordsAndDepartmentIfExist();
		for (Object[] objects : emp1) {
			for (Object obj : objects) {
				System.out.print(obj+" ");
				
			}
			System.out.println();
		}
		
System.out.println("****************************************************************");
		
		List<Object[]> emp2 = erepo.findDepartmentRecordsAndEmployeeIfExist();
		for (Object[] objects : emp2) {
			for (Object obj : objects) {
				System.out.print(obj+" ");
				
			}
			System.out.println();
		}
		
System.out.println("****************************************************************");
		
		List<Object[]> emp3 = erepo.findEmployeeAndDepartementIsNull();
		for (Object[] objects : emp3) {
			for (Object obj : objects) {
				System.out.print(obj+" ");
				
			}
			System.out.println();
		}
		
System.out.println("****************************************************************");
		
		List<Object[]> emp4 = erepo.findDepartmentAndEmployeeIsNull();
		for (Object[] objects : emp4) {
			for (Object obj : objects) {
				System.out.print(obj+" ");
				
			}
			System.out.println();
		}
	
	
		

	}

}
