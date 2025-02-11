package in.pw.om.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import in.pw.om.bean.Employee;

public interface IEmployeePagingAndSortingRepo extends PagingAndSortingRepository<Employee, Integer> {

}
