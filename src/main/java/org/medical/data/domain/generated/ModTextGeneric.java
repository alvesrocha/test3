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
@Table(name = "mod_text")
public class ModTextGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModTextPK modTextPK;
    @Basic(optional = false)
    @Column(name = "textvalue")
    private String textvalue;
    @JoinColumn(name = "langused", referencedColumnName = "langid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModLang modLang;

    public ModTextGeneric() {
    }

    public ModTextGeneric(ModTextPK modTextPK) {
        this.modTextPK = modTextPK;
    }

    public ModTextGeneric(ModTextPK modTextPK, String textvalue) {
        this.modTextPK = modTextPK;
        this.textvalue = textvalue;
    }

    public ModTextGeneric(String bundlename, String textkey, String langused) {
        this.modTextPK = new ModTextPK(bundlename, textkey, langused);
    }

    public ModTextPK getModTextPK() {
        return modTextPK;
    }

    public void setModTextPK(ModTextPK modTextPK) {
        this.modTextPK = modTextPK;
    }

    public String getTextvalue() {
        return textvalue;
    }

    public void setTextvalue(String textvalue) {
        this.textvalue = textvalue;
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
        hash += (modTextPK != null ? modTextPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModTextGeneric)) {
            return false;
        }
        ModTextGeneric other = (ModTextGeneric) object;
        if ((this.modTextPK == null && other.modTextPK != null) || (this.modTextPK != null && !this.modTextPK.equals(other.modTextPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModText[ modTextPK=" + modTextPK + " ]";
    }
    
}
