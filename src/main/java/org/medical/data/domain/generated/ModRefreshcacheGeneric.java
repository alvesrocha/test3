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
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_refreshcache")
public class ModRefreshcacheGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "tablename")
    private String tablename;
    @Basic(optional = false)
    @Column(name = "lastupdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdate;

    public ModRefreshcacheGeneric() {
    }

    public ModRefreshcacheGeneric(String tablename) {
        this.tablename = tablename;
    }

    public ModRefreshcacheGeneric(String tablename, Date lastupdate) {
        this.tablename = tablename;
        this.lastupdate = lastupdate;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tablename != null ? tablename.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModRefreshcacheGeneric)) {
            return false;
        }
        ModRefreshcacheGeneric other = (ModRefreshcacheGeneric) object;
        if ((this.tablename == null && other.tablename != null) || (this.tablename != null && !this.tablename.equals(other.tablename))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModRefreshcache[ tablename=" + tablename + " ]";
    }
    
}
