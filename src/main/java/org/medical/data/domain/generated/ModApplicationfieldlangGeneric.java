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
@Table(name = "mod_applicationfieldlang")
public class ModApplicationfieldlangGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModApplicationfieldlangPK modApplicationfieldlangPK;
    @Basic(optional = false)
    @Column(name = "fieldname")
    private String fieldname;
    @JoinColumn(name = "fieldid", referencedColumnName = "fieldid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModApplicationfields modApplicationfields;
    @JoinColumn(name = "langused", referencedColumnName = "langid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModLang modLang;

    public ModApplicationfieldlangGeneric() {
    }

    public ModApplicationfieldlangGeneric(ModApplicationfieldlangPK modApplicationfieldlangPK) {
        this.modApplicationfieldlangPK = modApplicationfieldlangPK;
    }

    public ModApplicationfieldlangGeneric(ModApplicationfieldlangPK modApplicationfieldlangPK, String fieldname) {
        this.modApplicationfieldlangPK = modApplicationfieldlangPK;
        this.fieldname = fieldname;
    }

    public ModApplicationfieldlangGeneric(int fieldid, String langused) {
        this.modApplicationfieldlangPK = new ModApplicationfieldlangPK(fieldid, langused);
    }

    public ModApplicationfieldlangPK getModApplicationfieldlangGenericPK() {
        return modApplicationfieldlangPK;
    }

    public void setModApplicationfieldlangPK(ModApplicationfieldlangPK modApplicationfieldlangPK) {
        this.modApplicationfieldlangPK = modApplicationfieldlangPK;
    }

    public String getFieldname() {
        return fieldname;
    }

    public void setFieldname(String fieldname) {
        this.fieldname = fieldname;
    }

    public ModApplicationfields getModApplicationfields() {
        return modApplicationfields;
    }

    public void setModApplicationfields(ModApplicationfields modApplicationfields) {
        this.modApplicationfields = modApplicationfields;
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
        hash += (modApplicationfieldlangPK != null ? modApplicationfieldlangPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModApplicationfieldlangGeneric)) {
            return false;
        }
        ModApplicationfieldlangGeneric other = (ModApplicationfieldlangGeneric) object;
        if ((this.modApplicationfieldlangPK == null && other.modApplicationfieldlangPK != null) || (this.modApplicationfieldlangPK != null && !this.modApplicationfieldlangPK.equals(other.modApplicationfieldlangPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModApplicationfieldlang[ modApplicationfieldlangPK=" + modApplicationfieldlangPK + " ]";
    }
    
}
