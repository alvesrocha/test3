/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_patientpermission")
public class ModPatientpermissionGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "patientpermissionid")
    private Integer patientpermissionid;
    @Basic(optional = false)
    @Column(name = "permission")
    private String permission;
    @JoinColumn(name = "patientclinicid", referencedColumnName = "patientclinicid")
    @ManyToOne(optional = false)
    private ModPatientclinic patientclinicid;
    @JoinColumn(name = "permissiongroupid", referencedColumnName = "permissiongroupid")
    @ManyToOne(optional = false)
    private ModPermissiongroup permissiongroupid;

    public ModPatientpermissionGeneric() {
    }

    public ModPatientpermissionGeneric(Integer patientpermissionid) {
        this.patientpermissionid = patientpermissionid;
    }

    public ModPatientpermissionGeneric(Integer patientpermissionid, String permission) {
        this.patientpermissionid = patientpermissionid;
        this.permission = permission;
    }

    public Integer getPatientpermissionid() {
        return patientpermissionid;
    }

    public void setPatientpermissionid(Integer patientpermissionid) {
        this.patientpermissionid = patientpermissionid;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public ModPatientclinic getPatientclinicid() {
        return patientclinicid;
    }

    public void setPatientclinicid(ModPatientclinic patientclinicid) {
        this.patientclinicid = patientclinicid;
    }

    public ModPermissiongroup getPermissiongroupid() {
        return permissiongroupid;
    }

    public void setPermissiongroupid(ModPermissiongroup permissiongroupid) {
        this.permissiongroupid = permissiongroupid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patientpermissionid != null ? patientpermissionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModPatientpermissionGeneric)) {
            return false;
        }
        ModPatientpermissionGeneric other = (ModPatientpermissionGeneric) object;
        if ((this.patientpermissionid == null && other.patientpermissionid != null) || (this.patientpermissionid != null && !this.patientpermissionid.equals(other.patientpermissionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModPatientpermission[ patientpermissionid=" + patientpermissionid + " ]";
    }
    
}
