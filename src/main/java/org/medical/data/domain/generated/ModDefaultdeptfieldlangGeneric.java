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
@Table(name = "mod_defaultdeptfieldlang")
public class ModDefaultdeptfieldlangGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModDefaultdeptfieldlangPK modDefaultdeptfieldlangPK;
    @Basic(optional = false)
    @Column(name = "fieldname")
    private String fieldname;
    @JoinColumn(name = "fieldid", referencedColumnName = "fieldid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModDefaultdeptfields modDefaultdeptfields;
    @JoinColumn(name = "langused", referencedColumnName = "langid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModLang modLang;

    public ModDefaultdeptfieldlangGeneric() {
    }

    public ModDefaultdeptfieldlangGeneric(ModDefaultdeptfieldlangPK modDefaultdeptfieldlangPK) {
        this.modDefaultdeptfieldlangPK = modDefaultdeptfieldlangPK;
    }

    public ModDefaultdeptfieldlangGeneric(ModDefaultdeptfieldlangPK modDefaultdeptfieldlangPK, String fieldname) {
        this.modDefaultdeptfieldlangPK = modDefaultdeptfieldlangPK;
        this.fieldname = fieldname;
    }

    public ModDefaultdeptfieldlangGeneric(int fieldid, String langused) {
        this.modDefaultdeptfieldlangPK = new ModDefaultdeptfieldlangPK(fieldid, langused);
    }

    public ModDefaultdeptfieldlangPK getModDefaultdeptfieldlangPK() {
        return modDefaultdeptfieldlangPK;
    }

    public void setModDefaultdeptfieldlangPK(ModDefaultdeptfieldlangPK modDefaultdeptfieldlangPK) {
        this.modDefaultdeptfieldlangPK = modDefaultdeptfieldlangPK;
    }

    public String getFieldname() {
        return fieldname;
    }

    public void setFieldname(String fieldname) {
        this.fieldname = fieldname;
    }

    public ModDefaultdeptfields getModDefaultdeptfields() {
        return modDefaultdeptfields;
    }

    public void setModDefaultdeptfields(ModDefaultdeptfields modDefaultdeptfields) {
        this.modDefaultdeptfields = modDefaultdeptfields;
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
        hash += (modDefaultdeptfieldlangPK != null ? modDefaultdeptfieldlangPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModDefaultdeptfieldlangGeneric)) {
            return false;
        }
        ModDefaultdeptfieldlangGeneric other = (ModDefaultdeptfieldlangGeneric) object;
        if ((this.modDefaultdeptfieldlangPK == null && other.modDefaultdeptfieldlangPK != null) || (this.modDefaultdeptfieldlangPK != null && !this.modDefaultdeptfieldlangPK.equals(other.modDefaultdeptfieldlangPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModDefaultdeptfieldlang[ modDefaultdeptfieldlangPK=" + modDefaultdeptfieldlangPK + " ]";
    }
    
}
