package in.pw.om.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pw.om.bean.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

}
