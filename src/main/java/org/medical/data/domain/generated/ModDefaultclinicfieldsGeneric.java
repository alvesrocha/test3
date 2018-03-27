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
@Table(name = "mod_defaultclinicfields")
public class ModDefaultclinicfieldsGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "fieldid")
    private Integer fieldid;
    @Basic(optional = false)
    @Column(name = "fieldposition")
    private int fieldposition;
    @Basic(optional = false)
    @Column(name = "lengthmin")
    private int lengthmin;
    @Basic(optional = false)
    @Column(name = "lengthmax")
    private int lengthmax;
    @Basic(optional = false)
    @Column(name = "fieldtype")
    private String fieldtype;
    @Basic(optional = false)
    @Column(name = "fixedfieldtype")
    private String fixedfieldtype;
    @Basic(optional = false)
    @Column(name = "additionalchar")
    private String additionalchar;
    @Basic(optional = false)
    @Column(name = "activated")
    private String activated;
    @Basic(optional = false)
    @Column(name = "editable")
    private String editable;
    @Basic(optional = false)
    @Column(name = "searchmask")
    private String searchmask;
    @Basic(optional = false)
    @Column(name = "usetime")
    private String usetime;
    @Column(name = "validationexp")
    private String validationexp;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modDefaultclinicfields")
    private List<ModDefaultclinicfieldlang> modDefaultclinicfieldlangList;

    public ModDefaultclinicfieldsGeneric() {
    }

    public ModDefaultclinicfieldsGeneric(Integer fieldid) {
        this.fieldid = fieldid;
    }

    public ModDefaultclinicfieldsGeneric(Integer fieldid, int fieldposition, int lengthmin, int lengthmax, String fieldtype, String fixedfieldtype, String additionalchar, String activated, String editable, String searchmask, String usetime) {
        this.fieldid = fieldid;
        this.fieldposition = fieldposition;
        this.lengthmin = lengthmin;
        this.lengthmax = lengthmax;
        this.fieldtype = fieldtype;
        this.fixedfieldtype = fixedfieldtype;
        this.additionalchar = additionalchar;
        this.activated = activated;
        this.editable = editable;
        this.searchmask = searchmask;
        this.usetime = usetime;
    }

    public Integer getFieldid() {
        return fieldid;
    }

    public void setFieldid(Integer fieldid) {
        this.fieldid = fieldid;
    }

    public int getFieldposition() {
        return fieldposition;
    }

    public void setFieldposition(int fieldposition) {
        this.fieldposition = fieldposition;
    }

    public int getLengthmin() {
        return lengthmin;
    }

    public void setLengthmin(int lengthmin) {
        this.lengthmin = lengthmin;
    }

    public int getLengthmax() {
        return lengthmax;
    }

    public void setLengthmax(int lengthmax) {
        this.lengthmax = lengthmax;
    }

    public String getFieldtype() {
        return fieldtype;
    }

    public void setFieldtype(String fieldtype) {
        this.fieldtype = fieldtype;
    }

    public String getFixedfieldtype() {
        return fixedfieldtype;
    }

    public void setFixedfieldtype(String fixedfieldtype) {
        this.fixedfieldtype = fixedfieldtype;
    }

    public String getAdditionalchar() {
        return additionalchar;
    }

    public void setAdditionalchar(String additionalchar) {
        this.additionalchar = additionalchar;
    }

    public String getActivated() {
        return activated;
    }

    public void setActivated(String activated) {
        this.activated = activated;
    }

    public String getEditable() {
        return editable;
    }

    public void setEditable(String editable) {
        this.editable = editable;
    }

    public String getSearchmask() {
        return searchmask;
    }

    public void setSearchmask(String searchmask) {
        this.searchmask = searchmask;
    }

    public String getUsetime() {
        return usetime;
    }

    public void setUsetime(String usetime) {
        this.usetime = usetime;
    }

    public String getValidationexp() {
        return validationexp;
    }

    public void setValidationexp(String validationexp) {
        this.validationexp = validationexp;
    }

    public List<ModDefaultclinicfieldlang> getModDefaultclinicfieldlangList() {
        return modDefaultclinicfieldlangList;
    }

    public void setModDefaultclinicfieldlangList(List<ModDefaultclinicfieldlang> modDefaultclinicfieldlangList) {
        this.modDefaultclinicfieldlangList = modDefaultclinicfieldlangList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldid != null ? fieldid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModDefaultclinicfieldsGeneric)) {
            return false;
        }
        ModDefaultclinicfieldsGeneric other = (ModDefaultclinicfieldsGeneric) object;
        if ((this.fieldid == null && other.fieldid != null) || (this.fieldid != null && !this.fieldid.equals(other.fieldid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModDefaultclinicfields[ fieldid=" + fieldid + " ]";
    }
    
}
