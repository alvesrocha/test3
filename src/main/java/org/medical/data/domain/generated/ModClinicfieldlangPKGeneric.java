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
public class ModClinicfieldlangPKGeneric implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Basic(optional = false)
    @Column(name = "clinicid")
    private int clinicid;
    @Basic(optional = false)
    @Column(name = "fieldid")
    private int fieldid;
    @Basic(optional = false)
    @Column(name = "langused")
    private String langused;

    public ModClinicfieldlangPKGeneric() {
    }

    public ModClinicfieldlangPKGeneric(int clinicid, int fieldid, String langused) {
        this.clinicid = clinicid;
        this.fieldid = fieldid;
        this.langused = langused;
    }

    public int getClinicid() {
        return clinicid;
    }

    public void setClinicid(int clinicid) {
        this.clinicid = clinicid;
    }

    public int getFieldid() {
        return fieldid;
    }

    public void setFieldid(int fieldid) {
        this.fieldid = fieldid;
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
        hash += (int) clinicid;
        hash += (int) fieldid;
        hash += (langused != null ? langused.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModClinicfieldlangPKGeneric)) {
            return false;
        }
        ModClinicfieldlangPKGeneric other = (ModClinicfieldlangPKGeneric) object;
        if (this.clinicid != other.clinicid) {
            return false;
        }
        if (this.fieldid != other.fieldid) {
            return false;
        }
        if ((this.langused == null && other.langused != null) || (this.langused != null && !this.langused.equals(other.langused))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModClinicfieldlangPK[ clinicid=" + clinicid + ", fieldid=" + fieldid + ", langused=" + langused + " ]";
    }
    
}
