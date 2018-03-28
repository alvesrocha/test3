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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_functionswitchuserallowed")
public class ModFunctionswitchuserallowedGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FUNCTIONSWITCHUSERALLOWEDID")
    private Integer functionswitchuserallowedid;
    @Basic(optional = false)
    @Column(name = "KEEPFUNCTION")
    private String keepfunction;
    @JoinColumn(name = "FUNCTIONID", referencedColumnName = "FUNCTIONID")
    @ManyToOne(optional = false)
    private ModFunction functionid;
    @JoinColumn(name = "ALTERNATIVEFUNCTIONID", referencedColumnName = "FUNCTIONID")
    @ManyToOne(optional = false)
    private ModFunction alternativefunctionid;

    public ModFunctionswitchuserallowedGeneric() {
    }

    public ModFunctionswitchuserallowedGeneric(Integer functionswitchuserallowedid) {
        this.functionswitchuserallowedid = functionswitchuserallowedid;
    }

    public ModFunctionswitchuserallowedGeneric(Integer functionswitchuserallowedid, String keepfunction) {
        this.functionswitchuserallowedid = functionswitchuserallowedid;
        this.keepfunction = keepfunction;
    }

    public Integer getFunctionswitchuserallowedid() {
        return functionswitchuserallowedid;
    }

    public void setFunctionswitchuserallowedid(Integer functionswitchuserallowedid) {
        this.functionswitchuserallowedid = functionswitchuserallowedid;
    }

    public String getKeepfunction() {
        return keepfunction;
    }

    public void setKeepfunction(String keepfunction) {
        this.keepfunction = keepfunction;
    }

    public ModFunction getFunctionid() {
        return functionid;
    }

    public void setFunctionid(ModFunction functionid) {
        this.functionid = functionid;
    }

    public ModFunction getAlternativefunctionid() {
        return alternativefunctionid;
    }

    public void setAlternativefunctionid(ModFunction alternativefunctionid) {
        this.alternativefunctionid = alternativefunctionid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (functionswitchuserallowedid != null ? functionswitchuserallowedid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModFunctionswitchuserallowedGeneric)) {
            return false;
        }
        ModFunctionswitchuserallowedGeneric other = (ModFunctionswitchuserallowedGeneric) object;
        if ((this.functionswitchuserallowedid == null && other.functionswitchuserallowedid != null) || (this.functionswitchuserallowedid != null && !this.functionswitchuserallowedid.equals(other.functionswitchuserallowedid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModFunctionswitchuserallowed[ functionswitchuserallowedid=" + functionswitchuserallowedid + " ]";
    }
    
}
