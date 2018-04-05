/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_lang")
public class ModLangGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "langid")
    private String langid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modLang")
    private List<ModText> modTextList;

    public ModLangGeneric() {
    }

    public ModLangGeneric(String langid) {
        this.langid = langid;
    }

    public String getLangid() {
        return langid;
    }

    public void setLangid(String langid) {
        this.langid = langid;
    }

    public List<ModText> getModTextList() {
        return modTextList;
    }

    public void setModTextList(List<ModText> modTextList) {
        this.modTextList = modTextList;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (langid != null ? langid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModLangGeneric)) {
            return false;
        }
        ModLangGeneric other = (ModLangGeneric) object;
        if ((this.langid == null && other.langid != null) || (this.langid != null && !this.langid.equals(other.langid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModLang[ langid=" + langid + " ]";
    }
    
}
