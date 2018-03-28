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
public class ModTextPKGeneric implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1793898422752497655L;
	@Basic(optional = false)
    @Column(name = "bundlename")
    private String bundlename;
    @Basic(optional = false)
    @Column(name = "textkey")
    private String textkey;
    @Basic(optional = false)
    @Column(name = "langused")
    private String langused;

    public ModTextPKGeneric() {
    }

    public ModTextPKGeneric(String bundlename, String textkey, String langused) {
        this.bundlename = bundlename;
        this.textkey = textkey;
        this.langused = langused;
    }

    public String getBundlename() {
        return bundlename;
    }

    public void setBundlename(String bundlename) {
        this.bundlename = bundlename;
    }

    public String getTextkey() {
        return textkey;
    }

    public void setTextkey(String textkey) {
        this.textkey = textkey;
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
        hash += (bundlename != null ? bundlename.hashCode() : 0);
        hash += (textkey != null ? textkey.hashCode() : 0);
        hash += (langused != null ? langused.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModTextPKGeneric)) {
            return false;
        }
        ModTextPKGeneric other = (ModTextPKGeneric) object;
        if ((this.bundlename == null && other.bundlename != null) || (this.bundlename != null && !this.bundlename.equals(other.bundlename))) {
            return false;
        }
        if ((this.textkey == null && other.textkey != null) || (this.textkey != null && !this.textkey.equals(other.textkey))) {
            return false;
        }
        if ((this.langused == null && other.langused != null) || (this.langused != null && !this.langused.equals(other.langused))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModTextPK[ bundlename=" + bundlename + ", textkey=" + textkey + ", langused=" + langused + " ]";
    }
    
}
