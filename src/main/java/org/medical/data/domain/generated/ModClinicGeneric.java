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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "mod_clinic")
public class ModClinicGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "clinicid")
    private Integer clinicid;
    @Basic(optional = false)
    @Column(name = "clinicname")
    private String clinicname;
    @Column(name = "city")
    private String city;
    @Column(name = "logo")
    private String logo;
    @Column(name = "modified")
    @Temporal(TemporalType.DATE)
    private Date modified;
    @Basic(optional = false)
    @Column(name = "patientownerpolicy")
    private String patientownerpolicy;
    @Basic(optional = false)
    @Column(name = "patientdeletepolicy")
    private String patientdeletepolicy;
    @Basic(optional = false)
    @Column(name = "patientwritepolicy")
    private String patientwritepolicy;
    @Basic(optional = false)
    @Column(name = "patientreadpolicy")
    private String patientreadpolicy;
    @Basic(optional = false)
    @Column(name = "patientlistpolicy")
    private String patientlistpolicy;
    @Basic(optional = false)
    @Column(name = "usecasenumber")
    private String usecasenumber;
    @JoinTable(name = "mod_clinic_newsletter", joinColumns = {
        @JoinColumn(name = "clinicid", referencedColumnName = "clinicid")}, inverseJoinColumns = {
        @JoinColumn(name = "newsletterid", referencedColumnName = "newsletterid")})
    @ManyToMany
    private List<ModNewsletter> modNewsletterList;
    @OneToMany(mappedBy = "clinicid")
    private List<ModPatientfields> modPatientfieldsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clinicid")
    private List<ModDept> modDeptList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modClinic")
    private List<ModClinicfields> modClinicfieldsList;
    @JoinColumn(name = "countryid", referencedColumnName = "countryid")
    @ManyToOne(optional = false)
    private ModCountry countryid;
    @JoinColumn(name = "langid", referencedColumnName = "langid")
    @ManyToOne
    private ModLang langid;
    @JoinColumn(name = "permissiongroupid", referencedColumnName = "permissiongroupid")
    @ManyToOne(optional = false)
    private ModPermissiongroup permissiongroupid;
    @JoinColumn(name = "modifiedby", referencedColumnName = "userid")
    @ManyToOne
    private ModUser modifiedby;

    public ModClinicGeneric() {
    }

    public ModClinicGeneric(Integer clinicid) {
        this.clinicid = clinicid;
    }

    public ModClinicGeneric(Integer clinicid, String clinicname, String patientownerpolicy, String patientdeletepolicy, String patientwritepolicy, String patientreadpolicy, String patientlistpolicy, String usecasenumber) {
        this.clinicid = clinicid;
        this.clinicname = clinicname;
        this.patientownerpolicy = patientownerpolicy;
        this.patientdeletepolicy = patientdeletepolicy;
        this.patientwritepolicy = patientwritepolicy;
        this.patientreadpolicy = patientreadpolicy;
        this.patientlistpolicy = patientlistpolicy;
        this.usecasenumber = usecasenumber;
    }

    public Integer getClinicid() {
        return clinicid;
    }

    public void setClinicid(Integer clinicid) {
        this.clinicid = clinicid;
    }

    public String getClinicname() {
        return clinicname;
    }

    public void setClinicname(String clinicname) {
        this.clinicname = clinicname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getPatientownerpolicy() {
        return patientownerpolicy;
    }

    public void setPatientownerpolicy(String patientownerpolicy) {
        this.patientownerpolicy = patientownerpolicy;
    }

    public String getPatientdeletepolicy() {
        return patientdeletepolicy;
    }

    public void setPatientdeletepolicy(String patientdeletepolicy) {
        this.patientdeletepolicy = patientdeletepolicy;
    }

    public String getPatientwritepolicy() {
        return patientwritepolicy;
    }

    public void setPatientwritepolicy(String patientwritepolicy) {
        this.patientwritepolicy = patientwritepolicy;
    }

    public String getPatientreadpolicy() {
        return patientreadpolicy;
    }

    public void setPatientreadpolicy(String patientreadpolicy) {
        this.patientreadpolicy = patientreadpolicy;
    }

    public String getPatientlistpolicy() {
        return patientlistpolicy;
    }

    public void setPatientlistpolicy(String patientlistpolicy) {
        this.patientlistpolicy = patientlistpolicy;
    }

    public String getUsecasenumber() {
        return usecasenumber;
    }

    public void setUsecasenumber(String usecasenumber) {
        this.usecasenumber = usecasenumber;
    }

    public List<ModNewsletter> getModNewsletterList() {
        return modNewsletterList;
    }

    public void setModNewsletterList(List<ModNewsletter> modNewsletterList) {
        this.modNewsletterList = modNewsletterList;
    }

    public List<ModPatientfields> getModPatientfieldsList() {
        return modPatientfieldsList;
    }

    public void setModPatientfieldsList(List<ModPatientfields> modPatientfieldsList) {
        this.modPatientfieldsList = modPatientfieldsList;
    }

    public List<ModDept> getModDeptList() {
        return modDeptList;
    }

    public void setModDeptList(List<ModDept> modDeptList) {
        this.modDeptList = modDeptList;
    }

    public List<ModClinicfields> getModClinicfieldsList() {
        return modClinicfieldsList;
    }

    public void setModClinicfieldsList(List<ModClinicfields> modClinicfieldsList) {
        this.modClinicfieldsList = modClinicfieldsList;
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

    public ModPermissiongroup getPermissiongroupid() {
        return permissiongroupid;
    }

    public void setPermissiongroupid(ModPermissiongroup permissiongroupid) {
        this.permissiongroupid = permissiongroupid;
    }

    public ModUser getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(ModUser modifiedby) {
        this.modifiedby = modifiedby;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clinicid != null ? clinicid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModClinicGeneric)) {
            return false;
        }
        ModClinicGeneric other = (ModClinicGeneric) object;
        if ((this.clinicid == null && other.clinicid != null) || (this.clinicid != null && !this.clinicid.equals(other.clinicid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModClinic[ clinicid=" + clinicid + " ]";
    }
    
}
