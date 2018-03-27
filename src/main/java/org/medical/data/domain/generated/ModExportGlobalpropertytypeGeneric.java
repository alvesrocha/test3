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
@Table(name = "mod_export_globalpropertytype")
public class ModExportGlobalpropertytypeGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PROPTYPEID")
    private Integer proptypeid;
    @Basic(optional = false)
    @Column(name = "PROPERTYNAME")
    private String propertyname;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "CREATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdt;
    @Column(name = "UPDATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proptypeid")
    private List<ModExportGlobalproperty> modExportGlobalpropertyList;

    public ModExportGlobalpropertytypeGeneric() {
    }

    public ModExportGlobalpropertytypeGeneric(Integer proptypeid) {
        this.proptypeid = proptypeid;
    }

    public ModExportGlobalpropertytypeGeneric(Integer proptypeid, String propertyname, String description) {
        this.proptypeid = proptypeid;
        this.propertyname = propertyname;
        this.description = description;
    }

    public Integer getProptypeid() {
        return proptypeid;
    }

    public void setProptypeid(Integer proptypeid) {
        this.proptypeid = proptypeid;
    }

    public String getPropertyname() {
        return propertyname;
    }

    public void setPropertyname(String propertyname) {
        this.propertyname = propertyname;
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

    public List<ModExportGlobalproperty> getModExportGlobalpropertyList() {
        return modExportGlobalpropertyList;
    }

    public void setModExportGlobalpropertyList(List<ModExportGlobalproperty> modExportGlobalpropertyList) {
        this.modExportGlobalpropertyList = modExportGlobalpropertyList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proptypeid != null ? proptypeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModExportGlobalpropertytypeGeneric)) {
            return false;
        }
        ModExportGlobalpropertytypeGeneric other = (ModExportGlobalpropertytypeGeneric) object;
        if ((this.proptypeid == null && other.proptypeid != null) || (this.proptypeid != null && !this.proptypeid.equals(other.proptypeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModExportGlobalpropertytype[ proptypeid=" + proptypeid + " ]";
    }
    
}
