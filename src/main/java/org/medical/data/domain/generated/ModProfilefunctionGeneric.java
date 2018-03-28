/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
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
@Table(name = "mod_profilefunction")
public class ModProfilefunctionGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModProfilefunctionPK modProfilefunctionPK;
    @Basic(optional = false)
    @Column(name = "SCOPECODE")
    private String scopecode;
    @JoinColumn(name = "PROFILEID", referencedColumnName = "PROFILEID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModProfile modProfile;
    @JoinColumn(name = "FUNCTIONID", referencedColumnName = "FUNCTIONID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModFunction modFunction;

    public ModProfilefunctionGeneric() {
    }

    public ModProfilefunctionGeneric(ModProfilefunctionPK modProfilefunctionPK) {
        this.modProfilefunctionPK = modProfilefunctionPK;
    }

    public ModProfilefunctionGeneric(ModProfilefunctionPK modProfilefunctionPK, String scopecode) {
        this.modProfilefunctionPK = modProfilefunctionPK;
        this.scopecode = scopecode;
    }

    public ModProfilefunctionGeneric(int profileid, int functionid) {
        this.modProfilefunctionPK = new ModProfilefunctionPK(profileid, functionid);
    }

    public ModProfilefunctionPK getModProfilefunctionPK() {
        return modProfilefunctionPK;
    }

    public void setModProfilefunctionPK(ModProfilefunctionPK modProfilefunctionPK) {
        this.modProfilefunctionPK = modProfilefunctionPK;
    }

    public String getScopecode() {
        return scopecode;
    }

    public void setScopecode(String scopecode) {
        this.scopecode = scopecode;
    }

    public ModProfile getModProfile() {
        return modProfile;
    }

    public void setModProfile(ModProfile modProfile) {
        this.modProfile = modProfile;
    }

    public ModFunction getModFunction() {
        return modFunction;
    }

    public void setModFunction(ModFunction modFunction) {
        this.modFunction = modFunction;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modProfilefunctionPK != null ? modProfilefunctionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModProfilefunctionGeneric)) {
            return false;
        }
        ModProfilefunctionGeneric other = (ModProfilefunctionGeneric) object;
        if ((this.modProfilefunctionPK == null && other.modProfilefunctionPK != null) || (this.modProfilefunctionPK != null && !this.modProfilefunctionPK.equals(other.modProfilefunctionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModProfilefunction[ modProfilefunctionPK=" + modProfilefunctionPK + " ]";
    }
    
}
