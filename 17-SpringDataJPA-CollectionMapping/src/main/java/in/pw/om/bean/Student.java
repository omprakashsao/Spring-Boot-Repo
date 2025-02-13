package in.pw.om.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.annotations.Collate;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="student_tab")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;
	private String sname;
	private Integer sage;
	
	@ElementCollection
	@CollectionTable(name = "friends_tab" , joinColumns = @JoinColumn(name="sid_Fk"))
	@OrderColumn(name="position")
	@Column(name="friends")
	private List<String> friends;
	
	@ElementCollection
	@CollectionTable(name = "phNo_tab" , joinColumns = @JoinColumn(name="sid_Fk"))
	@Column(name="phoneNo")
	private Set<Integer> phNo;
	
	@ElementCollection
	@CollectionTable(name = "account_tab" , joinColumns = @JoinColumn(name="sid_Fk"))
	@MapKeyColumn(name="key_acc")
	private Map<String, String> account;
	
	

	public Student(String sname, Integer sage, List<String> friends, Set<Integer> phNo,Map<String, String> account) {
		
		this.sname = sname;
		this.sage = sage;
		this.friends = friends;
		this.phNo = phNo;
		this.account = account;
	}



	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getSage() {
		return sage;
	}

	public void setSage(Integer  sage) {
		this.sage = sage;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Set<Integer> getPhNo() {
		return phNo;
	}

	public void setPhNo(Set<Integer> phNo) {
		this.phNo = phNo;
	}

	public Map<String, String> getAccount() {
		return account;
	}

	public void setAccount(Map<String, String> account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", friends=" + friends + ", phNo=" + phNo
				+ ", account=" + account + "]";
	}
	
	
}
