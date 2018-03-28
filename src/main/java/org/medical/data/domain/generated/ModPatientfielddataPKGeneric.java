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
public class ModPatientfielddataPKGeneric implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "patientid")
    private int patientid;
    @Basic(optional = false)
    @Column(name = "fieldid")
    private int fieldid;

    public ModPatientfielddataPKGeneric() {
    }

    public ModPatientfielddataPKGeneric(int patientid, int fieldid) {
        this.patientid = patientid;
        this.fieldid = fieldid;
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
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
        hash += (int) patientid;
        hash += (int) fieldid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModPatientfielddataPKGeneric)) {
            return false;
        }
        ModPatientfielddataPKGeneric other = (ModPatientfielddataPKGeneric) object;
        if (this.patientid != other.patientid) {
            return false;
        }
        if (this.fieldid != other.fieldid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModPatientfielddataPK[ patientid=" + patientid + ", fieldid=" + fieldid + " ]";
    }
    
}
