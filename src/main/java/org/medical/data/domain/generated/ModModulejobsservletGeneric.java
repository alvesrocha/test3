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
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.medical.data.domain.source.ModModulejobsjson;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_modulejobsservlet")
public class ModModulejobsservletGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "jobid")
    private Integer jobid;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "modulehandler")
    private String modulehandler;
    @Basic(optional = false)
    @Column(name = "jobcreatedate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date jobcreatedate;
    @Column(name = "jobfinishdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date jobfinishdate;
    @Column(name = "errortext",columnDefinition = "text")
    private String errortext;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jobid")
    private List<ModModulejobsjson> modModulejobsjsonList;

    public ModModulejobsservletGeneric() {
    }

    public ModModulejobsservletGeneric(Integer jobid) {
        this.jobid = jobid;
    }

    public ModModulejobsservletGeneric(Integer jobid, String status, String modulehandler, Date jobcreatedate) {
        this.jobid = jobid;
        this.status = status;
        this.modulehandler = modulehandler;
        this.jobcreatedate = jobcreatedate;
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getModulehandler() {
        return modulehandler;
    }

    public void setModulehandler(String modulehandler) {
        this.modulehandler = modulehandler;
    }

    public Date getJobcreatedate() {
        return jobcreatedate;
    }

    public void setJobcreatedate(Date jobcreatedate) {
        this.jobcreatedate = jobcreatedate;
    }

    public Date getJobfinishdate() {
        return jobfinishdate;
    }

    public void setJobfinishdate(Date jobfinishdate) {
        this.jobfinishdate = jobfinishdate;
    }

    public String getErrortext() {
        return errortext;
    }

    public void setErrortext(String errortext) {
        this.errortext = errortext;
    }

    public List<ModModulejobsjson> getModModulejobsjsonList() {
        return modModulejobsjsonList;
    }

    public void setModModulejobsjsonList(List<ModModulejobsjson> modModulejobsjsonList) {
        this.modModulejobsjsonList = modModulejobsjsonList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jobid != null ? jobid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModModulejobsservletGeneric)) {
            return false;
        }
        ModModulejobsservletGeneric other = (ModModulejobsservletGeneric) object;
        if ((this.jobid == null && other.jobid != null) || (this.jobid != null && !this.jobid.equals(other.jobid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModModulejobsservlet[ jobid=" + jobid + " ]";
    }
    
}
