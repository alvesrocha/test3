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
public class ModLangnamePKGeneric implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "langid")
    private String langid;
    @Basic(optional = false)
    @Column(name = "langused")
    private String langused;

    public ModLangnamePKGeneric() {
    }

    public ModLangnamePKGeneric(String langid, String langused) {
        this.langid = langid;
        this.langused = langused;
    }

    public String getLangid() {
        return langid;
    }

    public void setLangid(String langid) {
        this.langid = langid;
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
        hash += (langid != null ? langid.hashCode() : 0);
        hash += (langused != null ? langused.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModLangnamePKGeneric)) {
            return false;
        }
        ModLangnamePKGeneric other = (ModLangnamePKGeneric) object;
        if ((this.langid == null && other.langid != null) || (this.langid != null && !this.langid.equals(other.langid))) {
            return false;
        }
        if ((this.langused == null && other.langused != null) || (this.langused != null && !this.langused.equals(other.langused))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModLangnamePK[ langid=" + langid + ", langused=" + langused + " ]";
    }
    
}
