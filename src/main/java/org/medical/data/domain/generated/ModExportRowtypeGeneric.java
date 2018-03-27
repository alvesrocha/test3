/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_export_rowtype")
public class ModExportRowtypeGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ROWTYPEID")
    private Integer rowtypeid;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "CREATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdt;
    @Column(name = "UPDATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedt;

    public ModExportRowtypeGeneric() {
    }

    public ModExportRowtypeGeneric(Integer rowtypeid) {
        this.rowtypeid = rowtypeid;
    }

    public ModExportRowtypeGeneric(Integer rowtypeid, String description) {
        this.rowtypeid = rowtypeid;
        this.description = description;
    }

    public Integer getRowtypeid() {
        return rowtypeid;
    }

    public void setRowtypeid(Integer rowtypeid) {
        this.rowtypeid = rowtypeid;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rowtypeid != null ? rowtypeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModExportRowtypeGeneric)) {
            return false;
        }
        ModExportRowtypeGeneric other = (ModExportRowtypeGeneric) object;
        if ((this.rowtypeid == null && other.rowtypeid != null) || (this.rowtypeid != null && !this.rowtypeid.equals(other.rowtypeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModExportRowtype[ rowtypeid=" + rowtypeid + " ]";
    }
    
}
