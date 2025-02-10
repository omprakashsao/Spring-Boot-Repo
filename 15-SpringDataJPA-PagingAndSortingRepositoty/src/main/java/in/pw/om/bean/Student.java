package in.pw.om.bean;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer sid;
	private String sname;
	private Integer sage;
	private String saddress;
	
	public Student() {
		
	}
	
	public Student(Integer sid,String saddress, Integer sage, String sname) {
		this.sid = sid;
		this.saddress = saddress;
		this.sage = sage;
		this.sname = sname;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", saddress=" + saddress + ", sage=" + sage + ", sname=" + sname + "]";
	}
	
	

}
