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
@Table(name = "mod_modulelang")
public class ModModulelangGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModModulelangPK modModulelangPK;
    @Basic(optional = false)
    @Column(name = "modname")
    private String modname;
    @JoinColumn(name = "langused", referencedColumnName = "langid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModLang modLang;
    @JoinColumn(name = "moduleid", referencedColumnName = "moduleid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModModule modModule;

    public ModModulelangGeneric() {
    }

    public ModModulelangGeneric(ModModulelangPK modModulelangPK) {
        this.modModulelangPK = modModulelangPK;
    }

    public ModModulelangGeneric(ModModulelangPK modModulelangPK, String modname) {
        this.modModulelangPK = modModulelangPK;
        this.modname = modname;
    }

    public ModModulelangGeneric(int moduleid, String langused) {
        this.modModulelangPK = new ModModulelangPK(moduleid, langused);
    }

    public ModModulelangPK getModModulelangPK() {
        return modModulelangPK;
    }

    public void setModModulelangPK(ModModulelangPK modModulelangPK) {
        this.modModulelangPK = modModulelangPK;
    }

    public String getModname() {
        return modname;
    }

    public void setModname(String modname) {
        this.modname = modname;
    }

    public ModLang getModLang() {
        return modLang;
    }

    public void setModLang(ModLang modLang) {
        this.modLang = modLang;
    }

    public ModModule getModModule() {
        return modModule;
    }

    public void setModModule(ModModule modModule) {
        this.modModule = modModule;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modModulelangPK != null ? modModulelangPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModModulelangGeneric)) {
            return false;
        }
        ModModulelangGeneric other = (ModModulelangGeneric) object;
        if ((this.modModulelangPK == null && other.modModulelangPK != null) || (this.modModulelangPK != null && !this.modModulelangPK.equals(other.modModulelangPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModModulelang[ modModulelangPK=" + modModulelangPK + " ]";
    }
    
}
