package in.pw.om.dao;

import org.springframework.data.repository.CrudRepository;

import in.pw.om.bean.Employee;

public interface IEmployeeCrudRepo extends CrudRepository<Employee, Integer> {

}
