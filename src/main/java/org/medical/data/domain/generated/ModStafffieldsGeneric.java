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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_stafffields")
public class ModStafffieldsGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "fieldid")
    private Integer fieldid;
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
    @Column(name = "additionalchar")
    private String additionalchar;
    @Basic(optional = false)
    @Column(name = "usetime")
    private String usetime;
    @Column(name = "validationexp")
    private String validationexp;
    @Basic(optional = false)
    @Column(name = "fieldposition")
    private int fieldposition;
    @Column(name = "fixedfieldtype")
    private String fixedfieldtype;
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
    @Column(name = "allowvalidationdeactivation")
    private String allowvalidationdeactivation;
    @Basic(optional = false)
    @Column(name = "groupnumber")
    private int groupnumber;
    @Basic(optional = false)
    @Column(name = "columnspan")
    private int columnspan;
    @Basic(optional = false)
    @Column(name = "readonly")
    private String readonly;
    @Basic(optional = false)
    @Column(name = "autocomplete")
    private String autocomplete;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modStafffields")
    private List<ModStafffieldlang> modStafffieldlangList;
    @OneToMany(mappedBy = "autocompleteparentfield")
    private List<ModStafffields> modStafffieldsList;
    @JoinColumn(name = "autocompleteparentfield", referencedColumnName = "fieldid")
    @ManyToOne
    private ModStafffields autocompleteparentfield;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modStafffields")
    private List<ModStafffielddata> modStafffielddataList;

    public ModStafffieldsGeneric() {
    }

    public ModStafffieldsGeneric(Integer fieldid) {
        this.fieldid = fieldid;
    }

    public ModStafffieldsGeneric(Integer fieldid, int lengthmin, int lengthmax, String fieldtype, String additionalchar, String usetime, int fieldposition, String activated, String editable, String searchmask, String allowvalidationdeactivation, int groupnumber, int columnspan, String readonly, String autocomplete) {
        this.fieldid = fieldid;
        this.lengthmin = lengthmin;
        this.lengthmax = lengthmax;
        this.fieldtype = fieldtype;
        this.additionalchar = additionalchar;
        this.usetime = usetime;
        this.fieldposition = fieldposition;
        this.activated = activated;
        this.editable = editable;
        this.searchmask = searchmask;
        this.allowvalidationdeactivation = allowvalidationdeactivation;
        this.groupnumber = groupnumber;
        this.columnspan = columnspan;
        this.readonly = readonly;
        this.autocomplete = autocomplete;
    }

    public Integer getFieldid() {
        return fieldid;
    }

    public void setFieldid(Integer fieldid) {
        this.fieldid = fieldid;
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

    public String getAdditionalchar() {
        return additionalchar;
    }

    public void setAdditionalchar(String additionalchar) {
        this.additionalchar = additionalchar;
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

    public int getFieldposition() {
        return fieldposition;
    }

    public void setFieldposition(int fieldposition) {
        this.fieldposition = fieldposition;
    }

    public String getFixedfieldtype() {
        return fixedfieldtype;
    }

    public void setFixedfieldtype(String fixedfieldtype) {
        this.fixedfieldtype = fixedfieldtype;
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

    public String getAllowvalidationdeactivation() {
        return allowvalidationdeactivation;
    }

    public void setAllowvalidationdeactivation(String allowvalidationdeactivation) {
        this.allowvalidationdeactivation = allowvalidationdeactivation;
    }

    public int getGroupnumber() {
        return groupnumber;
    }

    public void setGroupnumber(int groupnumber) {
        this.groupnumber = groupnumber;
    }

    public int getColumnspan() {
        return columnspan;
    }

    public void setColumnspan(int columnspan) {
        this.columnspan = columnspan;
    }

    public String getReadonly() {
        return readonly;
    }

    public void setReadonly(String readonly) {
        this.readonly = readonly;
    }

    public String getAutocomplete() {
        return autocomplete;
    }

    public void setAutocomplete(String autocomplete) {
        this.autocomplete = autocomplete;
    }

    public List<ModStafffieldlang> getModStafffieldlangList() {
        return modStafffieldlangList;
    }

    public void setModStafffieldlangList(List<ModStafffieldlang> modStafffieldlangList) {
        this.modStafffieldlangList = modStafffieldlangList;
    }

    public List<ModStafffields> getModStafffieldsList() {
        return modStafffieldsList;
    }

    public void setModStafffieldsList(List<ModStafffields> modStafffieldsList) {
        this.modStafffieldsList = modStafffieldsList;
    }

    public ModStafffieldsGeneric getAutocompleteparentfield() {
        return autocompleteparentfield;
    }

    public void setAutocompleteparentfield(ModStafffields autocompleteparentfield) {
        this.autocompleteparentfield = autocompleteparentfield;
    }

    public List<ModStafffielddata> getModStafffielddataList() {
        return modStafffielddataList;
    }

    public void setModStafffielddataList(List<ModStafffielddata> modStafffielddataList) {
        this.modStafffielddataList = modStafffielddataList;
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
        if (!(object instanceof ModStafffieldsGeneric)) {
            return false;
        }
        ModStafffieldsGeneric other = (ModStafffieldsGeneric) object;
        if ((this.fieldid == null && other.fieldid != null) || (this.fieldid != null && !this.fieldid.equals(other.fieldid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModStafffields[ fieldid=" + fieldid + " ]";
    }
    
}
