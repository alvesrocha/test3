/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_scope")
public class ModScopeGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SCOPECODE")
    private String scopecode;
    @Basic(optional = false)
    @Column(name = "SCOPELEVEL")
    private int scopelevel;

    public ModScopeGeneric() {
    }

    public ModScopeGeneric(String scopecode) {
        this.scopecode = scopecode;
    }

    public ModScopeGeneric(String scopecode, int scopelevel) {
        this.scopecode = scopecode;
        this.scopelevel = scopelevel;
    }

    public String getScopecode() {
        return scopecode;
    }

    public void setScopecode(String scopecode) {
        this.scopecode = scopecode;
    }

    public int getScopelevel() {
        return scopelevel;
    }

    public void setScopelevel(int scopelevel) {
        this.scopelevel = scopelevel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (scopecode != null ? scopecode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModScopeGeneric)) {
            return false;
        }
        ModScopeGeneric other = (ModScopeGeneric) object;
        if ((this.scopecode == null && other.scopecode != null) || (this.scopecode != null && !this.scopecode.equals(other.scopecode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModScope[ scopecode=" + scopecode + " ]";
    }
    
}
