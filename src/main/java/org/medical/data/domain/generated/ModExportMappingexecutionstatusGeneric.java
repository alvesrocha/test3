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
@Table(name = "mod_export_mappingexecutionstatus")
public class ModExportMappingexecutionstatusGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EXECSTATUSID")
    private Integer execstatusid;
    @Basic(optional = false)
    @Column(name = "EXPORTID")
    private int exportid;
    @Basic(optional = false)
    @Column(name = "FILETYPEID")
    private int filetypeid;
    @Basic(optional = false)
    @Column(name = "FUNCTIONID")
    private int functionid;
    @Column(name = "COLINDEX")
    private Integer colindex;
    @Column(name = "CREATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdt;
    @Column(name = "UPDATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedt;
    @Column(name = "COMPLETED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date completed;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "ERRORCODE")
    private Integer errorcode;
    @Column(name = "ERRORMSG")
    private String errormsg;

    public ModExportMappingexecutionstatusGeneric() {
    }

    public ModExportMappingexecutionstatusGeneric(Integer execstatusid) {
        this.execstatusid = execstatusid;
    }

    public ModExportMappingexecutionstatusGeneric(Integer execstatusid, int exportid, int filetypeid, int functionid) {
        this.execstatusid = execstatusid;
        this.exportid = exportid;
        this.filetypeid = filetypeid;
        this.functionid = functionid;
    }

    public Integer getExecstatusid() {
        return execstatusid;
    }

    public void setExecstatusid(Integer execstatusid) {
        this.execstatusid = execstatusid;
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

    public int getFunctionid() {
        return functionid;
    }

    public void setFunctionid(int functionid) {
        this.functionid = functionid;
    }

    public Integer getColindex() {
        return colindex;
    }

    public void setColindex(Integer colindex) {
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

    public Date getCompleted() {
        return completed;
    }

    public void setCompleted(Date completed) {
        this.completed = completed;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(Integer errorcode) {
        this.errorcode = errorcode;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (execstatusid != null ? execstatusid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModExportMappingexecutionstatusGeneric)) {
            return false;
        }
        ModExportMappingexecutionstatusGeneric other = (ModExportMappingexecutionstatusGeneric) object;
        if ((this.execstatusid == null && other.execstatusid != null) || (this.execstatusid != null && !this.execstatusid.equals(other.execstatusid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModExportMappingexecutionstatus[ execstatusid=" + execstatusid + " ]";
    }
    
}
