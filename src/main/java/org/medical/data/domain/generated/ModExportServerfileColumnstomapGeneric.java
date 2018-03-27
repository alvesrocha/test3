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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_export_serverfile_columnstomap")
public class ModExportServerfileColumnstomapGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COLUMNTOMAPID")
    private Integer columntomapid;
    @Basic(optional = false)
    @Column(name = "COLINDEX")
    private int colindex;
    @Basic(optional = false)
    @Column(name = "ISIDENTIFIED")
    private String isidentified;
    @Column(name = "CREATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdt;
    @Column(name = "UPDATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedt;
    @JoinColumn(name = "EXPORTID", referencedColumnName = "EXPORTID")
    @ManyToOne(optional = false)
    private ModExport exportid;
    @JoinColumn(name = "FILETYPEID", referencedColumnName = "FILETYPEID")
    @ManyToOne(optional = false)
    private ModExportFiletype filetypeid;
    @JoinColumn(name = "FUNCTIONID", referencedColumnName = "FUNCTIONID")
    @ManyToOne(optional = false)
    private ModExportColumnmappingfunction functionid;

    public ModExportServerfileColumnstomapGeneric() {
    }

    public ModExportServerfileColumnstomapGeneric(Integer columntomapid) {
        this.columntomapid = columntomapid;
    }

    public ModExportServerfileColumnstomapGeneric(Integer columntomapid, int colindex, String isidentified) {
        this.columntomapid = columntomapid;
        this.colindex = colindex;
        this.isidentified = isidentified;
    }

    public Integer getColumntomapid() {
        return columntomapid;
    }

    public void setColumntomapid(Integer columntomapid) {
        this.columntomapid = columntomapid;
    }

    public int getColindex() {
        return colindex;
    }

    public void setColindex(int colindex) {
        this.colindex = colindex;
    }

    public String getIsidentified() {
        return isidentified;
    }

    public void setIsidentified(String isidentified) {
        this.isidentified = isidentified;
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

    public ModExport getExportid() {
        return exportid;
    }

    public void setExportid(ModExport exportid) {
        this.exportid = exportid;
    }

    public ModExportFiletype getFiletypeid() {
        return filetypeid;
    }

    public void setFiletypeid(ModExportFiletype filetypeid) {
        this.filetypeid = filetypeid;
    }

    public ModExportColumnmappingfunction getFunctionid() {
        return functionid;
    }

    public void setFunctionid(ModExportColumnmappingfunction functionid) {
        this.functionid = functionid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (columntomapid != null ? columntomapid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModExportServerfileColumnstomapGeneric)) {
            return false;
        }
        ModExportServerfileColumnstomapGeneric other = (ModExportServerfileColumnstomapGeneric) object;
        if ((this.columntomapid == null && other.columntomapid != null) || (this.columntomapid != null && !this.columntomapid.equals(other.columntomapid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModExportServerfileColumnstomap[ columntomapid=" + columntomapid + " ]";
    }
    
}
