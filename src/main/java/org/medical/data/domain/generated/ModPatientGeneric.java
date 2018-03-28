/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_patient")
public class ModPatientGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "patientid")
    private Integer patientid;
    @Column(name = "ssn")
    private String ssn;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "dateofbirth")
    @Temporal(TemporalType.DATE)
    private Date dateofbirth;
    @Column(name = "hashcode")
    private String hashcode;
    @Column(name = "modified")
    @Temporal(TemporalType.DATE)
    private Date modified;
    @Column(name = "accessed")
    @Temporal(TemporalType.TIMESTAMP)
    private Date accessed;
    @Column(name = "hashedssn")
    private String hashedssn;
    @Column(name = "hashcode1")
    private String hashcode1;
    @Column(name = "modifiedswitchuser")
    @Temporal(TemporalType.DATE)
    private Date modifiedswitchuser;
    @Column(name = "dateofdeath")
    @Temporal(TemporalType.DATE)
    private Date dateofdeath;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patientid")
    private List<ModAccessedpatient> modAccessedpatientList;
    @JoinColumn(name = "countryid", referencedColumnName = "countryid")
    @ManyToOne
    private ModCountry countryid;
    @JoinColumn(name = "langid", referencedColumnName = "langid")
    @ManyToOne
    private ModLang langid;
    @JoinColumn(name = "modifiedby", referencedColumnName = "userid")
    @ManyToOne
    private ModUser modifiedby;
    @JoinColumn(name = "modifiedbyswitchuser", referencedColumnName = "userid")
    @ManyToOne
    private ModUser modifiedbyswitchuser;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patientid")
    private List<ModPatientclinic> modPatientclinicList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modPatient")
    private List<ModPatientfielddata> modPatientfielddataList;

    public ModPatientGeneric() {
    }

    public ModPatientGeneric(Integer patientid) {
        this.patientid = patientid;
    }

    public ModPatientGeneric(Integer patientid, String gender, Date dateofbirth) {
        this.patientid = patientid;
        this.gender = gender;
        this.dateofbirth = dateofbirth;
    }

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getHashcode() {
        return hashcode;
    }

    public void setHashcode(String hashcode) {
        this.hashcode = hashcode;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getAccessed() {
        return accessed;
    }

    public void setAccessed(Date accessed) {
        this.accessed = accessed;
    }

    public String getHashedssn() {
        return hashedssn;
    }

    public void setHashedssn(String hashedssn) {
        this.hashedssn = hashedssn;
    }

    public String getHashcode1() {
        return hashcode1;
    }

    public void setHashcode1(String hashcode1) {
        this.hashcode1 = hashcode1;
    }

    public Date getModifiedswitchuser() {
        return modifiedswitchuser;
    }

    public void setModifiedswitchuser(Date modifiedswitchuser) {
        this.modifiedswitchuser = modifiedswitchuser;
    }

    public Date getDateofdeath() {
        return dateofdeath;
    }

    public void setDateofdeath(Date dateofdeath) {
        this.dateofdeath = dateofdeath;
    }

    public List<ModAccessedpatient> getModAccessedpatientList() {
        return modAccessedpatientList;
    }

    public void setModAccessedpatientList(List<ModAccessedpatient> modAccessedpatientList) {
        this.modAccessedpatientList = modAccessedpatientList;
    }

    public ModCountry getCountryid() {
        return countryid;
    }

    public void setCountryid(ModCountry countryid) {
        this.countryid = countryid;
    }

    public ModLang getLangid() {
        return langid;
    }

    public void setLangid(ModLang langid) {
        this.langid = langid;
    }

    public ModUser getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(ModUser modifiedby) {
        this.modifiedby = modifiedby;
    }

    public ModUser getModifiedbyswitchuser() {
        return modifiedbyswitchuser;
    }

    public void setModifiedbyswitchuser(ModUser modifiedbyswitchuser) {
        this.modifiedbyswitchuser = modifiedbyswitchuser;
    }

    public List<ModPatientclinic> getModPatientclinicList() {
        return modPatientclinicList;
    }

    public void setModPatientclinicList(List<ModPatientclinic> modPatientclinicList) {
        this.modPatientclinicList = modPatientclinicList;
    }

    public List<ModPatientfielddata> getModPatientfielddataList() {
        return modPatientfielddataList;
    }

    public void setModPatientfielddataList(List<ModPatientfielddata> modPatientfielddataList) {
        this.modPatientfielddataList = modPatientfielddataList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patientid != null ? patientid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModPatientGeneric)) {
            return false;
        }
        ModPatientGeneric other = (ModPatientGeneric) object;
        if ((this.patientid == null && other.patientid != null) || (this.patientid != null && !this.patientid.equals(other.patientid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModPatient[ patientid=" + patientid + " ]";
    }
    
}
