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
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_export_perlstepname")
public class ModExportPerlstepnameGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "STEPID")
    private Integer stepid;
    @Basic(optional = false)
    @Column(name = "STEPNAME")
    private String stepname;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "CREATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdt;
    @Column(name = "UPDATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stepid")
    private List<ModExportPerlexecutionstatus> modExportPerlexecutionstatusList;

    public ModExportPerlstepnameGeneric() {
    }

    public ModExportPerlstepnameGeneric(Integer stepid) {
        this.stepid = stepid;
    }

    public ModExportPerlstepnameGeneric(Integer stepid, String stepname, String description) {
        this.stepid = stepid;
        this.stepname = stepname;
        this.description = description;
    }

    public Integer getStepid() {
        return stepid;
    }

    public void setStepid(Integer stepid) {
        this.stepid = stepid;
    }

    public String getStepname() {
        return stepname;
    }

    public void setStepname(String stepname) {
        this.stepname = stepname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }

    public Date getUpdatedt() {
        return updatedt;
    }

    public void setUpdatedt(Date updatedt) {
        this.updatedt = updatedt;
    }

    public List<ModExportPerlexecutionstatus> getModExportPerlexecutionstatusList() {
        return modExportPerlexecutionstatusList;
    }

    public void setModExportPerlexecutionstatusList(List<ModExportPerlexecutionstatus> modExportPerlexecutionstatusList) {
        this.modExportPerlexecutionstatusList = modExportPerlexecutionstatusList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stepid != null ? stepid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModExportPerlstepnameGeneric)) {
            return false;
        }
        ModExportPerlstepnameGeneric other = (ModExportPerlstepnameGeneric) object;
        if ((this.stepid == null && other.stepid != null) || (this.stepid != null && !this.stepid.equals(other.stepid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModExportPerlstepname[ stepid=" + stepid + " ]";
    }
    
}
