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
@Table(name = "mod_staff")
public class ModStaffGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "staffid")
    private Integer staffid;
    @Column(name = "externaluserid")
    private String externaluserid;
    @Column(name = "phone1")
    private String phone1;
    @Column(name = "phone2")
    private String phone2;
    @Column(name = "academicrank")
    private String academicrank;
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @Column(name = "patientownerpolicy",columnDefinition="enum('M','C','D','U')")
    private String patientownerpolicy;
    @Basic(optional = false)
    @Column(name = "patientdeletepolicy",columnDefinition="enum('M','C','D','U')")
    private String patientdeletepolicy;
    @Basic(optional = false)
    @Column(name = "patientwritepolicy",columnDefinition="enum('M','C','D','U')")
    private String patientwritepolicy;
    @Basic(optional = false)
    @Column(name = "patientreadpolicy",columnDefinition="enum('M','C','D','U')")
    private String patientreadpolicy;
    @Basic(optional = false)
    @Column(name = "patientlistpolicy",columnDefinition="enum('M','C','D','U')")
    private String patientlistpolicy;
    @Column(name = "activated",columnDefinition="enum('y','n')")
    private String activated;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "staffid")
    private List<ModAccessedpatient> modAccessedpatientList;
    @JoinColumn(name = "deptid", referencedColumnName = "deptid")
    @ManyToOne(optional = false)
    private ModDept deptid;
    @JoinColumn(name = "userid", referencedColumnName = "userid")
    @ManyToOne(optional = false)
    private ModUser userid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modStaff")
    private List<ModUserprofile> modUserprofileList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "staffid")
    private List<ModGroupmember> modGroupmemberList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modStaff")
    private List<ModStafffielddata> modStafffielddataList;

    public ModStaffGeneric() {
    }

    public ModStaffGeneric(Integer staffid) {
        this.staffid = staffid;
    }

    public ModStaffGeneric(Integer staffid, String patientownerpolicy, String patientdeletepolicy, String patientwritepolicy, String patientreadpolicy, String patientlistpolicy) {
        this.staffid = staffid;
        this.patientownerpolicy = patientownerpolicy;
        this.patientdeletepolicy = patientdeletepolicy;
        this.patientwritepolicy = patientwritepolicy;
        this.patientreadpolicy = patientreadpolicy;
        this.patientlistpolicy = patientlistpolicy;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getExternaluserid() {
        return externaluserid;
    }

    public void setExternaluserid(String externaluserid) {
        this.externaluserid = externaluserid;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getAcademicrank() {
        return academicrank;
    }

    public void setAcademicrank(String academicrank) {
        this.academicrank = academicrank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPatientownerpolicy() {
        return patientownerpolicy;
    }

    public void setPatientownerpolicy(String patientownerpolicy) {
        this.patientownerpolicy = patientownerpolicy;
    }

    public String getPatientdeletepolicy() {
        return patientdeletepolicy;
    }

    public void setPatientdeletepolicy(String patientdeletepolicy) {
        this.patientdeletepolicy = patientdeletepolicy;
    }

    public String getPatientwritepolicy() {
        return patientwritepolicy;
    }

    public void setPatientwritepolicy(String patientwritepolicy) {
        this.patientwritepolicy = patientwritepolicy;
    }

    public String getPatientreadpolicy() {
        return patientreadpolicy;
    }

    public void setPatientreadpolicy(String patientreadpolicy) {
        this.patientreadpolicy = patientreadpolicy;
    }

    public String getPatientlistpolicy() {
        return patientlistpolicy;
    }

    public void setPatientlistpolicy(String patientlistpolicy) {
        this.patientlistpolicy = patientlistpolicy;
    }

    public String getActivated() {
        return activated;
    }

    public void setActivated(String activated) {
        this.activated = activated;
    }

    public List<ModAccessedpatient> getModAccessedpatientList() {
        return modAccessedpatientList;
    }

    public void setModAccessedpatientList(List<ModAccessedpatient> modAccessedpatientList) {
        this.modAccessedpatientList = modAccessedpatientList;
    }

    public ModDept getDeptid() {
        return deptid;
    }

    public void setDeptid(ModDept deptid) {
        this.deptid = deptid;
    }

    public ModUser getUserid() {
        return userid;
    }

    public void setUserid(ModUser userid) {
        this.userid = userid;
    }

    public List<ModUserprofile> getModUserprofileList() {
        return modUserprofileList;
    }

    public void setModUserprofileList(List<ModUserprofile> modUserprofileList) {
        this.modUserprofileList = modUserprofileList;
    }

    public List<ModGroupmember> getModGroupmemberList() {
        return modGroupmemberList;
    }

    public void setModGroupmemberList(List<ModGroupmember> modGroupmemberList) {
        this.modGroupmemberList = modGroupmemberList;
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
        hash += (staffid != null ? staffid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModStaffGeneric)) {
            return false;
        }
        ModStaffGeneric other = (ModStaffGeneric) object;
        if ((this.staffid == null && other.staffid != null) || (this.staffid != null && !this.staffid.equals(other.staffid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModStaff[ staffid=" + staffid + " ]";
    }
    
}
