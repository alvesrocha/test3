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
@Table(name = "mod_fieldoptionlang")
public class ModFieldoptionlangGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModFieldoptionlangPK modFieldoptionlangPK;
    @Basic(optional = false)
    @Column(name = "option")
    private String option;
    @JoinColumn(name = "fieldoptionid", referencedColumnName = "fieldoptionid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModFieldoption modFieldoption;
    @JoinColumn(name = "langused", referencedColumnName = "langid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModLang modLang;

    public ModFieldoptionlangGeneric() {
    }

    public ModFieldoptionlangGeneric(ModFieldoptionlangPK modFieldoptionlangPK) {
        this.modFieldoptionlangPK = modFieldoptionlangPK;
    }

    public ModFieldoptionlangGeneric(ModFieldoptionlangPK modFieldoptionlangPK, String option) {
        this.modFieldoptionlangPK = modFieldoptionlangPK;
        this.option = option;
    }

    public ModFieldoptionlangGeneric(int fieldoptionid, String langused) {
        this.modFieldoptionlangPK = new ModFieldoptionlangPK(fieldoptionid, langused);
    }

    public ModFieldoptionlangPK getModFieldoptionlangPK() {
        return modFieldoptionlangPK;
    }

    public void setModFieldoptionlangPK(ModFieldoptionlangPK modFieldoptionlangPK) {
        this.modFieldoptionlangPK = modFieldoptionlangPK;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public ModFieldoption getModFieldoption() {
        return modFieldoption;
    }

    public void setModFieldoption(ModFieldoption modFieldoption) {
        this.modFieldoption = modFieldoption;
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
        hash += (modFieldoptionlangPK != null ? modFieldoptionlangPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModFieldoptionlangGeneric)) {
            return false;
        }
        ModFieldoptionlangGeneric other = (ModFieldoptionlangGeneric) object;
        if ((this.modFieldoptionlangPK == null && other.modFieldoptionlangPK != null) || (this.modFieldoptionlangPK != null && !this.modFieldoptionlangPK.equals(other.modFieldoptionlangPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModFieldoptionlang[ modFieldoptionlangPK=" + modFieldoptionlangPK + " ]";
    }
    
}
