package in.ops.om.beans;

public class Company {
	
	private String cName;
	private String cSize;
	private double netProfit;
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcSize() {
		return cSize;
	}
	public void setcSize(String cSize) {
		this.cSize = cSize;
	}
	public double getNetProfit() {
		return netProfit;
	}
	public void setNetProfit(double netProfit) {
		this.netProfit = netProfit;
	}
	@Override
	public String toString() {
		return "Company [cName=" + cName + ", cSize=" + cSize + ", netProfit=" + netProfit + "]";
	}
	
	
}
