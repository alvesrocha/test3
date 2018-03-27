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
@Table(name = "mod_export_globalproperty")
public class ModExportGlobalpropertyGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PROPINSTANCEID")
    private Integer propinstanceid;
    @Column(name = "PROPVALUE")
    private String propvalue;
    @Column(name = "CREATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdt;
    @Column(name = "UPDATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedt;
    @JoinColumn(name = "EXPORTID", referencedColumnName = "EXPORTID")
    @ManyToOne(optional = false)
    private ModExport exportid;
    @JoinColumn(name = "PROPTYPEID", referencedColumnName = "PROPTYPEID")
    @ManyToOne(optional = false)
    private ModExportGlobalpropertytype proptypeid;

    public ModExportGlobalpropertyGeneric() {
    }

    public ModExportGlobalpropertyGeneric(Integer propinstanceid) {
        this.propinstanceid = propinstanceid;
    }

    public Integer getPropinstanceid() {
        return propinstanceid;
    }

    public void setPropinstanceid(Integer propinstanceid) {
        this.propinstanceid = propinstanceid;
    }

    public String getPropvalue() {
        return propvalue;
    }

    public void setPropvalue(String propvalue) {
        this.propvalue = propvalue;
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

    public ModExportGlobalpropertytype getProptypeid() {
        return proptypeid;
    }

    public void setProptypeid(ModExportGlobalpropertytype proptypeid) {
        this.proptypeid = proptypeid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propinstanceid != null ? propinstanceid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModExportGlobalpropertyGeneric)) {
            return false;
        }
        ModExportGlobalpropertyGeneric other = (ModExportGlobalpropertyGeneric) object;
        if ((this.propinstanceid == null && other.propinstanceid != null) || (this.propinstanceid != null && !this.propinstanceid.equals(other.propinstanceid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModExportGlobalproperty[ propinstanceid=" + propinstanceid + " ]";
    }
    
}
