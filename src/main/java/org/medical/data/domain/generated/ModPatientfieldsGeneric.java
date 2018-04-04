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
@Table(name = "mod_patientfields")
public class ModPatientfieldsGeneric implements Serializable {

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
    @Column(name = "fieldtype",columnDefinition="enum('date','number','alpha','alphanumeric','all','multiplechoice','dropdown','checkbox','radiobutton')")
    private String fieldtype;
    @Column(name = "fixedfieldtype",columnDefinition="enum('none','department','mrn','mrn2','ssn','notification','dob','lang','lang2','lang3','country','country2','gender','lastname','firstname','dischargeddate','dischargedreason','email','phone','phone2','zipcode','city','streetname','streetnumber','consent')")
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
    @Column(name = "hashbase",columnDefinition="enum('y','n')")
    private String hashbase;
    @Basic(optional = false)
    @Column(name = "useunspecifiedgender",columnDefinition="enum('y','n')")
    private String useunspecifiedgender;
    @Basic(optional = false)
    @Column(name = "usetime",columnDefinition="enum('y','n')")
    private String usetime;
    @Basic(optional = false)
    @Column(name = "allowvalidationdeactivation",columnDefinition="enum('y','n')")
    private String allowvalidationdeactivation;
    @Column(name = "validationexp")
    private String validationexp;
    @Basic(optional = false)
    @Column(name = "groupnumber")
    private int groupnumber;
    @Basic(optional = false)
    @Column(name = "columnspan")
    private int columnspan;
    @Basic(optional = false)
    @Column(name = "patientlist",columnDefinition="enum('y','n')")
    private String patientlist;
    @Column(name = "patientlistorder")
    private Integer patientlistorder;
    @Basic(optional = false)
    @Column(name = "readonly",columnDefinition="enum('y','n')")
    private String readonly;
    @Column(name = "generatevaluescript")
    private String generatevaluescript;
    @Column(name = "validatevaluescript")
    private String validatevaluescript;
    @Basic(optional = false)
    @Column(name = "autocomplete",columnDefinition="enum('y','n')")
    private String autocomplete;
    @Basic(optional = false)
    @Column(name = "visible",columnDefinition="enum('y','n')")
    private String visible;
    @Basic(optional = false)
    @Column(name = "extendedsearchmask",columnDefinition="enum('y','n')")
    private String extendedsearchmask;
    @OneToMany(mappedBy = "autocompleteparentfield")
    private List<ModPatientfields> modPatientfieldsList;
    @JoinColumn(name = "autocompleteparentfield", referencedColumnName = "fieldid")
    @ManyToOne
    private ModPatientfields autocompleteparentfield;
    @JoinColumn(name = "clinicid", referencedColumnName = "clinicid")
    @ManyToOne
    private ModClinic clinicid;
    @JoinColumn(name = "deptid", referencedColumnName = "deptid")
    @ManyToOne
    private ModDept deptid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modPatientfields")
    private List<ModPatientfieldlang> modPatientfieldlangList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modPatientfields")
    private List<ModPatientfielddata> modPatientfielddataList;

    public ModPatientfieldsGeneric() {
    }

    public ModPatientfieldsGeneric(Integer fieldid) {
        this.fieldid = fieldid;
    }

