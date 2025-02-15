package in.pw.om.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.pw.om.bean.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

	@Query("SELECT e.ename, d.deptName FROM Employee e INNER JOIN e.dept d")
	List<Object[]> findEmployeeNamesWithDepartments();
	
	@Query("SELECT e.ename, d.deptName FROM Employee e LEFT OUTER JOIN e.dept d")
	List<Object[]> findEmployeeRecordsAndDepartmentIfExist();
	
	@Query("SELECT e.ename, d.deptName FROM Employee e RIGHT OUTER JOIN e.dept d")
	List<Object[]> findDepartmentRecordsAndEmployeeIfExist();
	
	@Query("SELECT e.ename, d.deptName FROM Employee e LEFT JOIN e.dept d WHERE d.deptId IS NULL")
	List<Object[]> findEmployeeAndDepartementIsNull();
	
	@Query("SELECT e.ename, d.deptName FROM Employee e RIGHT JOIN e.dept d WHERE e.eid IS NULL")
	List<Object[]> findDepartmentAndEmployeeIsNull();
	
	

}
