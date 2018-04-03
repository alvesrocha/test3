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
@Table(name = "mod_module")
public class ModModuleGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "moduleid")
    private Integer moduleid;
    @Column(name = "logo1")
    private String logo1;
    @Column(name = "logo2")
    private String logo2;
    @Column(name = "url")
    private String url;
    @Column(name = "urlnat")
    private String urlnat;
    @Column(name = "smtpserver")
    private String smtpserver;
    @Column(name = "emailaddress4smtp")
    private String emailaddress4smtp;
    @Column(name = "modified")
    @Temporal(TemporalType.DATE)
    private Date modified;
    @Basic(optional = false)
    @Column(name = "memdocpublickey")
    private String memdocpublickey;
    @Basic(optional = false)
    @Column(name = "moduleprivatekey")
    private String moduleprivatekey;
    @Basic(optional = false)
    @Column(name = "modulepublickey")
    private String modulepublickey;
    @Basic(optional = false)
    @Column(name = "patientownerpolicy",columnDefinition="ENUM('M','C','D','U')")
    private String patientownerpolicy;
    @Basic(optional = false)
    @Column(name = "patientdeletepolicy",columnDefinition="ENUM('M','C','D','U')")
    private String patientdeletepolicy;
    @Basic(optional = false)
    @Column(name = "patientwritepolicy",columnDefinition="ENUM('M','C','D','U')")
    private String patientwritepolicy;
    @Basic(optional = false)
    @Column(name = "patientreadpolicy",columnDefinition="ENUM('M','C','D','U')")
    private String patientreadpolicy;
    @Basic(optional = false)
    @Column(name = "patientlistpolicy",columnDefinition="ENUM('M','C','D','U')")
    private String patientlistpolicy;
    @Basic(optional = false)
    @Column(name = "memdocurl")
    private String memdocurl;
    @Column(name = "emailaddress4config")
    private String emailaddress4config;
    @Basic(optional = false)
    @Column(name = "usecasenumber")
    private String usecasenumber;
    @Column(name = "usesalt")
    private String usesalt;
    @JoinTable(name = "mod_module_newsletter", joinColumns = {
        @JoinColumn(name = "moduleid", referencedColumnName = "moduleid")}, inverseJoinColumns = {
        @JoinColumn(name = "newsletterid", referencedColumnName = "newsletterid")})
    @ManyToMany
    private List<ModNewsletter> modNewsletterList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modModule")
    private List<ModModulelang> modModulelangList;
    @JoinColumn(name = "countryid", referencedColumnName = "countryid")
    @ManyToOne
    private ModCountry countryid;
    @JoinColumn(name = "langid", referencedColumnName = "langid")
    @ManyToOne
    private ModLang langid;
    @JoinColumn(name = "permissiongroupid", referencedColumnName = "permissiongroupid")
    @ManyToOne(optional = false)
    private ModPermissiongroup permissiongroupid;
    @JoinColumn(name = "moduleadmin", referencedColumnName = "userid")
    @ManyToOne
    private ModUser moduleadmin;
    @JoinColumn(name = "modifiedby", referencedColumnName = "userid")
    @ManyToOne
    private ModUser modifiedby;

    public ModModuleGeneric() {
    }

    public ModModuleGeneric(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public ModModuleGeneric(Integer moduleid, String memdocpublickey, String moduleprivatekey, String modulepublickey, String patientownerpolicy, String patientdeletepolicy, String patientwritepolicy, String patientreadpolicy, String patientlistpolicy, String memdocurl, String usecasenumber) {
        this.moduleid = moduleid;
        this.memdocpublickey = memdocpublickey;
        this.moduleprivatekey = moduleprivatekey;
        this.modulepublickey = modulepublickey;
        this.patientownerpolicy = patientownerpolicy;
        this.patientdeletepolicy = patientdeletepolicy;
        this.patientwritepolicy = patientwritepolicy;
        this.patientreadpolicy = patientreadpolicy;
        this.patientlistpolicy = patientlistpolicy;
        this.memdocurl = memdocurl;
        this.usecasenumber = usecasenumber;
    }

    public Integer getModuleid() {
        return moduleid;
    }

    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public String getLogo1() {
        return logo1;
    }

    public void setLogo1(String logo1) {
        this.logo1 = logo1;
    }

    public String getLogo2() {
        return logo2;
    }

    public void setLogo2(String logo2) {
        this.logo2 = logo2;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlnat() {
        return urlnat;
    }

    public void setUrlnat(String urlnat) {
        this.urlnat = urlnat;
    }

    public String getSmtpserver() {
        return smtpserver;
    }

    public void setSmtpserver(String smtpserver) {
        this.smtpserver = smtpserver;
    }

    public String getEmailaddress4smtp() {
        return emailaddress4smtp;
    }

    public void setEmailaddress4smtp(String emailaddress4smtp) {
        this.emailaddress4smtp = emailaddress4smtp;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getMemdocpublickey() {
        return memdocpublickey;
    }

    public void setMemdocpublickey(String memdocpublickey) {
        this.memdocpublickey = memdocpublickey;
    }

    public String getModuleprivatekey() {
        return moduleprivatekey;
    }

    public void setModuleprivatekey(String moduleprivatekey) {
        this.moduleprivatekey = moduleprivatekey;
    }

    public String getModulepublickey() {
        return modulepublickey;
    }

    public void setModulepublickey(String modulepublickey) {
        this.modulepublickey = modulepublickey;
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

    public String getMemdocurl() {
        return memdocurl;
    }

    public void setMemdocurl(String memdocurl) {
        this.memdocurl = memdocurl;
    }

    public String getEmailaddress4config() {
        return emailaddress4config;
    }

    public void setEmailaddress4config(String emailaddress4config) {
        this.emailaddress4config = emailaddress4config;
    }

    public String getUsecasenumber() {
        return usecasenumber;
    }

    public void setUsecasenumber(String usecasenumber) {
        this.usecasenumber = usecasenumber;
    }

    public String getUsesalt() {
        return usesalt;
    }

    public void setUsesalt(String usesalt) {
        this.usesalt = usesalt;
    }

    public List<ModNewsletter> getModNewsletterList() {
        return modNewsletterList;
    }

    public void setModNewsletterList(List<ModNewsletter> modNewsletterList) {
        this.modNewsletterList = modNewsletterList;
    }

    public List<ModModulelang> getModModulelangList() {
        return modModulelangList;
    }

    public void setModModulelangList(List<ModModulelang> modModulelangList) {
        this.modModulelangList = modModulelangList;
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

    public ModUser getModuleadmin() {
        return moduleadmin;
    }

    public void setModuleadmin(ModUser moduleadmin) {
        this.moduleadmin = moduleadmin;
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
        hash += (moduleid != null ? moduleid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModModuleGeneric)) {
            return false;
        }
        ModModuleGeneric other = (ModModuleGeneric) object;
        if ((this.moduleid == null && other.moduleid != null) || (this.moduleid != null && !this.moduleid.equals(other.moduleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModModule[ moduleid=" + moduleid + " ]";
    }
    
}
