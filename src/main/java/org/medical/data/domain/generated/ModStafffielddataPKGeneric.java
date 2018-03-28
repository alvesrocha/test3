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
public class ModStafffielddataPKGeneric implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3569987674440192802L;
	@Basic(optional = false)
    @Column(name = "staffid")
    private int staffid;
    @Basic(optional = false)
    @Column(name = "fieldid")
    private int fieldid;

    public ModStafffielddataPKGeneric() {
    }

    public ModStafffielddataPKGeneric(int staffid, int fieldid) {
        this.staffid = staffid;
        this.fieldid = fieldid;
    }

    public int getStaffid() {
        return staffid;
    }

    public void setStaffid(int staffid) {
        this.staffid = staffid;
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
        hash += (int) staffid;
        hash += (int) fieldid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModStafffielddataPKGeneric)) {
            return false;
        }
        ModStafffielddataPKGeneric other = (ModStafffielddataPKGeneric) object;
        if (this.staffid != other.staffid) {
            return false;
        }
        if (this.fieldid != other.fieldid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModStafffielddataPK[ staffid=" + staffid + ", fieldid=" + fieldid + " ]";
    }
    
}
