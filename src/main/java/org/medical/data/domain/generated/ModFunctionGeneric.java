/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_function")
public class ModFunctionGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FUNCTIONID")
    private Integer functionid;
    @Basic(optional = false)
    @Column(name = "INTERNALFUNCTIONNAME")
    private String internalfunctionname;
    @Basic(optional = false)
    @Column(name = "SCOPE")
    private String scope;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "functionid")
    private List<ModFunctionswitchuserallowed> modFunctionswitchuserallowedList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alternativefunctionid")
    private List<ModFunctionswitchuserallowed> modFunctionswitchuserallowedAlternativeList;
 

    public ModFunctionGeneric() {
    }

    public ModFunctionGeneric(Integer functionid) {
        this.functionid = functionid;
    }

    public ModFunctionGeneric(Integer functionid, String internalfunctionname, String scope) {
        this.functionid = functionid;
        this.internalfunctionname = internalfunctionname;
        this.scope = scope;
    }

    public Integer getFunctionid() {
        return functionid;
    }

    public void setFunctionid(Integer functionid) {
        this.functionid = functionid;
    }

    public String getInternalfunctionname() {
        return internalfunctionname;
    }

    public void setInternalfunctionname(String internalfunctionname) {
        this.internalfunctionname = internalfunctionname;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public List<ModFunctionswitchuserallowed> getModFunctionswitchuserallowedList() {
        return modFunctionswitchuserallowedList;
    }

    public void setModFunctionswitchuserallowedList(List<ModFunctionswitchuserallowed> modFunctionswitchuserallowedList) {
        this.modFunctionswitchuserallowedList = modFunctionswitchuserallowedList;
    }

    public List<ModFunctionswitchuserallowed> getModFunctionswitchuserallowedAlternativeList() {
		return modFunctionswitchuserallowedAlternativeList;
	}

	public void setModFunctionswitchuserallowedAlternativeList(
			List<ModFunctionswitchuserallowed> modFunctionswitchuserallowedAlternativeList) {
		this.modFunctionswitchuserallowedAlternativeList = modFunctionswitchuserallowedAlternativeList;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (functionid != null ? functionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModFunctionGeneric)) {
            return false;
        }
        ModFunctionGeneric other = (ModFunctionGeneric) object;
        if ((this.functionid == null && other.functionid != null) || (this.functionid != null && !this.functionid.equals(other.functionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModFunction[ functionid=" + functionid + " ]";
    }
    
}
