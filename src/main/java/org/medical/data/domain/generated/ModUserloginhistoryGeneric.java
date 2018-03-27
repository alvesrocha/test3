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
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_userloginhistory")
public class ModUserloginhistoryGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "loginhistoryid")
    private Integer loginhistoryid;
    @Basic(optional = false)
    @Column(name = "userid")
    private int userid;
    @Column(name = "automaticloginid")
    private String automaticloginid;
    @Basic(optional = false)
    @Column(name = "modulesessionid")
    private String modulesessionid;
    @Basic(optional = false)
    @Column(name = "serversessionid")
    private String serversessionid;
    @Basic(optional = false)
    @Column(name = "loginipaddress")
    private String loginipaddress;
    @Basic(optional = false)
    @Column(name = "logindate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date logindate;
    @Lob
    @Column(name = "loginbrowser")
    private String loginbrowser;

    public ModUserloginhistoryGeneric() {
    }

    public ModUserloginhistoryGeneric(Integer loginhistoryid) {
        this.loginhistoryid = loginhistoryid;
    }

    public ModUserloginhistoryGeneric(Integer loginhistoryid, int userid, String modulesessionid, String serversessionid, String loginipaddress, Date logindate) {
        this.loginhistoryid = loginhistoryid;
        this.userid = userid;
        this.modulesessionid = modulesessionid;
        this.serversessionid = serversessionid;
        this.loginipaddress = loginipaddress;
        this.logindate = logindate;
    }

    public Integer getLoginhistoryid() {
        return loginhistoryid;
    }

    public void setLoginhistoryid(Integer loginhistoryid) {
        this.loginhistoryid = loginhistoryid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getAutomaticloginid() {
        return automaticloginid;
    }

    public void setAutomaticloginid(String automaticloginid) {
        this.automaticloginid = automaticloginid;
    }

    public String getModulesessionid() {
        return modulesessionid;
    }

    public void setModulesessionid(String modulesessionid) {
        this.modulesessionid = modulesessionid;
    }

    public String getServersessionid() {
        return serversessionid;
    }

    public void setServersessionid(String serversessionid) {
        this.serversessionid = serversessionid;
    }

    public String getLoginipaddress() {
        return loginipaddress;
    }

    public void setLoginipaddress(String loginipaddress) {
        this.loginipaddress = loginipaddress;
    }

    public Date getLogindate() {
        return logindate;
    }

    public void setLogindate(Date logindate) {
        this.logindate = logindate;
    }

    public String getLoginbrowser() {
        return loginbrowser;
    }

    public void setLoginbrowser(String loginbrowser) {
        this.loginbrowser = loginbrowser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loginhistoryid != null ? loginhistoryid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModUserloginhistoryGeneric)) {
            return false;
        }
        ModUserloginhistoryGeneric other = (ModUserloginhistoryGeneric) object;
        if ((this.loginhistoryid == null && other.loginhistoryid != null) || (this.loginhistoryid != null && !this.loginhistoryid.equals(other.loginhistoryid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModUserloginhistory[ loginhistoryid=" + loginhistoryid + " ]";
    }
    
}
