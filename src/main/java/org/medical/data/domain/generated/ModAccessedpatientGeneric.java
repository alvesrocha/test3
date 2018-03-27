/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_accessedpatient")
public class ModAccessedpatientGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "accessedpatientid")
    private Integer accessedpatientid;
    @Basic(optional = false)
    @Column(name = "accessed")
    @Temporal(TemporalType.TIMESTAMP)
    private Date accessed;
    @Column(name = "staffidswitchuser")
    private Integer staffidswitchuser;
    @Column(name = "accessedswitchuser")
    @Temporal(TemporalType.TIMESTAMP)
    private Date accessedswitchuser;
    @JoinColumn(name = "patientid", referencedColumnName = "patientid")
    @ManyToOne(optional = false)
    private ModPatient patientid;
    @JoinColumn(name = "staffid", referencedColumnName = "staffid")
    @ManyToOne(optional = false)
    private ModStaff staffid;

    public ModAccessedpatientGeneric() {
    }

    public ModAccessedpatientGeneric(Integer accessedpatientid) {
        this.accessedpatientid = accessedpatientid;
    }

    public ModAccessedpatientGeneric(Integer accessedpatientid, Date accessed) {
        this.accessedpatientid = accessedpatientid;
        this.accessed = accessed;
    }

    public Integer getAccessedpatientid() {
        return accessedpatientid;
    }

    public void setAccessedpatientid(Integer accessedpatientid) {
        this.accessedpatientid = accessedpatientid;
    }

    public Date getAccessed() {
        return accessed;
    }

    public void setAccessed(Date accessed) {
        this.accessed = accessed;
    }

    public Integer getStaffidswitchuser() {
        return staffidswitchuser;
    }

    public void setStaffidswitchuser(Integer staffidswitchuser) {
        this.staffidswitchuser = staffidswitchuser;
    }

    public Date getAccessedswitchuser() {
        return accessedswitchuser;
    }

    public void setAccessedswitchuser(Date accessedswitchuser) {
        this.accessedswitchuser = accessedswitchuser;
    }

    public ModPatient getPatientid() {
        return patientid;
    }

    public void setPatientid(ModPatient patientid) {
        this.patientid = patientid;
    }

    public ModStaff getStaffid() {
        return staffid;
    }

    public void setStaffid(ModStaff staffid) {
        this.staffid = staffid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accessedpatientid != null ? accessedpatientid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModAccessedpatientGeneric)) {
            return false;
        }
        ModAccessedpatientGeneric other = (ModAccessedpatientGeneric) object;
        if ((this.accessedpatientid == null && other.accessedpatientid != null) || (this.accessedpatientid != null && !this.accessedpatientid.equals(other.accessedpatientid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModAccessedpatient[ accessedpatientid=" + accessedpatientid + " ]";
    }
    
}
