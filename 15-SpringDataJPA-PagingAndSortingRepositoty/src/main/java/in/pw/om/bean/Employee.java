package in.pw.om.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Configurable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employeetab")
public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="eid")
	private Integer empid;
	
	@Column(name="ename")
	private String empname;
	
	@Column(name="esal")
	private Integer empsal;
	
	@Column(name="edept")
	private String empdept;
	
	public Employee() {
		
	}

	public Employee(Integer empid, String empname, Integer empsal, String empdept) {
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.empdept = empdept;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Integer getEmpsal() {
		return empsal;
	}

	public void setEmpsal(Integer empsal) {
		this.empsal = empsal;
	}

	public String getEmpdept() {
		return empdept;
	}

	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", empdept=" + empdept
				+ "]";
	}
	
	
	
	

}
