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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_automaticlogin")
public class ModAutomaticloginGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "automaticloginid")
    private String automaticloginid;
    @Basic(optional = false)
    @Column(name = "createmodulesessionid")
    private String createmodulesessionid;
    @Basic(optional = false)
    @Column(name = "createserversessionid")
    private String createserversessionid;
    @Basic(optional = false)
    @Column(name = "createipaddress")
    private String createipaddress;
    @Basic(optional = false)
    @Column(name = "createdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdate;
    @Basic(optional = false)
    @Column(name = "expiredate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiredate;
    @Column(name = "loginipaddress")
    private String loginipaddress;
    @Column(name = "logindate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date logindate;
    @Column(name = "loginmodulesessionid")
    private String loginmodulesessionid;
    @Column(name = "loginserversessionid")
    private String loginserversessionid;
    @Basic(optional = false)
    @Column(name = "loginjsp")
    private String loginjsp;
    @JoinColumn(name = "createdby", referencedColumnName = "userid")
    @ManyToOne(optional = false)
    private ModUser createdby;
    @JoinColumn(name = "loginiuserid", referencedColumnName = "userid")
    @ManyToOne(optional = false)
    private ModUser loginiuserid;

    public ModAutomaticloginGeneric() {
    }

    public ModAutomaticloginGeneric(String automaticloginid) {
        this.automaticloginid = automaticloginid;
    }

    public ModAutomaticloginGeneric(String automaticloginid, String createmodulesessionid, String createserversessionid, String createipaddress, Date createdate, Date expiredate, String loginjsp) {
        this.automaticloginid = automaticloginid;
        this.createmodulesessionid = createmodulesessionid;
        this.createserversessionid = createserversessionid;
        this.createipaddress = createipaddress;
        this.createdate = createdate;
        this.expiredate = expiredate;
        this.loginjsp = loginjsp;
    }

    public String getAutomaticloginid() {
        return automaticloginid;
    }

    public void setAutomaticloginid(String automaticloginid) {
        this.automaticloginid = automaticloginid;
    }

    public String getCreatemodulesessionid() {
        return createmodulesessionid;
    }

    public void setCreatemodulesessionid(String createmodulesessionid) {
        this.createmodulesessionid = createmodulesessionid;
    }

    public String getCreateserversessionid() {
        return createserversessionid;
    }

    public void setCreateserversessionid(String createserversessionid) {
        this.createserversessionid = createserversessionid;
    }

    public String getCreateipaddress() {
        return createipaddress;
    }

    public void setCreateipaddress(String createipaddress) {
        this.createipaddress = createipaddress;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(Date expiredate) {
        this.expiredate = expiredate;
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

    public String getLoginmodulesessionid() {
        return loginmodulesessionid;
    }

    public void setLoginmodulesessionid(String loginmodulesessionid) {
        this.loginmodulesessionid = loginmodulesessionid;
    }

    public String getLoginserversessionid() {
        return loginserversessionid;
    }

    public void setLoginserversessionid(String loginserversessionid) {
        this.loginserversessionid = loginserversessionid;
    }

    public String getLoginjsp() {
        return loginjsp;
    }

    public void setLoginjsp(String loginjsp) {
        this.loginjsp = loginjsp;
    }

    public ModUser getCreatedby() {
        return createdby;
    }

    public void setCreatedby(ModUser createdby) {
        this.createdby = createdby;
    }

    public ModUser getLoginiuserid() {
        return loginiuserid;
    }

    public void setLoginiuserid(ModUser loginiuserid) {
        this.loginiuserid = loginiuserid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (automaticloginid != null ? automaticloginid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModAutomaticloginGeneric)) {
            return false;
        }
        ModAutomaticloginGeneric other = (ModAutomaticloginGeneric) object;
        if ((this.automaticloginid == null && other.automaticloginid != null) || (this.automaticloginid != null && !this.automaticloginid.equals(other.automaticloginid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModAutomaticlogin[ automaticloginid=" + automaticloginid + " ]";
    }
    
}
