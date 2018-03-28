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
@Table(name = "mod_lang")
public class ModLangGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "langid")
    private String langid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modLang")
    private List<ModText> modTextList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modLang")
    private List<ModApplicationfieldlang> modApplicationfieldlangList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modLang")
    private List<ModModulelang> modModulelangList;
    @OneToMany(mappedBy = "langid")
    private List<ModPatient> modPatientList;
    @OneToMany(mappedBy = "langid")
    private List<ModUser> modUserList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modLang")
    private List<ModLangname> modLangnameList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modLang1")
    private List<ModLangname> modLangnameList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modLang")
    private List<ModNewsletterlang> modNewsletterlangList;
    @OneToMany(mappedBy = "langid")
    private List<ModClinic> modClinicList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modLang")
    private List<ModClinicfieldlang> modClinicfieldlangList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modLang")
    private List<ModFieldoptionlang> modFieldoptionlangList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modLang")
    private List<ModPatientfieldlang> modPatientfieldlangList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modLang")
    private List<ModStafffieldlang> modStafffieldlangList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modLang")
    private List<ModPatientdischargereasonlang> modPatientdischargereasonlangList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modLang")
    private List<ModDefaultclinicfieldlang> modDefaultclinicfieldlangList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modLang")
    private List<ModCountryname> modCountrynameList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modLang")
    private List<ModDefaultdeptfieldlang> modDefaultdeptfieldlangList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modLang")
    private List<ModDeptfieldlang> modDeptfieldlangList;
    @OneToMany(mappedBy = "langid")
    private List<ModModule> modModuleList;

    public ModLangGeneric() {
    }

    public ModLangGeneric(String langid) {
        this.langid = langid;
    }

    public String getLangid() {
        return langid;
    }

    public void setLangid(String langid) {
        this.langid = langid;
    }

    public List<ModText> getModTextList() {
        return modTextList;
    }

    public void setModTextList(List<ModText> modTextList) {
        this.modTextList = modTextList;
    }

    public List<ModApplicationfieldlang> getModApplicationfieldlangList() {
        return modApplicationfieldlangList;
    }

    public void setModApplicationfieldlangList(List<ModApplicationfieldlang> modApplicationfieldlangList) {
        this.modApplicationfieldlangList = modApplicationfieldlangList;
    }

    public List<ModModulelang> getModModulelangList() {
        return modModulelangList;
    }

    public void setModModulelangList(List<ModModulelang> modModulelangList) {
        this.modModulelangList = modModulelangList;
    }

    public List<ModPatient> getModPatientList() {
        return modPatientList;
    }

    public void setModPatientList(List<ModPatient> modPatientList) {
        this.modPatientList = modPatientList;
    }

    public List<ModUser> getModUserList() {
        return modUserList;
    }

    public void setModUserList(List<ModUser> modUserList) {
        this.modUserList = modUserList;
    }

    public List<ModLangname> getModLangnameList() {
        return modLangnameList;
    }

    public void setModLangnameList(List<ModLangname> modLangnameList) {
        this.modLangnameList = modLangnameList;
    }

    public List<ModLangname> getModLangnameList1() {
        return modLangnameList1;
    }

    public void setModLangnameList1(List<ModLangname> modLangnameList1) {
        this.modLangnameList1 = modLangnameList1;
    }

    public List<ModNewsletterlang> getModNewsletterlangList() {
        return modNewsletterlangList;
    }

    public void setModNewsletterlangList(List<ModNewsletterlang> modNewsletterlangList) {
        this.modNewsletterlangList = modNewsletterlangList;
    }

    public List<ModClinic> getModClinicList() {
        return modClinicList;
    }

    public void setModClinicList(List<ModClinic> modClinicList) {
        this.modClinicList = modClinicList;
    }

    public List<ModClinicfieldlang> getModClinicfieldlangList() {
        return modClinicfieldlangList;
    }

    public void setModClinicfieldlangList(List<ModClinicfieldlang> modClinicfieldlangList) {
        this.modClinicfieldlangList = modClinicfieldlangList;
    }

    public List<ModFieldoptionlang> getModFieldoptionlangList() {
        return modFieldoptionlangList;
    }

    public void setModFieldoptionlangList(List<ModFieldoptionlang> modFieldoptionlangList) {
        this.modFieldoptionlangList = modFieldoptionlangList;
    }

    public List<ModPatientfieldlang> getModPatientfieldlangList() {
        return modPatientfieldlangList;
    }

    public void setModPatientfieldlangList(List<ModPatientfieldlang> modPatientfieldlangList) {
        this.modPatientfieldlangList = modPatientfieldlangList;
    }

    public List<ModStafffieldlang> getModStafffieldlangList() {
        return modStafffieldlangList;
    }

    public void setModStafffieldlangList(List<ModStafffieldlang> modStafffieldlangList) {
        this.modStafffieldlangList = modStafffieldlangList;
    }

    public List<ModPatientdischargereasonlang> getModPatientdischargereasonlangList() {
        return modPatientdischargereasonlangList;
    }

    public void setModPatientdischargereasonlangList(List<ModPatientdischargereasonlang> modPatientdischargereasonlangList) {
        this.modPatientdischargereasonlangList = modPatientdischargereasonlangList;
    }

    public List<ModDefaultclinicfieldlang> getModDefaultclinicfieldlangList() {
        return modDefaultclinicfieldlangList;
    }

    public void setModDefaultclinicfieldlangList(List<ModDefaultclinicfieldlang> modDefaultclinicfieldlangList) {
        this.modDefaultclinicfieldlangList = modDefaultclinicfieldlangList;
    }

    public List<ModCountryname> getModCountrynameList() {
        return modCountrynameList;
    }

    public void setModCountrynameList(List<ModCountryname> modCountrynameList) {
        this.modCountrynameList = modCountrynameList;
    }

    public List<ModDefaultdeptfieldlang> getModDefaultdeptfieldlangList() {
        return modDefaultdeptfieldlangList;
    }

    public void setModDefaultdeptfieldlangList(List<ModDefaultdeptfieldlang> modDefaultdeptfieldlangList) {
        this.modDefaultdeptfieldlangList = modDefaultdeptfieldlangList;
    }

    public List<ModDeptfieldlang> getModDeptfieldlangList() {
        return modDeptfieldlangList;
    }

    public void setModDeptfieldlangList(List<ModDeptfieldlang> modDeptfieldlangList) {
        this.modDeptfieldlangList = modDeptfieldlangList;
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
        hash += (langid != null ? langid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModLangGeneric)) {
            return false;
        }
        ModLangGeneric other = (ModLangGeneric) object;
        if ((this.langid == null && other.langid != null) || (this.langid != null && !this.langid.equals(other.langid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModLang[ langid=" + langid + " ]";
    }
    
}
