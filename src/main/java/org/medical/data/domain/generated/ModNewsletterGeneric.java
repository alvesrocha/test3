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
import javax.persistence.ManyToMany;
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
@Table(name = "mod_newsletter")
public class ModNewsletterGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "newsletterid")
    private Integer newsletterid;
    @Column(name = "newslettername")
    private String newslettername;
    @Basic(optional = false)
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Column(name = "complete")
    private Boolean complete;
    @ManyToMany(mappedBy = "modNewsletterList")
    private List<ModClinic> modClinicList;
    @ManyToMany(mappedBy = "modNewsletterList")
    private List<ModModule> modModuleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modNewsletter")
    private List<ModNewsletterlang> modNewsletterlangList;

    public ModNewsletterGeneric() {
    }

    public ModNewsletterGeneric(Integer newsletterid) {
        this.newsletterid = newsletterid;
    }

    public ModNewsletterGeneric(Integer newsletterid, Date created) {
        this.newsletterid = newsletterid;
        this.created = created;
    }

    public Integer getNewsletterid() {
        return newsletterid;
    }

    public void setNewsletterid(Integer newsletterid) {
        this.newsletterid = newsletterid;
    }

    public String getNewslettername() {
        return newslettername;
    }

    public void setNewslettername(String newslettername) {
        this.newslettername = newslettername;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public List<ModClinic> getModClinicList() {
        return modClinicList;
    }

    public void setModClinicList(List<ModClinic> modClinicList) {
        this.modClinicList = modClinicList;
    }

    public List<ModModule> getModModuleList() {
        return modModuleList;
    }

    public void setModModuleList(List<ModModule> modModuleList) {
        this.modModuleList = modModuleList;
    }

    public List<ModNewsletterlang> getModNewsletterlangList() {
        return modNewsletterlangList;
    }

    public void setModNewsletterlangList(List<ModNewsletterlang> modNewsletterlangList) {
        this.modNewsletterlangList = modNewsletterlangList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (newsletterid != null ? newsletterid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModNewsletterGeneric)) {
            return false;
        }
        ModNewsletterGeneric other = (ModNewsletterGeneric) object;
        if ((this.newsletterid == null && other.newsletterid != null) || (this.newsletterid != null && !this.newsletterid.equals(other.newsletterid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModNewsletter[ newsletterid=" + newsletterid + " ]";
    }
    
}
