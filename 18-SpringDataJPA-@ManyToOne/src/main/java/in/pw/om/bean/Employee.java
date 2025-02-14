package in.pw.om.bean;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_tab_m2o")
public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer eid;
	
	private String ename;
	
	private String eaddr;	
	
	@ManyToOne
	@JoinColumn(name="deptIdFk", referencedColumnName = "deptId")
	private Department dept;
	
	
	public Employee() {
		
	}
	public Employee(Integer eid, String ename, String eaddr, Department dept) {
		this.eid = eid;
		this.ename = ename;
		this.eaddr = eaddr;
		this.dept = dept;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEaddr() {
		return eaddr;
	}

	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddr=" + eaddr + ", dept=" + dept + "]";
	}
	
	

}
