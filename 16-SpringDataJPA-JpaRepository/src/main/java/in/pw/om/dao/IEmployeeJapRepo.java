package in.pw.om.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.pw.om.bean.Employee;
import jakarta.transaction.Transactional;

public interface IEmployeeJapRepo extends JpaRepository<Employee, Integer> {
	
	// findBy --> custom queries
	public List<Employee> findByEmpsal(Integer sal);
	

	@Query("FROM Employee e WHERE e.empid= :id")
	public Optional<Employee> fetchEmployeeById(Integer id);
	
	@Query("FROM Employee")
	public List<Employee> fetchAllEmp();
	
	@Query("UPDATE Employee e SET e.empsal = e.empsal + 10 WHERE e.empid = :id ")
	@Modifying
	@Transactional
	public int updateEmp(@Param("id") Integer id);
}

