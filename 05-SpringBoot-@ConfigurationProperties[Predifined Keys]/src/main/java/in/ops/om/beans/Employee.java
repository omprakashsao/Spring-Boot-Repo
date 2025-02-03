package in.ops.om.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "info.emp")
@Component
public class Employee {
	
	private String eName;
	private Float salary;
	
	private String[] friends;
	
	private List<String> family;
	
	private Set<String> phoneNumber;
	
	private Map<String, String> account;
	
	private Company company;

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public String[] getFriends() {
		return friends;
	}

	public void setFriends(String[] friends) {
		this.friends = friends;
	}

	public List<String> getFamily() {
		return family;
	}

	public void setFamily(List<String> family) {
		this.family = family;
	}

	public Set<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Set<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Map<String, String> getAccount() {
		return account;
	}

	public void setAccount(Map<String, String> account) {
		this.account = account;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", salary=" + salary + ", friends=" + Arrays.toString(friends) + ", family="
				+ family + ", account=" + account + ", company=" + company + "]";
	}
	
	
	

}
