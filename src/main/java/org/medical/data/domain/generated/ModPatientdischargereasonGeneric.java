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
@Table(name = "mod_patientdischargereason")
public class ModPatientdischargereasonGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "patientdischargereasonid")
    private Integer patientdischargereasonid;
    @Basic(optional = false)
    @Column(name = "internalname")
    private String internalname;
    @OneToMany(mappedBy = "dischargedreasonid")
    private List<ModPatientclinic> modPatientclinicList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modPatientdischargereason")
    private List<ModPatientdischargereasonlang> modPatientdischargereasonlangList;

    public ModPatientdischargereasonGeneric() {
    }

    public ModPatientdischargereasonGeneric(Integer patientdischargereasonid) {
        this.patientdischargereasonid = patientdischargereasonid;
    }

    public ModPatientdischargereasonGeneric(Integer patientdischargereasonid, String internalname) {
        this.patientdischargereasonid = patientdischargereasonid;
        this.internalname = internalname;
    }

    public Integer getPatientdischargereasonid() {
        return patientdischargereasonid;
    }

    public void setPatientdischargereasonid(Integer patientdischargereasonid) {
        this.patientdischargereasonid = patientdischargereasonid;
    }

    public String getInternalname() {
        return internalname;
    }

    public void setInternalname(String internalname) {
        this.internalname = internalname;
    }

    public List<ModPatientclinic> getModPatientclinicList() {
        return modPatientclinicList;
    }

    public void setModPatientclinicList(List<ModPatientclinic> modPatientclinicList) {
        this.modPatientclinicList = modPatientclinicList;
    }

    public List<ModPatientdischargereasonlang> getModPatientdischargereasonlangList() {
        return modPatientdischargereasonlangList;
    }

    public void setModPatientdischargereasonlangList(List<ModPatientdischargereasonlang> modPatientdischargereasonlangList) {
        this.modPatientdischargereasonlangList = modPatientdischargereasonlangList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patientdischargereasonid != null ? patientdischargereasonid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModPatientdischargereasonGeneric)) {
            return false;
        }
        ModPatientdischargereasonGeneric other = (ModPatientdischargereasonGeneric) object;
        if ((this.patientdischargereasonid == null && other.patientdischargereasonid != null) || (this.patientdischargereasonid != null && !this.patientdischargereasonid.equals(other.patientdischargereasonid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModPatientdischargereason[ patientdischargereasonid=" + patientdischargereasonid + " ]";
    }
    
}
