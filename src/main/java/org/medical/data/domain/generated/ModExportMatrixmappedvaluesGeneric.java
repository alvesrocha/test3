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
@Table(name = "mod_export_matrixmappedvalues")
public class ModExportMatrixmappedvaluesGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MAPPEDVALUEID")
    private Integer mappedvalueid;
    @Basic(optional = false)
    @Column(name = "MATRIXCELLID")
    private long matrixcellid;
    @Column(name = "SUBCOLINDEX")
    private Integer subcolindex;
    @Column(name = "MATRIXCELLDATA",columnDefinition = "text")
    private String matrixcelldata;
    @Column(name = "CREATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdt;
    @Column(name = "UPDATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedt;

    public ModExportMatrixmappedvaluesGeneric() {
    }

    public ModExportMatrixmappedvaluesGeneric(Integer mappedvalueid) {
        this.mappedvalueid = mappedvalueid;
    }

    public ModExportMatrixmappedvaluesGeneric(Integer mappedvalueid, long matrixcellid) {
        this.mappedvalueid = mappedvalueid;
        this.matrixcellid = matrixcellid;
    }

    public Integer getMappedvalueid() {
        return mappedvalueid;
    }

    public void setMappedvalueid(Integer mappedvalueid) {
        this.mappedvalueid = mappedvalueid;
    }

    public long getMatrixcellid() {
        return matrixcellid;
    }

    public void setMatrixcellid(long matrixcellid) {
        this.matrixcellid = matrixcellid;
    }

    public Integer getSubcolindex() {
        return subcolindex;
    }

    public void setSubcolindex(Integer subcolindex) {
        this.subcolindex = subcolindex;
    }

    public String getMatrixcelldata() {
        return matrixcelldata;
    }

    public void setMatrixcelldata(String matrixcelldata) {
        this.matrixcelldata = matrixcelldata;
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
        hash += (mappedvalueid != null ? mappedvalueid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModExportMatrixmappedvaluesGeneric)) {
            return false;
        }
        ModExportMatrixmappedvaluesGeneric other = (ModExportMatrixmappedvaluesGeneric) object;
        if ((this.mappedvalueid == null && other.mappedvalueid != null) || (this.mappedvalueid != null && !this.mappedvalueid.equals(other.mappedvalueid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModExportMatrixmappedvalues[ mappedvalueid=" + mappedvalueid + " ]";
    }
    
}
