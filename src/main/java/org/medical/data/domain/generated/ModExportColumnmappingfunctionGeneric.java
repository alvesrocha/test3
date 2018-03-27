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
@Table(name = "mod_export_columnmappingfunction")
public class ModExportColumnmappingfunctionGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "FUNCTIONID")
    private Integer functionid;
    @Basic(optional = false)
    @Column(name = "FUNCTIONNAME")
    private String functionname;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "CREATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdt;
    @Column(name = "UPDATEDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "functionid")
    private List<ModExportServerfileColumnstomap> modExportServerfileColumnstomapList;

    public ModExportColumnmappingfunctionGeneric() {
    }

    public ModExportColumnmappingfunctionGeneric(Integer functionid) {
        this.functionid = functionid;
    }

    public ModExportColumnmappingfunctionGeneric(Integer functionid, String functionname, String description) {
        this.functionid = functionid;
        this.functionname = functionname;
        this.description = description;
    }

    public Integer getFunctionid() {
        return functionid;
    }

    public void setFunctionid(Integer functionid) {
        this.functionid = functionid;
    }

    public String getFunctionname() {
        return functionname;
    }

    public void setFunctionname(String functionname) {
        this.functionname = functionname;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (functionid != null ? functionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModExportColumnmappingfunctionGeneric)) {
            return false;
        }
        ModExportColumnmappingfunctionGeneric other = (ModExportColumnmappingfunctionGeneric) object;
        if ((this.functionid == null && other.functionid != null) || (this.functionid != null && !this.functionid.equals(other.functionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModExportColumnmappingfunction[ functionid=" + functionid + " ]";
    }
    
}
