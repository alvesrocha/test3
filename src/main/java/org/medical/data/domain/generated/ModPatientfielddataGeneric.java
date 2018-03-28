/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
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
@Table(name = "mod_patientfielddata")
public class ModPatientfielddataGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModPatientfielddataPK modPatientfielddataPK;
    @Column(name = "charvalue")
    private String charvalue;
    @Column(name = "datevalue")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datevalue;
    @Column(name = "hashvalue")
    private String hashvalue;
    @JoinColumn(name = "patientid", referencedColumnName = "patientid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModPatient modPatient;
    @JoinColumn(name = "fieldid", referencedColumnName = "fieldid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModPatientfields modPatientfields;

    public ModPatientfielddataGeneric() {
    }

    public ModPatientfielddataGeneric(ModPatientfielddataPK modPatientfielddataPK) {
        this.modPatientfielddataPK = modPatientfielddataPK;
    }

    public ModPatientfielddataGeneric(int patientid, int fieldid) {
        this.modPatientfielddataPK = new ModPatientfielddataPK(patientid, fieldid);
    }

    public ModPatientfielddataPK getModPatientfielddataPK() {
        return modPatientfielddataPK;
    }

    public void setModPatientfielddataPK(ModPatientfielddataPK modPatientfielddataPK) {
        this.modPatientfielddataPK = modPatientfielddataPK;
    }

    public String getCharvalue() {
        return charvalue;
    }

    public void setCharvalue(String charvalue) {
        this.charvalue = charvalue;
    }

    public Date getDatevalue() {
        return datevalue;
    }

    public void setDatevalue(Date datevalue) {
        this.datevalue = datevalue;
    }

    public String getHashvalue() {
        return hashvalue;
    }

    public void setHashvalue(String hashvalue) {
        this.hashvalue = hashvalue;
    }

    public ModPatient getModPatient() {
        return modPatient;
    }

    public void setModPatient(ModPatient modPatient) {
        this.modPatient = modPatient;
    }

    public ModPatientfields getModPatientfields() {
        return modPatientfields;
    }

    public void setModPatientfields(ModPatientfields modPatientfields) {
        this.modPatientfields = modPatientfields;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modPatientfielddataPK != null ? modPatientfielddataPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModPatientfielddataGeneric)) {
            return false;
        }
        ModPatientfielddataGeneric other = (ModPatientfielddataGeneric) object;
        if ((this.modPatientfielddataPK == null && other.modPatientfielddataPK != null) || (this.modPatientfielddataPK != null && !this.modPatientfielddataPK.equals(other.modPatientfielddataPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModPatientfielddata[ modPatientfielddataPK=" + modPatientfielddataPK + " ]";
    }
    
}
