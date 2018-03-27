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
@Table(name = "mod_export_filetype")
public class ModExportFiletypeGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "FILETYPEID")
    private Integer filetypeid;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "CREATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdt;
    @Column(name = "UPDATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "filetypeid")
    private List<ModExportServerfileColumnstomap> modExportServerfileColumnstomapList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "filetypeid")
    private List<ModExportServerfileColumnstoignore> modExportServerfileColumnstoignoreList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "filetypeid")
    private List<ModExportServerfileSelectedfieldids> modExportServerfileSelectedfieldidsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "filetypeid")
    private List<ModExportPerlexecutionstatus> modExportPerlexecutionstatusList;

    public ModExportFiletypeGeneric() {
    }

    public ModExportFiletypeGeneric(Integer filetypeid) {
        this.filetypeid = filetypeid;
    }

    public ModExportFiletypeGeneric(Integer filetypeid, String description) {
        this.filetypeid = filetypeid;
        this.description = description;
    }

    public Integer getFiletypeid() {
        return filetypeid;
    }

    public void setFiletypeid(Integer filetypeid) {
        this.filetypeid = filetypeid;
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

    public List<ModExportServerfileColumnstomap> getModExportServerfileColumnstomapList() {
        return modExportServerfileColumnstomapList;
    }

    public void setModExportServerfileColumnstomapList(List<ModExportServerfileColumnstomap> modExportServerfileColumnstomapList) {
        this.modExportServerfileColumnstomapList = modExportServerfileColumnstomapList;
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

    public List<ModExportPerlexecutionstatus> getModExportPerlexecutionstatusList() {
        return modExportPerlexecutionstatusList;
    }

    public void setModExportPerlexecutionstatusList(List<ModExportPerlexecutionstatus> modExportPerlexecutionstatusList) {
        this.modExportPerlexecutionstatusList = modExportPerlexecutionstatusList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (filetypeid != null ? filetypeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModExportFiletypeGeneric)) {
            return false;
        }
        ModExportFiletypeGeneric other = (ModExportFiletypeGeneric) object;
        if ((this.filetypeid == null && other.filetypeid != null) || (this.filetypeid != null && !this.filetypeid.equals(other.filetypeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModExportFiletype[ filetypeid=" + filetypeid + " ]";
    }
    
}
