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
@Table(name = "mod_patientfieldlang")
public class ModPatientfieldlangGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModPatientfieldlangPK modPatientfieldlangPK;
    @Basic(optional = false)
    @Column(name = "fieldname")
    private String fieldname;
    @JoinColumn(name = "langused", referencedColumnName = "langid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModLang modLang;
    @JoinColumn(name = "fieldid", referencedColumnName = "fieldid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModPatientfields modPatientfields;

    public ModPatientfieldlangGeneric() {
    }

    public ModPatientfieldlangGeneric(ModPatientfieldlangPK modPatientfieldlangPK) {
        this.modPatientfieldlangPK = modPatientfieldlangPK;
    }

    public ModPatientfieldlangGeneric(ModPatientfieldlangPK modPatientfieldlangPK, String fieldname) {
        this.modPatientfieldlangPK = modPatientfieldlangPK;
        this.fieldname = fieldname;
    }

    public ModPatientfieldlangGeneric(int fieldid, String langused) {
        this.modPatientfieldlangPK = new ModPatientfieldlangPK(fieldid, langused);
    }

    public ModPatientfieldlangPK getModPatientfieldlangPK() {
        return modPatientfieldlangPK;
    }

    public void setModPatientfieldlangPK(ModPatientfieldlangPK modPatientfieldlangPK) {
        this.modPatientfieldlangPK = modPatientfieldlangPK;
    }

    public String getFieldname() {
        return fieldname;
    }

    public void setFieldname(String fieldname) {
        this.fieldname = fieldname;
    }

    public ModLang getModLang() {
        return modLang;
    }

    public void setModLang(ModLang modLang) {
        this.modLang = modLang;
    }

    public ModPatientfields getModPatientfields() {
        return modPatientfields;
    }

    public void setModPatientfields(ModPatientfields modPatientfields) {
        this.modPatientfields = modPatientfields;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modPatientfieldlangPK != null ? modPatientfieldlangPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModPatientfieldlangGeneric)) {
            return false;
        }
        ModPatientfieldlangGeneric other = (ModPatientfieldlangGeneric) object;
        if ((this.modPatientfieldlangPK == null && other.modPatientfieldlangPK != null) || (this.modPatientfieldlangPK != null && !this.modPatientfieldlangPK.equals(other.modPatientfieldlangPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModPatientfieldlang[ modPatientfieldlangPK=" + modPatientfieldlangPK + " ]";
    }
    
}
