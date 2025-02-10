package in.pwskills.om.beans;

import java.io.File;
import java.io.Serializable;

public class NaukriBO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer pid;
	private String pname;
	private String paddress;
	private File resume;
	private File Image;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public File getResume() {
		return resume;
	}
	public void setResume(File resume) {
		this.resume = resume;
	}
	public File getImage() {
		return Image;
	}
	public void setImage(File image) {
		Image = image;
	}
	@Override
	public String toString() {
		return "Naukri [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + ", resume=" + resume + ", Image="
				+ Image + "]";
	}
	
	
	
	

}