    public ModPatientfieldsGeneric(Integer fieldid, int fieldposition, int lengthmin, int lengthmax, String additionalchar, String activated, String editable, String searchmask, String hashbase, String useunspecifiedgender, String usetime, String allowvalidationdeactivation, int groupnumber, int columnspan, String patientlist, String readonly, String autocomplete, String visible, String extendedsearchmask) {
        this.fieldid = fieldid;
        this.fieldposition = fieldposition;
        this.lengthmin = lengthmin;
        this.lengthmax = lengthmax;
        this.additionalchar = additionalchar;
        this.activated = activated;
        this.editable = editable;
        this.searchmask = searchmask;
        this.hashbase = hashbase;
        this.useunspecifiedgender = useunspecifiedgender;
        this.usetime = usetime;
        this.allowvalidationdeactivation = allowvalidationdeactivation;
        this.groupnumber = groupnumber;
        this.columnspan = columnspan;
        this.patientlist = patientlist;
        this.readonly = readonly;
        this.autocomplete = autocomplete;
        this.visible = visible;
        this.extendedsearchmask = extendedsearchmask;
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

    public String getHashbase() {
        return hashbase;
    }

    public void setHashbase(String hashbase) {
        this.hashbase = hashbase;
    }

    public String getUseunspecifiedgender() {
        return useunspecifiedgender;
    }

    public void setUseunspecifiedgender(String useunspecifiedgender) {
        this.useunspecifiedgender = useunspecifiedgender;
    }

    public String getUsetime() {
        return usetime;
    }

    public void setUsetime(String usetime) {
        this.usetime = usetime;
    }

    public String getAllowvalidationdeactivation() {
        return allowvalidationdeactivation;
    }

    public void setAllowvalidationdeactivation(String allowvalidationdeactivation) {
        this.allowvalidationdeactivation = allowvalidationdeactivation;
    }

    public String getValidationexp() {
        return validationexp;
    }

    public void setValidationexp(String validationexp) {
        this.validationexp = validationexp;
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

    public String getPatientlist() {
        return patientlist;
    }

    public void setPatientlist(String patientlist) {
        this.patientlist = patientlist;
    }

    public Integer getPatientlistorder() {
        return patientlistorder;
    }

    public void setPatientlistorder(Integer patientlistorder) {
        this.patientlistorder = patientlistorder;
    }

    public String getReadonly() {
        return readonly;
    }

    public void setReadonly(String readonly) {
        this.readonly = readonly;
    }

    public String getGeneratevaluescript() {
        return generatevaluescript;
    }

    public void setGeneratevaluescript(String generatevaluescript) {
        this.generatevaluescript = generatevaluescript;
    }

    public String getValidatevaluescript() {
        return validatevaluescript;
    }

    public void setValidatevaluescript(String validatevaluescript) {
        this.validatevaluescript = validatevaluescript;
    }

    public String getAutocomplete() {
        return autocomplete;
    }

    public void setAutocomplete(String autocomplete) {
        this.autocomplete = autocomplete;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public String getExtendedsearchmask() {
        return extendedsearchmask;
    }

    public void setExtendedsearchmask(String extendedsearchmask) {
        this.extendedsearchmask = extendedsearchmask;
    }

    public List<ModPatientfields> getModPatientfieldsList() {
        return modPatientfieldsList;
    }

    public void setModPatientfieldsList(List<ModPatientfields> modPatientfieldsList) {
        this.modPatientfieldsList = modPatientfieldsList;
    }

    public ModPatientfieldsGeneric getAutocompleteparentfield() {
        return autocompleteparentfield;
    }

    public void setAutocompleteparentfield(ModPatientfields autocompleteparentfield) {
        this.autocompleteparentfield = autocompleteparentfield;
    }

    public ModClinic getClinicid() {
        return clinicid;
    }

    public void setClinicid(ModClinic clinicid) {
        this.clinicid = clinicid;
    }

    public ModDept getDeptid() {
        return deptid;
    }

    public void setDeptid(ModDept deptid) {
        this.deptid = deptid;
    }

    public List<ModPatientfieldlang> getModPatientfieldlangList() {
        return modPatientfieldlangList;
    }

    public void setModPatientfieldlangList(List<ModPatientfieldlang> modPatientfieldlangList) {
        this.modPatientfieldlangList = modPatientfieldlangList;
    }

    public List<ModPatientfielddata> getModPatientfielddataList() {
        return modPatientfielddataList;
    }

    public void setModPatientfielddataList(List<ModPatientfielddata> modPatientfielddataList) {
        this.modPatientfielddataList = modPatientfielddataList;
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
        if (!(object instanceof ModPatientfieldsGeneric)) {
            return false;
        }
        ModPatientfieldsGeneric other = (ModPatientfieldsGeneric) object;
        if ((this.fieldid == null && other.fieldid != null) || (this.fieldid != null && !this.fieldid.equals(other.fieldid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModPatientfields[ fieldid=" + fieldid + " ]";
    }
    
}
