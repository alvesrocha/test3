package org.medical.data.domain.dto;

import java.io.Serializable;
import java.util.List;

public class ProfileDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long profileid;
	private int profilelevel;
	private boolean	 hidden;
	private boolean permanent;
	private boolean enabled;
	private boolean valid;
	private List<FunctionDTO> functionList;
	
	public long getProfileid() {
		return profileid;
	}
	public void setProfileid(long profileid) {
		this.profileid = profileid;
	}
	public int getProfilelevel() {
		return profilelevel;
	}
	public void setProfilelevel(int profilelevel) {
		this.profilelevel = profilelevel;
	}
	public boolean isHidden() {
		return hidden;
	}
	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}
	public boolean isPermanent() {
		return permanent;
	}
	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public List<FunctionDTO> getFunctionList() {
		return functionList;
	}
	public void setFunctionList(List<FunctionDTO> functionList) {
		this.functionList = functionList;
	}

}
