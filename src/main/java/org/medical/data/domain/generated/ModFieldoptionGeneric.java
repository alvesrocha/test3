/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;
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
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_fieldoption")
public class ModFieldoptionGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "fieldoptionid")
    private Integer fieldoptionid;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "fieldid")
    private int fieldid;
    @Basic(optional = false)
    @Column(name = "internalname")
    private String internalname;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modFieldoption")
    private List<ModFieldoptionlang> modFieldoptionlangList;

    public ModFieldoptionGeneric() {
    }

    public ModFieldoptionGeneric(Integer fieldoptionid) {
        this.fieldoptionid = fieldoptionid;
    }

    public ModFieldoptionGeneric(Integer fieldoptionid, String type, int fieldid, String internalname) {
        this.fieldoptionid = fieldoptionid;
        this.type = type;
        this.fieldid = fieldid;
        this.internalname = internalname;
    }

    public Integer getFieldoptionid() {
        return fieldoptionid;
    }

    public void setFieldoptionid(Integer fieldoptionid) {
        this.fieldoptionid = fieldoptionid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFieldid() {
        return fieldid;
    }

    public void setFieldid(int fieldid) {
        this.fieldid = fieldid;
    }

    public String getInternalname() {
        return internalname;
    }

    public void setInternalname(String internalname) {
        this.internalname = internalname;
    }

    public List<ModFieldoptionlang> getModFieldoptionlangList() {
        return modFieldoptionlangList;
    }

    public void setModFieldoptionlangList(List<ModFieldoptionlang> modFieldoptionlangList) {
        this.modFieldoptionlangList = modFieldoptionlangList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldoptionid != null ? fieldoptionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModFieldoptionGeneric)) {
            return false;
        }
        ModFieldoptionGeneric other = (ModFieldoptionGeneric) object;
        if ((this.fieldoptionid == null && other.fieldoptionid != null) || (this.fieldoptionid != null && !this.fieldoptionid.equals(other.fieldoptionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModFieldoption[ fieldoptionid=" + fieldoptionid + " ]";
    }
    
}
