package in.ops.om.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "info.emp")
public class Employee {
	
	private String ename;
	
	private Integer eage;
	
	private String eaddress;

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setEage(Integer eage) {
		this.eage = eage;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eage=" + eage + ", eaddress=" + eaddress + "]";
	}
	
	

}
