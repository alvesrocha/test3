/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_user_save")
public class ModUserSaveGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "userid")
    private Integer userid;
    @Basic(optional = false)
    @Column(name = "userloginid")
    private String userloginid;
    @Basic(optional = false)
    @Column(name = "pw")
    private String pw;
    @Column(name = "langid")
    private String langid;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Column(name = "requestpwchange")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestpwchange;
    @Column(name = "nbroflogins")
    private Integer nbroflogins;
    @Column(name = "nbroffailedlogins")
    private Integer nbroffailedlogins;
    @Column(name = "lastlogin")
    @Temporal(TemporalType.DATE)
    private Date lastlogin;
    @Column(name = "expiration")
    @Temporal(TemporalType.DATE)
    private Date expiration;
    @Basic(optional = false)
    @Column(name = "locked",columnDefinition="enum('y','n')")
    private String locked;
    @Column(name = "lockdate")
    @Temporal(TemporalType.DATE)
    private Date lockdate;
    @Column(name = "lockreason")
    private String lockreason;
    @Column(name = "dateofbirth")
    @Temporal(TemporalType.DATE)
    private Date dateofbirth;
    @Column(name = "pwchangemessage")
    private String pwchangemessage;
    @Column(name = "firstlogin")
    @Temporal(TemporalType.DATE)
    private Date firstlogin;

    public ModUserSaveGeneric() {
    }

    public ModUserSaveGeneric(Integer userid) {
        this.userid = userid;
    }

    public ModUserSaveGeneric(Integer userid, String userloginid, String pw, String email, String locked) {
        this.userid = userid;
        this.userloginid = userloginid;
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

    public String getLangid() {
        return langid;
    }

    public void setLangid(String langid) {
        this.langid = langid;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userid != null ? userid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModUserSaveGeneric)) {
            return false;
        }
        ModUserSaveGeneric other = (ModUserSaveGeneric) object;
        if ((this.userid == null && other.userid != null) || (this.userid != null && !this.userid.equals(other.userid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModUserSave[ userid=" + userid + " ]";
    }
    
}
