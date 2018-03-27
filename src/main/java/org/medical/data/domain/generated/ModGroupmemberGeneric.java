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
@Table(name = "mod_groupmember")
public class ModGroupmemberGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "groupmemberid")
    private Integer groupmemberid;
    @Basic(optional = false)
    @Column(name = "created")
    @Temporal(TemporalType.DATE)
    private Date created;
    @JoinColumn(name = "permissiongroupid", referencedColumnName = "permissiongroupid")
    @ManyToOne(optional = false)
    private ModPermissiongroup permissiongroupid;
    @JoinColumn(name = "staffid", referencedColumnName = "staffid")
    @ManyToOne(optional = false)
    private ModStaff staffid;
    @JoinColumn(name = "createdby", referencedColumnName = "userid")
    @ManyToOne(optional = false)
    private ModUser createdby;

    public ModGroupmemberGeneric() {
    }

    public ModGroupmemberGeneric(Integer groupmemberid) {
        this.groupmemberid = groupmemberid;
    }

    public ModGroupmemberGeneric(Integer groupmemberid, Date created) {
        this.groupmemberid = groupmemberid;
        this.created = created;
    }

    public Integer getGroupmemberid() {
        return groupmemberid;
    }

    public void setGroupmemberid(Integer groupmemberid) {
        this.groupmemberid = groupmemberid;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public ModPermissiongroup getPermissiongroupid() {
        return permissiongroupid;
    }

    public void setPermissiongroupid(ModPermissiongroup permissiongroupid) {
        this.permissiongroupid = permissiongroupid;
    }

    public ModStaff getStaffid() {
        return staffid;
    }

    public void setStaffid(ModStaff staffid) {
        this.staffid = staffid;
    }

    public ModUser getCreatedby() {
        return createdby;
    }

    public void setCreatedby(ModUser createdby) {
        this.createdby = createdby;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupmemberid != null ? groupmemberid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModGroupmemberGeneric)) {
            return false;
        }
        ModGroupmemberGeneric other = (ModGroupmemberGeneric) object;
        if ((this.groupmemberid == null && other.groupmemberid != null) || (this.groupmemberid != null && !this.groupmemberid.equals(other.groupmemberid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModGroupmember[ groupmemberid=" + groupmemberid + " ]";
    }
    
}
