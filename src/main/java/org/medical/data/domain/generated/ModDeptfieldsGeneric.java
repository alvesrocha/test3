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
import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_deptfields")
public class ModDeptfieldsGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModDeptfieldsPK modDeptfieldsPK;
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
    @Column(name = "fieldtype",columnDefinition="enum('date','number','alpha','alphanumeric','all','multiplechoice','dropdown','checkbox','radiobutton')")
    private String fieldtype;
    @Column(name = "fixedfieldtype",columnDefinition="enum('none','name','weightadaption')")
    private String fixedfieldtype;
    @Basic(optional = false)
    @Column(name = "additionalchar")
    private String additionalchar;
    @Basic(optional = false)
    @Column(name = "activated",columnDefinition="enum('y','n')")
    private String activated;
    @Basic(optional = false)
    @Column(name = "editable",columnDefinition="enum('y','n')")
    private String editable;
    @Basic(optional = false)
    @Column(name = "searchmask",columnDefinition="enum('y','n')")
    private String searchmask;
    @Basic(optional = false)
    @Column(name = "usetime",columnDefinition="enum('y','n')")
    private String usetime;
    @Column(name = "validationexp")
    private String validationexp;
    @JoinColumn(name = "deptid", referencedColumnName = "deptid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModDept modDept;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "modDeptfields")
    private ModDeptfielddata modDeptfielddata;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modDeptfields")
    private List<ModDeptfieldlang> modDeptfieldlangList;

    public ModDeptfieldsGeneric() {
    }

    public ModDeptfieldsGeneric(ModDeptfieldsPK modDeptfieldsPK) {
        this.modDeptfieldsPK = modDeptfieldsPK;
    }

    public ModDeptfieldsGeneric(ModDeptfieldsPK modDeptfieldsPK, int fieldposition, int lengthmin, int lengthmax, String fieldtype, String additionalchar, String activated, String editable, String searchmask, String usetime) {
        this.modDeptfieldsPK = modDeptfieldsPK;
        this.fieldposition = fieldposition;
        this.lengthmin = lengthmin;
        this.lengthmax = lengthmax;
        this.fieldtype = fieldtype;
        this.additionalchar = additionalchar;
        this.activated = activated;
        this.editable = editable;
        this.searchmask = searchmask;
        this.usetime = usetime;
    }

    public ModDeptfieldsGeneric(int deptid, int fieldid) {
        this.modDeptfieldsPK = new ModDeptfieldsPK(deptid, fieldid);
    }

    public ModDeptfieldsPK getModDeptfieldsPK() {
        return modDeptfieldsPK;
    }

    public void setModDeptfieldsPK(ModDeptfieldsPK modDeptfieldsPK) {
        this.modDeptfieldsPK = modDeptfieldsPK;
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

    public ModDept getModDept() {
        return modDept;
    }

    public void setModDept(ModDept modDept) {
        this.modDept = modDept;
    }

    public ModDeptfielddata getModDeptfielddata() {
        return modDeptfielddata;
    }

    public void setModDeptfielddata(ModDeptfielddata modDeptfielddata) {
        this.modDeptfielddata = modDeptfielddata;
    }

    public List<ModDeptfieldlang> getModDeptfieldlangList() {
        return modDeptfieldlangList;
    }

    public void setModDeptfieldlangList(List<ModDeptfieldlang> modDeptfieldlangList) {
        this.modDeptfieldlangList = modDeptfieldlangList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modDeptfieldsPK != null ? modDeptfieldsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModDeptfieldsGeneric)) {
            return false;
        }
        ModDeptfieldsGeneric other = (ModDeptfieldsGeneric) object;
        if ((this.modDeptfieldsPK == null && other.modDeptfieldsPK != null) || (this.modDeptfieldsPK != null && !this.modDeptfieldsPK.equals(other.modDeptfieldsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModDeptfields[ modDeptfieldsPK=" + modDeptfieldsPK + " ]";
    }
    
}
