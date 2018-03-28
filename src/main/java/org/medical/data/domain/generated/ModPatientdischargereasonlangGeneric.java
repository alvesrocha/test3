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

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_patientdischargereasonlang")
public class ModPatientdischargereasonlangGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModPatientdischargereasonlangPK modPatientdischargereasonlangPK;
    @Basic(optional = false)
    @Column(name = "patientdischargereason")
    private String patientdischargereason;
    @JoinColumn(name = "langused", referencedColumnName = "langid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModLang modLang;
    @JoinColumn(name = "patientdischargereasonid", referencedColumnName = "patientdischargereasonid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModPatientdischargereason modPatientdischargereason;

    public ModPatientdischargereasonlangGeneric() {
    }

    public ModPatientdischargereasonlangGeneric(ModPatientdischargereasonlangPK modPatientdischargereasonlangPK) {
        this.modPatientdischargereasonlangPK = modPatientdischargereasonlangPK;
    }

    public ModPatientdischargereasonlangGeneric(ModPatientdischargereasonlangPK modPatientdischargereasonlangPK, String patientdischargereason) {
        this.modPatientdischargereasonlangPK = modPatientdischargereasonlangPK;
        this.patientdischargereason = patientdischargereason;
    }

    public ModPatientdischargereasonlangGeneric(int patientdischargereasonid, String langused) {
        this.modPatientdischargereasonlangPK = new ModPatientdischargereasonlangPK(patientdischargereasonid, langused);
    }

    public ModPatientdischargereasonlangPK getModPatientdischargereasonlangPK() {
        return modPatientdischargereasonlangPK;
    }

    public void setModPatientdischargereasonlangPK(ModPatientdischargereasonlangPK modPatientdischargereasonlangPK) {
        this.modPatientdischargereasonlangPK = modPatientdischargereasonlangPK;
    }

    public String getPatientdischargereason() {
        return patientdischargereason;
    }

    public void setPatientdischargereason(String patientdischargereason) {
        this.patientdischargereason = patientdischargereason;
    }

    public ModLang getModLang() {
        return modLang;
    }

    public void setModLang(ModLang modLang) {
        this.modLang = modLang;
    }

    public ModPatientdischargereason getModPatientdischargereason() {
        return modPatientdischargereason;
    }

    public void setModPatientdischargereason(ModPatientdischargereason modPatientdischargereason) {
        this.modPatientdischargereason = modPatientdischargereason;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modPatientdischargereasonlangPK != null ? modPatientdischargereasonlangPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModPatientdischargereasonlangGeneric)) {
            return false;
        }
        ModPatientdischargereasonlangGeneric other = (ModPatientdischargereasonlangGeneric) object;
        if ((this.modPatientdischargereasonlangPK == null && other.modPatientdischargereasonlangPK != null) || (this.modPatientdischargereasonlangPK != null && !this.modPatientdischargereasonlangPK.equals(other.modPatientdischargereasonlangPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModPatientdischargereasonlang[ modPatientdischargereasonlangPK=" + modPatientdischargereasonlangPK + " ]";
    }
    
}
