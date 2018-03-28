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
@Table(name = "mod_constant")
public class ModConstantGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "constant_key")
    private String constantKey;
    @Basic(optional = false)
    @Column(name = "constant_value")
    private String constantValue;

    public ModConstantGeneric() {
    }

    public ModConstantGeneric(String constantKey) {
        this.constantKey = constantKey;
    }

    public ModConstantGeneric(String constantKey, String constantValue) {
        this.constantKey = constantKey;
        this.constantValue = constantValue;
    }

    public String getConstantKey() {
        return constantKey;
    }

    public void setConstantKey(String constantKey) {
        this.constantKey = constantKey;
    }

    public String getConstantValue() {
        return constantValue;
    }

    public void setConstantValue(String constantValue) {
        this.constantValue = constantValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (constantKey != null ? constantKey.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModConstantGeneric)) {
            return false;
        }
        ModConstantGeneric other = (ModConstantGeneric) object;
        if ((this.constantKey == null && other.constantKey != null) || (this.constantKey != null && !this.constantKey.equals(other.constantKey))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModConstant[ constantKey=" + constantKey + " ]";
    }
    
}
