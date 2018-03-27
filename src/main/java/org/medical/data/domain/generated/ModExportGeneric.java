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
@Table(name = "mod_export")
public class ModExportGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EXPORTID")
    private Integer exportid;
    @Column(name = "CREATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdt;
    @Column(name = "UPDATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "exportid")
    private List<ModExportServerfileColumnstomap> modExportServerfileColumnstomapList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "exportid")
    private List<ModExportGlobalproperty> modExportGlobalpropertyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "exportid")
    private List<ModExportServerfileColumnstoignore> modExportServerfileColumnstoignoreList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "exportid")
    private List<ModExportServerfileSelectedfieldids> modExportServerfileSelectedfieldidsList;

    public ModExportGeneric() {
    }

    public ModExportGeneric(Integer exportid) {
        this.exportid = exportid;
    }

    public Integer getExportid() {
        return exportid;
    }

    public void setExportid(Integer exportid) {
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

    public List<ModExportServerfileColumnstomap> getModExportServerfileColumnstomapList() {
        return modExportServerfileColumnstomapList;
    }

    public void setModExportServerfileColumnstomapList(List<ModExportServerfileColumnstomap> modExportServerfileColumnstomapList) {
        this.modExportServerfileColumnstomapList = modExportServerfileColumnstomapList;
    }

    public List<ModExportGlobalproperty> getModExportGlobalpropertyList() {
        return modExportGlobalpropertyList;
    }

    public void setModExportGlobalpropertyList(List<ModExportGlobalproperty> modExportGlobalpropertyList) {
        this.modExportGlobalpropertyList = modExportGlobalpropertyList;
    }

    public List<ModExportServerfileColumnstoignore> getModExportServerfileColumnstoignoreList() {
        return modExportServerfileColumnstoignoreList;
    }

    public void setModExportServerfileColumnstoignoreList(List<ModExportServerfileColumnstoignore> modExportServerfileColumnstoignoreList) {
        this.modExportServerfileColumnstoignoreList = modExportServerfileColumnstoignoreList;
    }

    public List<ModExportServerfileSelectedfieldids> getModExportServerfileSelectedfieldidsList() {
        return modExportServerfileSelectedfieldidsList;
    }

    public void setModExportServerfileSelectedfieldidsList(List<ModExportServerfileSelectedfieldids> modExportServerfileSelectedfieldidsList) {
        this.modExportServerfileSelectedfieldidsList = modExportServerfileSelectedfieldidsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exportid != null ? exportid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModExportGeneric)) {
            return false;
        }
        ModExportGeneric other = (ModExportGeneric) object;
        if ((this.exportid == null && other.exportid != null) || (this.exportid != null && !this.exportid.equals(other.exportid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModExport[ exportid=" + exportid + " ]";
    }
    
}
