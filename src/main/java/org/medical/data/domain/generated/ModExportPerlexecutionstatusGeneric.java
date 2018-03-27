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
@Table(name = "mod_export_perlexecutionstatus")
public class ModExportPerlexecutionstatusGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EXECSTATUSID")
    private Integer execstatusid;
    @Basic(optional = false)
    @Column(name = "EXPORTID")
    private int exportid;
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
    @JoinColumn(name = "FILETYPEID", referencedColumnName = "FILETYPEID")
    @ManyToOne(optional = false)
    private ModExportFiletype filetypeid;
    @JoinColumn(name = "STEPID", referencedColumnName = "STEPID")
    @ManyToOne(optional = false)
    private ModExportPerlstepname stepid;

    public ModExportPerlexecutionstatusGeneric() {
    }

    public ModExportPerlexecutionstatusGeneric(Integer execstatusid) {
        this.execstatusid = execstatusid;
    }

    public ModExportPerlexecutionstatusGeneric(Integer execstatusid, int exportid) {
        this.execstatusid = execstatusid;
        this.exportid = exportid;
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

    public ModExportFiletype getFiletypeid() {
        return filetypeid;
    }

    public void setFiletypeid(ModExportFiletype filetypeid) {
        this.filetypeid = filetypeid;
    }

    public ModExportPerlstepname getStepid() {
        return stepid;
    }

    public void setStepid(ModExportPerlstepname stepid) {
        this.stepid = stepid;
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
        if (!(object instanceof ModExportPerlexecutionstatusGeneric)) {
            return false;
        }
        ModExportPerlexecutionstatusGeneric other = (ModExportPerlexecutionstatusGeneric) object;
        if ((this.execstatusid == null && other.execstatusid != null) || (this.execstatusid != null && !this.execstatusid.equals(other.execstatusid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModExportPerlexecutionstatus[ execstatusid=" + execstatusid + " ]";
    }
    
}
