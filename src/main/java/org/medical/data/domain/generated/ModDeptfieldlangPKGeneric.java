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
public class ModDeptfieldlangPKGeneric implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Basic(optional = false)
    @Column(name = "deptid")
    private int deptid;
    @Basic(optional = false)
    @Column(name = "fieldid")
    private int fieldid;
    @Basic(optional = false)
    @Column(name = "langused")
    private String langused;

    public ModDeptfieldlangPKGeneric() {
    }

    public ModDeptfieldlangPKGeneric(int deptid, int fieldid, String langused) {
        this.deptid = deptid;
        this.fieldid = fieldid;
        this.langused = langused;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
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
        hash += (int) deptid;
        hash += (int) fieldid;
        hash += (langused != null ? langused.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModDeptfieldlangPKGeneric)) {
            return false;
        }
        ModDeptfieldlangPKGeneric other = (ModDeptfieldlangPKGeneric) object;
        if (this.deptid != other.deptid) {
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
        return "test.ModDeptfieldlangPK[ deptid=" + deptid + ", fieldid=" + fieldid + ", langused=" + langused + " ]";
    }
    
}
