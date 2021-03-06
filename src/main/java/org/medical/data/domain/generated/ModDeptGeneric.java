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

import org.medical.data.domain.source.ModClinic;
import org.medical.data.domain.source.ModPermissiongroup;
import org.medical.data.domain.source.ModUser;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_dept")
public class ModDeptGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "deptid")
    private Integer deptid;
    @Basic(optional = false)
    @Column(name = "deptname")
    private String deptname;
    @Column(name = "logo")
    private String logo;
    @Column(name = "modified")
    @Temporal(TemporalType.DATE)
    private Date modified;
    @Basic(optional = false)
    @Column(name = "patientownerpolicy",columnDefinition="enum('M','C','D','U')")
    private String patientownerpolicy;
    @Basic(optional = false)
    @Column(name = "patientdeletepolicy",columnDefinition="enum('M','C','D','U')")
    private String patientdeletepolicy;
    @Basic(optional = false)
    @Column(name = "patientwritepolicy",columnDefinition="enum('M','C','D','U')")
    private String patientwritepolicy;
    @Basic(optional = false)
    @Column(name = "patientreadpolicy",columnDefinition="enum('M','C','D','U')")
    private String patientreadpolicy;
    @Basic(optional = false)
    @Column(name = "patientlistpolicy",columnDefinition="enum('M','C','D','U')")
    private String patientlistpolicy;
    @Basic(optional = false)
    @Column(name = "usecasenumber")
    private String usecasenumber;
    @JoinColumn(name = "clinicid", referencedColumnName = "clinicid")
    @ManyToOne(optional = false)
    private ModClinic clinicid;
    @JoinColumn(name = "permissiongroupid", referencedColumnName = "permissiongroupid")
    @ManyToOne(optional = false)
    private ModPermissiongroup permissiongroupid;
    @JoinColumn(name = "modifiedby", referencedColumnName = "userid")
    @ManyToOne
    private ModUser modifiedby;

    public ModDeptGeneric() {
    }

    public ModDeptGeneric(Integer deptid) {
        this.deptid = deptid;
    }

    public ModDeptGeneric(Integer deptid, String deptname, String patientownerpolicy, String patientdeletepolicy, String patientwritepolicy, String patientreadpolicy, String patientlistpolicy, String usecasenumber) {
        this.deptid = deptid;
        this.deptname = deptname;
        this.patientownerpolicy = patientownerpolicy;
        this.patientdeletepolicy = patientdeletepolicy;
        this.patientwritepolicy = patientwritepolicy;
        this.patientreadpolicy = patientreadpolicy;
        this.patientlistpolicy = patientlistpolicy;
        this.usecasenumber = usecasenumber;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getPatientownerpolicy() {
        return patientownerpolicy;
    }

    public void setPatientownerpolicy(String patientownerpolicy) {
        this.patientownerpolicy = patientownerpolicy;
    }

    public String getPatientdeletepolicy() {
        return patientdeletepolicy;
    }

    public void setPatientdeletepolicy(String patientdeletepolicy) {
        this.patientdeletepolicy = patientdeletepolicy;
    }

    public String getPatientwritepolicy() {
        return patientwritepolicy;
    }

    public void setPatientwritepolicy(String patientwritepolicy) {
        this.patientwritepolicy = patientwritepolicy;
    }

    public String getPatientreadpolicy() {
        return patientreadpolicy;
    }

    public void setPatientreadpolicy(String patientreadpolicy) {
        this.patientreadpolicy = patientreadpolicy;
    }

    public String getPatientlistpolicy() {
        return patientlistpolicy;
    }

    public void setPatientlistpolicy(String patientlistpolicy) {
        this.patientlistpolicy = patientlistpolicy;
    }

    public String getUsecasenumber() {
        return usecasenumber;
    }

    public void setUsecasenumber(String usecasenumber) {
        this.usecasenumber = usecasenumber;
    }

    public ModClinic getClinicid() {
        return clinicid;
    }

    public void setClinicid(ModClinic clinicid) {
        this.clinicid = clinicid;
    }

    public ModPermissiongroup getPermissiongroupid() {
        return permissiongroupid;
    }

    public void setPermissiongroupid(ModPermissiongroup permissiongroupid) {
        this.permissiongroupid = permissiongroupid;
    }

    public ModUser getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(ModUser modifiedby) {
        this.modifiedby = modifiedby;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deptid != null ? deptid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModDeptGeneric)) {
            return false;
        }
        ModDeptGeneric other = (ModDeptGeneric) object;
        if ((this.deptid == null && other.deptid != null) || (this.deptid != null && !this.deptid.equals(other.deptid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModDept[ deptid=" + deptid + " ]";
    }
    
}
