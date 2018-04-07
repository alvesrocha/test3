package org.medical.data.domain.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class UserDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
    private long userid;
    private String userloginid;
    private String firstname;
    private String lastname;
    private String email;
    private Date lastlogin;
    private Date expiration;
    private boolean locked;
    private Date lockdate;
    private String lockreason;
    private Date dateofbirth;
    private Date firstlogin;
    private Date created;
    private Date lastfailedlogin;
    private long langid;
    private List<StaffDTO> staffList;
    private List<FieldDataDTO> userFieldDataList;
    
    
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getUserloginid() {
		return userloginid;
	}
	public void setUserloginid(String userloginid) {
		this.userloginid = userloginid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getLastlogin() {
		return lastlogin;
	}
	public void setLastlogin(Date lastlogin) {
		this.lastlogin = lastlogin;
	}
	public Date getExpiration() {
		return expiration;
	}
	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	public Date getLockdate() {
		return lockdate;
	}
	public void setLockdate(Date lockdate) {
		this.lockdate = lockdate;
	}
	public String getLockreason() {
		return lockreason;
	}
	public void setLockreason(String lockreason) {
		this.lockreason = lockreason;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public Date getFirstlogin() {
		return firstlogin;
	}
	public void setFirstlogin(Date firstlogin) {
		this.firstlogin = firstlogin;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getLastfailedlogin() {
		return lastfailedlogin;
	}
	public void setLastfailedlogin(Date lastfailedlogin) {
		this.lastfailedlogin = lastfailedlogin;
	}
	public long getLangid() {
		return langid;
	}
	public void setLangid(long langid) {
		this.langid = langid;
	}
	public List<StaffDTO> getStaffList() {
		return staffList;
	}
	public void setStaffList(List<StaffDTO> staffList) {
		this.staffList = staffList;
	}
	public List<FieldDataDTO> getUserFieldDataList() {
		return userFieldDataList;
	}
	public void setUserFieldDataList(List<FieldDataDTO> userFieldDataList) {
		this.userFieldDataList = userFieldDataList;
	}
}
