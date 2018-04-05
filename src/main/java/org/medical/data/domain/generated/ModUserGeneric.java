/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_user")
public class ModUserGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "userid")
    private Integer userid;
    @Column(name = "userloginid")
    private String userloginid;
    @Basic(optional = false)
    @Column(name = "pw")
    private String pw;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Column(name = "requestpwchange")
    @Temporal(TemporalType.DATE)
    private Date requestpwchange;
    @Column(name = "nbroflogins")
    private Integer nbroflogins;
    @Column(name = "nbroffailedlogins")
    private Integer nbroffailedlogins;
    @Column(name = "lastlogin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastlogin;
    @Column(name = "expiration")
    @Temporal(TemporalType.DATE)
    private Date expiration;
    @Basic(optional = false)
    @Column(name = "locked",columnDefinition="enum('y','n')")
    private String locked;
    @Column(name = "lockdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lockdate;
    @Column(name = "lockreason")
    private String lockreason;
    @Column(name = "dateofbirth")
    @Temporal(TemporalType.DATE)
    private Date dateofbirth;
    @Column(name = "pwchangemessage")
    private String pwchangemessage;
    @Column(name = "firstlogin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date firstlogin;
    @Column(name = "externaluserid")
    private String externaluserid;
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Column(name = "lastfailedlogin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastfailedlogin;
    @Column(name = "salt")
    private String salt;
    @JoinColumn(name = "langid", referencedColumnName = "langid")
    @ManyToOne
    private ModLang langid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userid")
    private List<ModStaff> modStaffList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modUser")
    private List<ModApplicationfielddata> modApplicationfielddataList;
  
    public ModUserGeneric() {
    }

    public ModUserGeneric(Integer userid) {
        this.userid = userid;
    }

    public ModUserGeneric(Integer userid, String pw, String email, String locked) {
        this.userid = userid;
        this.pw = pw;
        this.email = email;
        this.locked = locked;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserloginid() {
        return userloginid;
    }

    public void setUserloginid(String userloginid) {
        this.userloginid = userloginid;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
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

    public Date getRequestpwchange() {
        return requestpwchange;
    }

    public void setRequestpwchange(Date requestpwchange) {
        this.requestpwchange = requestpwchange;
    }

    public Integer getNbroflogins() {
        return nbroflogins;
    }

    public void setNbroflogins(Integer nbroflogins) {
        this.nbroflogins = nbroflogins;
    }

    public Integer getNbroffailedlogins() {
        return nbroffailedlogins;
    }

    public void setNbroffailedlogins(Integer nbroffailedlogins) {
        this.nbroffailedlogins = nbroffailedlogins;
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

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
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

    public String getPwchangemessage() {
        return pwchangemessage;
    }

    public void setPwchangemessage(String pwchangemessage) {
        this.pwchangemessage = pwchangemessage;
    }

    public Date getFirstlogin() {
        return firstlogin;
    }

    public void setFirstlogin(Date firstlogin) {
        this.firstlogin = firstlogin;
    }

    public String getExternaluserid() {
        return externaluserid;
    }

    public void setExternaluserid(String externaluserid) {
        this.externaluserid = externaluserid;
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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public ModLang getLangid() {
        return langid;
    }

    public void setLangid(ModLang langid) {
        this.langid = langid;
    }

    public List<ModStaff> getModStaffList() {
        return modStaffList;
    }

    public void setModStaffList(List<ModStaff> modStaffList) {
        this.modStaffList = modStaffList;
    }

    public List<ModApplicationfielddata> getModApplicationfielddataList() {
		return modApplicationfielddataList;
	}

	public void setModApplicationfielddataList(List<ModApplicationfielddata> modApplicationfielddataList) {
		this.modApplicationfielddataList = modApplicationfielddataList;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (userid != null ? userid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModUserGeneric)) {
            return false;
        }
        ModUserGeneric other = (ModUserGeneric) object;
        if ((this.userid == null && other.userid != null) || (this.userid != null && !this.userid.equals(other.userid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModUser[ userid=" + userid + " ]";
    }
    
}
