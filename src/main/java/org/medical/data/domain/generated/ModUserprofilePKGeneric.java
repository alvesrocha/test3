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
public class ModUserprofilePKGeneric implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "PROFILEID")
    private int profileid;
    @Basic(optional = false)
    @Column(name = "STAFFID")
    private int staffid;

    public ModUserprofilePKGeneric() {
    }

    public ModUserprofilePKGeneric(int profileid, int staffid) {
        this.profileid = profileid;
        this.staffid = staffid;
    }

    public int getProfileid() {
        return profileid;
    }

    public void setProfileid(int profileid) {
        this.profileid = profileid;
    }

    public int getStaffid() {
        return staffid;
    }

    public void setStaffid(int staffid) {
        this.staffid = staffid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) profileid;
        hash += (int) staffid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModUserprofilePKGeneric)) {
            return false;
        }
        ModUserprofilePKGeneric other = (ModUserprofilePKGeneric) object;
        if (this.profileid != other.profileid) {
            return false;
        }
        if (this.staffid != other.staffid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModUserprofilePK[ profileid=" + profileid + ", staffid=" + staffid + " ]";
    }
    
}
