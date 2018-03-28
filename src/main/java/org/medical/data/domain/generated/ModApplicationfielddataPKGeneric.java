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
public class ModApplicationfielddataPKGeneric implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Basic(optional = false)
    @Column(name = "userid")
    private int userid;
    @Basic(optional = false)
    @Column(name = "fieldid")
    private int fieldid;

    public ModApplicationfielddataPKGeneric() {
    }

    public ModApplicationfielddataPKGeneric(int userid, int fieldid) {
        this.userid = userid;
        this.fieldid = fieldid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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
        hash += (int) userid;
        hash += (int) fieldid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModApplicationfielddataPKGeneric)) {
            return false;
        }
        ModApplicationfielddataPKGeneric other = (ModApplicationfielddataPKGeneric) object;
        if (this.userid != other.userid) {
            return false;
        }
        if (this.fieldid != other.fieldid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModApplicationfielddataPK[ userid=" + userid + ", fieldid=" + fieldid + " ]";
    }
    
}
