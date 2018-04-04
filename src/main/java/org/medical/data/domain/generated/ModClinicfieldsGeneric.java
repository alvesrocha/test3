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
@Table(name = "mod_clinicfields")
public class ModClinicfieldsGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModClinicfieldsPK modClinicfieldsPK;
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
    @Basic(optional = false)
    @Column(name = "fixedfieldtype",columnDefinition="enum('none','name','city','lang')")
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
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "modClinicfields")
    private ModClinicfielddata modClinicfielddata;
    @JoinColumn(name = "clinicid", referencedColumnName = "clinicid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModClinic modClinic;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modClinicfields")
    private List<ModClinicfieldlang> modClinicfieldlangList;

    public ModClinicfieldsGeneric() {
    }

    public ModClinicfieldsGeneric(ModClinicfieldsPK modClinicfieldsPK) {
        this.modClinicfieldsPK = modClinicfieldsPK;
    }

    public ModClinicfieldsGeneric(ModClinicfieldsPK modClinicfieldsPK, int fieldposition, int lengthmin, int lengthmax, String fieldtype, String fixedfieldtype, String additionalchar, String activated, String editable, String searchmask, String usetime) {
        this.modClinicfieldsPK = modClinicfieldsPK;
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

    public ModClinicfieldsGeneric(int clinicid, int fieldid) {
        this.modClinicfieldsPK = new ModClinicfieldsPK(clinicid, fieldid);
    }

    public ModClinicfieldsPK getModClinicfieldsPK() {
        return modClinicfieldsPK;
    }

    public void setModClinicfieldsPK(ModClinicfieldsPK modClinicfieldsPK) {
        this.modClinicfieldsPK = modClinicfieldsPK;
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

    public ModClinicfielddata getModClinicfielddata() {
        return modClinicfielddata;
    }

    public void setModClinicfielddata(ModClinicfielddata modClinicfielddata) {
        this.modClinicfielddata = modClinicfielddata;
    }

    public ModClinic getModClinic() {
        return modClinic;
    }

    public void setModClinic(ModClinic modClinic) {
        this.modClinic = modClinic;
    }

    public List<ModClinicfieldlang> getModClinicfieldlangList() {
        return modClinicfieldlangList;
    }

    public void setModClinicfieldlangList(List<ModClinicfieldlang> modClinicfieldlangList) {
        this.modClinicfieldlangList = modClinicfieldlangList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modClinicfieldsPK != null ? modClinicfieldsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModClinicfieldsGeneric)) {
            return false;
        }
        ModClinicfieldsGeneric other = (ModClinicfieldsGeneric) object;
        if ((this.modClinicfieldsPK == null && other.modClinicfieldsPK != null) || (this.modClinicfieldsPK != null && !this.modClinicfieldsPK.equals(other.modClinicfieldsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModClinicfields[ modClinicfieldsPK=" + modClinicfieldsPK + " ]";
    }
    
}
