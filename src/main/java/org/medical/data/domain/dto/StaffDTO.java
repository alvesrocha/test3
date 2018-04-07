package org.medical.data.domain.dto;

import java.io.Serializable;
import java.util.List;

public class StaffDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long staffid;
    private String externaluserid;
    private String phone1;
    private String phone2;
    private String academicrank;
    private String title;
    private String activated;
    private long deptid;
    private List<ProfileDTO> profileList;
    private List<FieldDataDTO> staffFieldDataList;
    
	public long getStaffid() {
		return staffid;
	}
	public void setStaffid(long staffid) {
		this.staffid = staffid;
	}
	public String getExternaluserid() {
		return externaluserid;
	}
	public void setExternaluserid(String externaluserid) {
		this.externaluserid = externaluserid;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getAcademicrank() {
		return academicrank;
	}
	public void setAcademicrank(String academicrank) {
		this.academicrank = academicrank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getActivated() {
		return activated;
	}
	public void setActivated(String activated) {
		this.activated = activated;
	}
	public long getDeptid() {
		return deptid;
	}
	public void setDeptid(long deptid) {
		this.deptid = deptid;
	}
	public List<ProfileDTO> getProfileList() {
		return profileList;
	}
	
	public void setProfileList(List<ProfileDTO> profileList) {
		this.profileList = profileList;
	}
	
	public List<FieldDataDTO> getStaffFieldDataList() {
		return staffFieldDataList;
	}
	public void setStaffFieldDataList(List<FieldDataDTO> staffFieldDataList) {
		this.staffFieldDataList = staffFieldDataList;
	}

}
