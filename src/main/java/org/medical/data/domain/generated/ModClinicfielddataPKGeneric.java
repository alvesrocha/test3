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
public class ModClinicfielddataPKGeneric implements Serializable {

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

    public ModClinicfielddataPKGeneric() {
    }

    public ModClinicfielddataPKGeneric(int clinicid, int fieldid) {
        this.clinicid = clinicid;
        this.fieldid = fieldid;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) clinicid;
        hash += (int) fieldid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModClinicfielddataPKGeneric)) {
            return false;
        }
        ModClinicfielddataPKGeneric other = (ModClinicfielddataPKGeneric) object;
        if (this.clinicid != other.clinicid) {
            return false;
        }
        if (this.fieldid != other.fieldid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModClinicfielddataPK[ clinicid=" + clinicid + ", fieldid=" + fieldid + " ]";
    }
    
}
