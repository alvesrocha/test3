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
@Table(name = "mod_permissiongroup")
public class ModPermissiongroupGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "permissiongroupid")
    private Integer permissiongroupid;
    @Column(name = "groupname")
    private String groupname;
    @Basic(optional = false)
    @Column(name = "grouptype",columnDefinition="enum('U','D','C','M','S')")
    private String grouptype;
    @Basic(optional = false)
    @Column(name = "created")
    @Temporal(TemporalType.DATE)
    private Date created;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permissiongroupid")
    private List<ModDept> modDeptList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permissiongroupid")
    private List<ModClinic> modClinicList;
    @JoinColumn(name = "createdby", referencedColumnName = "userid")
    @ManyToOne
    private ModUser createdby;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permissiongroupid")
    private List<ModPatientpermission> modPatientpermissionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permissiongroupid")
    private List<ModGroupmember> modGroupmemberList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permissiongroupid")
    private List<ModModule> modModuleList;

    public ModPermissiongroupGeneric() {
    }

    public ModPermissiongroupGeneric(Integer permissiongroupid) {
        this.permissiongroupid = permissiongroupid;
    }

    public ModPermissiongroupGeneric(Integer permissiongroupid, String grouptype, Date created) {
        this.permissiongroupid = permissiongroupid;
        this.grouptype = grouptype;
        this.created = created;
    }

    public Integer getPermissiongroupid() {
        return permissiongroupid;
    }

    public void setPermissiongroupid(Integer permissiongroupid) {
        this.permissiongroupid = permissiongroupid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getGrouptype() {
        return grouptype;
    }

    public void setGrouptype(String grouptype) {
        this.grouptype = grouptype;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public List<ModDept> getModDeptList() {
        return modDeptList;
    }

    public void setModDeptList(List<ModDept> modDeptList) {
        this.modDeptList = modDeptList;
    }

    public List<ModClinic> getModClinicList() {
        return modClinicList;
    }

    public void setModClinicList(List<ModClinic> modClinicList) {
        this.modClinicList = modClinicList;
    }

    public ModUser getCreatedby() {
        return createdby;
    }

    public void setCreatedby(ModUser createdby) {
        this.createdby = createdby;
    }

    public List<ModPatientpermission> getModPatientpermissionList() {
        return modPatientpermissionList;
    }

    public void setModPatientpermissionList(List<ModPatientpermission> modPatientpermissionList) {
        this.modPatientpermissionList = modPatientpermissionList;
    }

    public List<ModGroupmember> getModGroupmemberList() {
        return modGroupmemberList;
    }

    public void setModGroupmemberList(List<ModGroupmember> modGroupmemberList) {
        this.modGroupmemberList = modGroupmemberList;
    }

    public List<ModModule> getModModuleList() {
        return modModuleList;
    }

    public void setModModuleList(List<ModModule> modModuleList) {
        this.modModuleList = modModuleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permissiongroupid != null ? permissiongroupid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModPermissiongroupGeneric)) {
            return false;
        }
        ModPermissiongroupGeneric other = (ModPermissiongroupGeneric) object;
        if ((this.permissiongroupid == null && other.permissiongroupid != null) || (this.permissiongroupid != null && !this.permissiongroupid.equals(other.permissiongroupid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModPermissiongroup[ permissiongroupid=" + permissiongroupid + " ]";
    }
    
}
