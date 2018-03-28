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
@Table(name = "mod_countryname")
public class ModCountrynameGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModCountrynamePK modCountrynamePK;
    @Basic(optional = false)
    @Column(name = "shortname")
    private String shortname;
    @Basic(optional = false)
    @Column(name = "longname")
    private String longname;
    @JoinColumn(name = "countryid", referencedColumnName = "countryid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModCountry modCountry;
    @JoinColumn(name = "langused", referencedColumnName = "langid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModLang modLang;

    public ModCountrynameGeneric() {
    }

    public ModCountrynameGeneric(ModCountrynamePK modCountrynamePK) {
        this.modCountrynamePK = modCountrynamePK;
    }

    public ModCountrynameGeneric(ModCountrynamePK modCountrynamePK, String shortname, String longname) {
        this.modCountrynamePK = modCountrynamePK;
        this.shortname = shortname;
        this.longname = longname;
    }

    public ModCountrynameGeneric(String countryid, String langused) {
        this.modCountrynamePK = new ModCountrynamePK(countryid, langused);
    }

    public ModCountrynamePK getModCountrynamePK() {
        return modCountrynamePK;
    }

    public void setModCountrynamePK(ModCountrynamePK modCountrynamePK) {
        this.modCountrynamePK = modCountrynamePK;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getLongname() {
        return longname;
    }

    public void setLongname(String longname) {
        this.longname = longname;
    }

    public ModCountry getModCountry() {
        return modCountry;
    }

    public void setModCountry(ModCountry modCountry) {
        this.modCountry = modCountry;
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
        hash += (modCountrynamePK != null ? modCountrynamePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModCountrynameGeneric)) {
            return false;
        }
        ModCountrynameGeneric other = (ModCountrynameGeneric) object;
        if ((this.modCountrynamePK == null && other.modCountrynamePK != null) || (this.modCountrynamePK != null && !this.modCountrynamePK.equals(other.modCountrynamePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModCountryname[ modCountrynamePK=" + modCountrynamePK + " ]";
    }
    
}
