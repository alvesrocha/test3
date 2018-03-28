/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
public class ModCountrynamePKGeneric implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Basic(optional = false)
    @Column(name = "countryid")
    private String countryid;
    @Basic(optional = false)
    @Column(name = "langused")
    private String langused;

    public ModCountrynamePKGeneric() {
    }

    public ModCountrynamePKGeneric(String countryid, String langused) {
        this.countryid = countryid;
        this.langused = langused;
    }

    public String getCountryid() {
        return countryid;
    }

    public void setCountryid(String countryid) {
        this.countryid = countryid;
    }

    public String getLangused() {
        return langused;
    }

    public void setLangused(String langused) {
        this.langused = langused;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countryid != null ? countryid.hashCode() : 0);
        hash += (langused != null ? langused.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModCountrynamePKGeneric)) {
            return false;
        }
        ModCountrynamePKGeneric other = (ModCountrynamePKGeneric) object;
        if ((this.countryid == null && other.countryid != null) || (this.countryid != null && !this.countryid.equals(other.countryid))) {
            return false;
        }
        if ((this.langused == null && other.langused != null) || (this.langused != null && !this.langused.equals(other.langused))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModCountrynamePK[ countryid=" + countryid + ", langused=" + langused + " ]";
    }
    
}
