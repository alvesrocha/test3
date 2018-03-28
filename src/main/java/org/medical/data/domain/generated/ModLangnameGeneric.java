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
@Table(name = "mod_langname")
public class ModLangnameGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModLangnamePK modLangnamePK;
    @Basic(optional = false)
    @Column(name = "langname")
    private String langname;
    @JoinColumn(name = "langid", referencedColumnName = "langid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModLang modLang;
    @JoinColumn(name = "langused", referencedColumnName = "langid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModLang modLang1;

    public ModLangnameGeneric() {
    }

    public ModLangnameGeneric(ModLangnamePK modLangnamePK) {
        this.modLangnamePK = modLangnamePK;
    }

    public ModLangnameGeneric(ModLangnamePK modLangnamePK, String langname) {
        this.modLangnamePK = modLangnamePK;
        this.langname = langname;
    }

    public ModLangnameGeneric(String langid, String langused) {
        this.modLangnamePK = new ModLangnamePK(langid, langused);
    }

    public ModLangnamePK getModLangnamePK() {
        return modLangnamePK;
    }

    public void setModLangnamePK(ModLangnamePK modLangnamePK) {
        this.modLangnamePK = modLangnamePK;
    }

    public String getLangname() {
        return langname;
    }

    public void setLangname(String langname) {
        this.langname = langname;
    }

    public ModLang getModLang() {
        return modLang;
    }

    public void setModLang(ModLang modLang) {
        this.modLang = modLang;
    }

    public ModLang getModLang1() {
        return modLang1;
    }

    public void setModLang1(ModLang modLang1) {
        this.modLang1 = modLang1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modLangnamePK != null ? modLangnamePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModLangnameGeneric)) {
            return false;
        }
        ModLangnameGeneric other = (ModLangnameGeneric) object;
        if ((this.modLangnamePK == null && other.modLangnamePK != null) || (this.modLangnamePK != null && !this.modLangnamePK.equals(other.modLangnamePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModLangname[ modLangnamePK=" + modLangnamePK + " ]";
    }
    
}
