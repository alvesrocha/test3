/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import org.medical.data.domain.source.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_userprofile")
public class ModUserprofileGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModUserprofilePK modUserprofilePK;
    @Basic(optional = false)
    @Column(name = "ENABLED")
    private String enabled;
    @Basic(optional = false)
    @Column(name = "VALID")
    private String valid;
    @JoinColumn(name = "PROFILEID", referencedColumnName = "PROFILEID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModProfile modProfile;
    @JoinColumn(name = "STAFFID", referencedColumnName = "staffid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    @JsonIgnore
    private ModStaff modStaff;

    public ModUserprofileGeneric() {
    }

    public ModUserprofileGeneric(ModUserprofilePK modUserprofilePK) {
        this.modUserprofilePK = modUserprofilePK;
    }

    public ModUserprofileGeneric(ModUserprofilePK modUserprofilePK, String enabled, String valid) {
        this.modUserprofilePK = modUserprofilePK;
        this.enabled = enabled;
        this.valid = valid;
    }

    public ModUserprofileGeneric(int profileid, int staffid) {
        this.modUserprofilePK = new ModUserprofilePK(profileid, staffid);
    }

    public ModUserprofilePK getModUserprofilePK() {
        return modUserprofilePK;
    }

    public void setModUserprofilePK(ModUserprofilePK modUserprofilePK) {
        this.modUserprofilePK = modUserprofilePK;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public ModProfile getModProfile() {
        return modProfile;
    }

    public void setModProfile(ModProfile modProfile) {
        this.modProfile = modProfile;
    }

    public ModStaff getModStaff() {
        return modStaff;
    }

    public void setModStaff(ModStaff modStaff) {
        this.modStaff = modStaff;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modUserprofilePK != null ? modUserprofilePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModUserprofileGeneric)) {
            return false;
        }
        ModUserprofileGeneric other = (ModUserprofileGeneric) object;
        if ((this.modUserprofilePK == null && other.modUserprofilePK != null) || (this.modUserprofilePK != null && !this.modUserprofilePK.equals(other.modUserprofilePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModUserprofile[ modUserprofilePK=" + modUserprofilePK + " ]";
    }
    
}
