/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_modulejobsjson")
public class ModModulejobsjsonGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "jsondataid")
    private Integer jsondataid;
    @Lob
    @Column(name = "jsondata",columnDefinition = "mediumtext")
    private String jsondata;
    @JoinColumn(name = "jobid", referencedColumnName = "jobid")
    @ManyToOne(optional = false)
    private ModModulejobsservlet jobid;

    public ModModulejobsjsonGeneric() {
    }

    public ModModulejobsjsonGeneric(Integer jsondataid) {
        this.jsondataid = jsondataid;
    }

    public Integer getJsondataid() {
        return jsondataid;
    }

    public void setJsondataid(Integer jsondataid) {
        this.jsondataid = jsondataid;
    }

    public String getJsondata() {
        return jsondata;
    }

    public void setJsondata(String jsondata) {
        this.jsondata = jsondata;
    }

    public ModModulejobsservlet getJobid() {
        return jobid;
    }

    public void setJobid(ModModulejobsservlet jobid) {
        this.jobid = jobid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jsondataid != null ? jsondataid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModModulejobsjsonGeneric)) {
            return false;
        }
        ModModulejobsjsonGeneric other = (ModModulejobsjsonGeneric) object;
        if ((this.jsondataid == null && other.jsondataid != null) || (this.jsondataid != null && !this.jsondataid.equals(other.jsondataid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModModulejobsjson[ jsondataid=" + jsondataid + " ]";
    }
    
}
