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
public class ModProfilefunctionPKGeneric implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "PROFILEID")
    private int profileid;
    @Basic(optional = false)
    @Column(name = "FUNCTIONID")
    private int functionid;

    public ModProfilefunctionPKGeneric() {
    }

    public ModProfilefunctionPKGeneric(int profileid, int functionid) {
        this.profileid = profileid;
        this.functionid = functionid;
    }

    public int getProfileid() {
        return profileid;
    }

    public void setProfileid(int profileid) {
        this.profileid = profileid;
    }

    public int getFunctionid() {
        return functionid;
    }

    public void setFunctionid(int functionid) {
        this.functionid = functionid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) profileid;
        hash += (int) functionid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModProfilefunctionPKGeneric)) {
            return false;
        }
        ModProfilefunctionPKGeneric other = (ModProfilefunctionPKGeneric) object;
        if (this.profileid != other.profileid) {
            return false;
        }
        if (this.functionid != other.functionid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModProfilefunctionPK[ profileid=" + profileid + ", functionid=" + functionid + " ]";
    }
    
}
