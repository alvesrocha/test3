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
@Table(name = "mod_defaultclinicfieldlang")
public class ModDefaultclinicfieldlangGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModDefaultclinicfieldlangPK modDefaultclinicfieldlangPK;
    @Basic(optional = false)
    @Column(name = "fieldname")
    private String fieldname;
    @JoinColumn(name = "fieldid", referencedColumnName = "fieldid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModDefaultclinicfields modDefaultclinicfields;
    @JoinColumn(name = "langused", referencedColumnName = "langid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModLang modLang;

    public ModDefaultclinicfieldlangGeneric() {
    }

    public ModDefaultclinicfieldlangGeneric(ModDefaultclinicfieldlangPK modDefaultclinicfieldlangPK) {
        this.modDefaultclinicfieldlangPK = modDefaultclinicfieldlangPK;
    }

    public ModDefaultclinicfieldlangGeneric(ModDefaultclinicfieldlangPK modDefaultclinicfieldlangPK, String fieldname) {
        this.modDefaultclinicfieldlangPK = modDefaultclinicfieldlangPK;
        this.fieldname = fieldname;
    }

    public ModDefaultclinicfieldlangGeneric(int fieldid, String langused) {
        this.modDefaultclinicfieldlangPK = new ModDefaultclinicfieldlangPK(fieldid, langused);
    }

    public ModDefaultclinicfieldlangPK getModDefaultclinicfieldlangPK() {
        return modDefaultclinicfieldlangPK;
    }

    public void setModDefaultclinicfieldlangPK(ModDefaultclinicfieldlangPK modDefaultclinicfieldlangPK) {
        this.modDefaultclinicfieldlangPK = modDefaultclinicfieldlangPK;
    }

    public String getFieldname() {
        return fieldname;
    }

    public void setFieldname(String fieldname) {
        this.fieldname = fieldname;
    }

    public ModDefaultclinicfields getModDefaultclinicfields() {
        return modDefaultclinicfields;
    }

    public void setModDefaultclinicfields(ModDefaultclinicfields modDefaultclinicfields) {
        this.modDefaultclinicfields = modDefaultclinicfields;
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
        hash += (modDefaultclinicfieldlangPK != null ? modDefaultclinicfieldlangPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModDefaultclinicfieldlangGeneric)) {
            return false;
        }
        ModDefaultclinicfieldlangGeneric other = (ModDefaultclinicfieldlangGeneric) object;
        if ((this.modDefaultclinicfieldlangPK == null && other.modDefaultclinicfieldlangPK != null) || (this.modDefaultclinicfieldlangPK != null && !this.modDefaultclinicfieldlangPK.equals(other.modDefaultclinicfieldlangPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModDefaultclinicfieldlang[ modDefaultclinicfieldlangPK=" + modDefaultclinicfieldlangPK + " ]";
    }
    
}
