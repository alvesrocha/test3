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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_clinicfieldlang")
public class ModClinicfieldlangGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModClinicfieldlangPK modClinicfieldlangPK;
    @Basic(optional = false)
    @Column(name = "fieldname")
    private String fieldname;
    @JoinColumns({
        @JoinColumn(name = "clinicid", referencedColumnName = "clinicid", insertable = false, updatable = false)
        , @JoinColumn(name = "fieldid", referencedColumnName = "fieldid", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ModClinicfields modClinicfields;
    @JoinColumn(name = "langused", referencedColumnName = "langid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModLang modLang;

    public ModClinicfieldlangGeneric() {
    }

    public ModClinicfieldlangGeneric(ModClinicfieldlangPK modClinicfieldlangPK) {
        this.modClinicfieldlangPK = modClinicfieldlangPK;
    }

    public ModClinicfieldlangGeneric(ModClinicfieldlangPK modClinicfieldlangPK, String fieldname) {
        this.modClinicfieldlangPK = modClinicfieldlangPK;
        this.fieldname = fieldname;
    }

    public ModClinicfieldlangGeneric(int clinicid, int fieldid, String langused) {
        this.modClinicfieldlangPK = new ModClinicfieldlangPK(clinicid, fieldid, langused);
    }

    public ModClinicfieldlangPK getModClinicfieldlangPK() {
        return modClinicfieldlangPK;
    }

    public void setModClinicfieldlangPK(ModClinicfieldlangPK modClinicfieldlangPK) {
        this.modClinicfieldlangPK = modClinicfieldlangPK;
    }

    public String getFieldname() {
        return fieldname;
    }

    public void setFieldname(String fieldname) {
        this.fieldname = fieldname;
    }

    public ModClinicfields getModClinicfields() {
        return modClinicfields;
    }

    public void setModClinicfields(ModClinicfields modClinicfields) {
        this.modClinicfields = modClinicfields;
    }

    public ModLang getModLang() {
        return modLang;
    }

    public void setModLang(ModLang modLang) {
        this.modLang = modLang;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modClinicfieldlangPK != null ? modClinicfieldlangPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModClinicfieldlangGeneric)) {
            return false;
        }
        ModClinicfieldlangGeneric other = (ModClinicfieldlangGeneric) object;
        if ((this.modClinicfieldlangPK == null && other.modClinicfieldlangPK != null) || (this.modClinicfieldlangPK != null && !this.modClinicfieldlangPK.equals(other.modClinicfieldlangPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModClinicfieldlang[ modClinicfieldlangPK=" + modClinicfieldlangPK + " ]";
    }
    
}
