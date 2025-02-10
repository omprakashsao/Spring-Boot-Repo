package in.pwskills.om.dao;

import java.util.List;

import in.pwskills.om.beans.NaukriBO;

public interface IPersonDao {
	
	public void registerProfile(NaukriBO bo);
	public List<NaukriBO> getNaukriDetails();

}
