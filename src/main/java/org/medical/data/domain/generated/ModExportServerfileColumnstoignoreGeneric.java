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
@Table(name = "mod_export_serverfile_columnstoignore")
public class ModExportServerfileColumnstoignoreGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COLUMNTOIGNOREID")
    private Integer columntoignoreid;
    @Basic(optional = false)
    @Column(name = "COLINDEX")
    private int colindex;
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

    public ModExportServerfileColumnstoignoreGeneric() {
    }

    public ModExportServerfileColumnstoignoreGeneric(Integer columntoignoreid) {
        this.columntoignoreid = columntoignoreid;
    }

    public ModExportServerfileColumnstoignoreGeneric(Integer columntoignoreid, int colindex) {
        this.columntoignoreid = columntoignoreid;
        this.colindex = colindex;
    }

    public Integer getColumntoignoreid() {
        return columntoignoreid;
    }

    public void setColumntoignoreid(Integer columntoignoreid) {
        this.columntoignoreid = columntoignoreid;
    }

    public int getColindex() {
        return colindex;
    }

    public void setColindex(int colindex) {
        this.colindex = colindex;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (columntoignoreid != null ? columntoignoreid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModExportServerfileColumnstoignoreGeneric)) {
            return false;
        }
        ModExportServerfileColumnstoignoreGeneric other = (ModExportServerfileColumnstoignoreGeneric) object;
        if ((this.columntoignoreid == null && other.columntoignoreid != null) || (this.columntoignoreid != null && !this.columntoignoreid.equals(other.columntoignoreid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModExportServerfileColumnstoignore[ columntoignoreid=" + columntoignoreid + " ]";
    }
    
}
