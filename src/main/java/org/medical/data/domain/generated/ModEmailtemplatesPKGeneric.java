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
public class ModEmailtemplatesPKGeneric implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "templatename")
    private String templatename;
    @Basic(optional = false)
    @Column(name = "langid")
    private String langid;

    public ModEmailtemplatesPKGeneric() {
    }

    public ModEmailtemplatesPKGeneric(String templatename, String langid) {
        this.templatename = templatename;
        this.langid = langid;
    }

    public String getTemplatename() {
        return templatename;
    }

    public void setTemplatename(String templatename) {
        this.templatename = templatename;
    }

    public String getLangid() {
        return langid;
    }

    public void setLangid(String langid) {
        this.langid = langid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (templatename != null ? templatename.hashCode() : 0);
        hash += (langid != null ? langid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModEmailtemplatesPKGeneric)) {
            return false;
        }
        ModEmailtemplatesPKGeneric other = (ModEmailtemplatesPKGeneric) object;
        if ((this.templatename == null && other.templatename != null) || (this.templatename != null && !this.templatename.equals(other.templatename))) {
            return false;
        }
        if ((this.langid == null && other.langid != null) || (this.langid != null && !this.langid.equals(other.langid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModEmailtemplatesPK[ templatename=" + templatename + ", langid=" + langid + " ]";
    }
    
}
