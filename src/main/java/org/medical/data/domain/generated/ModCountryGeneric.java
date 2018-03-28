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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_country")
public class ModCountryGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "countryid")
    private String countryid;
    @OneToMany(mappedBy = "countryid")
    private List<ModPatient> modPatientList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "countryid")
    private List<ModClinic> modClinicList;
    @JoinColumn(name = "dateformatid", referencedColumnName = "dateformatid")
    @ManyToOne(optional = false)
    private ModDateformat dateformatid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modCountry")
    private List<ModCountryname> modCountrynameList;
    @OneToMany(mappedBy = "countryid")
    private List<ModModule> modModuleList;

    public ModCountryGeneric() {
    }

    public ModCountryGeneric(String countryid) {
        this.countryid = countryid;
    }

    public String getCountryid() {
        return countryid;
    }

    public void setCountryid(String countryid) {
        this.countryid = countryid;
    }

    public List<ModPatient> getModPatientList() {
        return modPatientList;
    }

    public void setModPatientList(List<ModPatient> modPatientList) {
        this.modPatientList = modPatientList;
    }

    public List<ModClinic> getModClinicList() {
        return modClinicList;
    }

    public void setModClinicList(List<ModClinic> modClinicList) {
        this.modClinicList = modClinicList;
    }

    public ModDateformat getDateformatid() {
        return dateformatid;
    }

    public void setDateformatid(ModDateformat dateformatid) {
        this.dateformatid = dateformatid;
    }

    public List<ModCountryname> getModCountrynameList() {
        return modCountrynameList;
    }

    public void setModCountrynameList(List<ModCountryname> modCountrynameList) {
        this.modCountrynameList = modCountrynameList;
    }

    public List<ModModule> getModModuleList() {
        return modModuleList;
    }

    public void setModModuleList(List<ModModule> modModuleList) {
        this.modModuleList = modModuleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countryid != null ? countryid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModCountryGeneric)) {
            return false;
        }
        ModCountryGeneric other = (ModCountryGeneric) object;
        if ((this.countryid == null && other.countryid != null) || (this.countryid != null && !this.countryid.equals(other.countryid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModCountry[ countryid=" + countryid + " ]";
    }
    
}
