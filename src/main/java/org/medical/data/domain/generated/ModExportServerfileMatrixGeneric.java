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
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_export_serverfile_matrix")
public class ModExportServerfileMatrixGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MATRIXCELLID")
    private Long matrixcellid;
    @Basic(optional = false)
    @Column(name = "EXPORTID")
    private int exportid;
    @Basic(optional = false)
    @Column(name = "FILETYPEID")
    private int filetypeid;
    @Basic(optional = false)
    @Column(name = "ROWTYPEID")
    private int rowtypeid;
    @Basic(optional = false)
    @Column(name = "ROWINDEX")
    private int rowindex;
    @Basic(optional = false)
    @Column(name = "COLINDEX")
    private int colindex;
    @Column(name = "MATRIXCELLDATA",columnDefinition = "text")
    private String matrixcelldata;
    @Column(name = "CREATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdt;
    @Column(name = "UPDATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedt;

    public ModExportServerfileMatrixGeneric() {
    }

    public ModExportServerfileMatrixGeneric(Long matrixcellid) {
        this.matrixcellid = matrixcellid;
    }

    public ModExportServerfileMatrixGeneric(Long matrixcellid, int exportid, int filetypeid, int rowtypeid, int rowindex, int colindex) {
        this.matrixcellid = matrixcellid;
        this.exportid = exportid;
        this.filetypeid = filetypeid;
        this.rowtypeid = rowtypeid;
        this.rowindex = rowindex;
        this.colindex = colindex;
    }

    public Long getMatrixcellid() {
        return matrixcellid;
    }

    public void setMatrixcellid(Long matrixcellid) {
        this.matrixcellid = matrixcellid;
    }

    public int getExportid() {
        return exportid;
    }

    public void setExportid(int exportid) {
        this.exportid = exportid;
    }

    public int getFiletypeid() {
        return filetypeid;
    }

    public void setFiletypeid(int filetypeid) {
        this.filetypeid = filetypeid;
    }

    public int getRowtypeid() {
        return rowtypeid;
    }

    public void setRowtypeid(int rowtypeid) {
        this.rowtypeid = rowtypeid;
    }

    public int getRowindex() {
        return rowindex;
    }

    public void setRowindex(int rowindex) {
        this.rowindex = rowindex;
    }

    public int getColindex() {
        return colindex;
    }

    public void setColindex(int colindex) {
        this.colindex = colindex;
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
        hash += (matrixcellid != null ? matrixcellid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModExportServerfileMatrixGeneric)) {
            return false;
        }
        ModExportServerfileMatrixGeneric other = (ModExportServerfileMatrixGeneric) object;
        if ((this.matrixcellid == null && other.matrixcellid != null) || (this.matrixcellid != null && !this.matrixcellid.equals(other.matrixcellid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModExportServerfileMatrix[ matrixcellid=" + matrixcellid + " ]";
    }
    
}
