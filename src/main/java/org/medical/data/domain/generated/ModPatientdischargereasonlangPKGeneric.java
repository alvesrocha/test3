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
public class ModPatientdischargereasonlangPKGeneric implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "patientdischargereasonid")
    private int patientdischargereasonid;
    @Basic(optional = false)
    @Column(name = "langused")
    private String langused;

    public ModPatientdischargereasonlangPKGeneric() {
    }

    public ModPatientdischargereasonlangPKGeneric(int patientdischargereasonid, String langused) {
        this.patientdischargereasonid = patientdischargereasonid;
        this.langused = langused;
    }

    public int getPatientdischargereasonid() {
        return patientdischargereasonid;
    }

    public void setPatientdischargereasonid(int patientdischargereasonid) {
        this.patientdischargereasonid = patientdischargereasonid;
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
        hash += (int) patientdischargereasonid;
        hash += (langused != null ? langused.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModPatientdischargereasonlangPKGeneric)) {
            return false;
        }
        ModPatientdischargereasonlangPKGeneric other = (ModPatientdischargereasonlangPKGeneric) object;
        if (this.patientdischargereasonid != other.patientdischargereasonid) {
            return false;
        }
        if ((this.langused == null && other.langused != null) || (this.langused != null && !this.langused.equals(other.langused))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModPatientdischargereasonlangPK[ patientdischargereasonid=" + patientdischargereasonid + ", langused=" + langused + " ]";
    }
    
}
