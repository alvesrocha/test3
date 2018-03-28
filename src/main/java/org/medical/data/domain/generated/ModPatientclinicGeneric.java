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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "mod_patientclinic")
public class ModPatientclinicGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "patientclinicid")
    private Integer patientclinicid;
    @Column(name = "mrn")
    private String mrn;
    @Basic(optional = false)
    @Column(name = "created")
    @Temporal(TemporalType.DATE)
    private Date created;
    @Column(name = "modified")
    @Temporal(TemporalType.DATE)
    private Date modified;
    @Column(name = "hashedmrn")
    private String hashedmrn;
    @Column(name = "createdswitchuser")
    @Temporal(TemporalType.DATE)
    private Date createdswitchuser;
    @Column(name = "modifiedswitchuser")
    @Temporal(TemporalType.DATE)
    private Date modifiedswitchuser;
    @Column(name = "dateofdischarge")
    @Temporal(TemporalType.DATE)
    private Date dateofdischarge;
    @Column(name = "discharged")
    @Temporal(TemporalType.DATE)
    private Date discharged;
    @Column(name = "dischargedswitchuser")
    @Temporal(TemporalType.DATE)
    private Date dischargedswitchuser;
    @JoinColumn(name = "createdbyswitchuser", referencedColumnName = "userid")
    @ManyToOne
    private ModUser createdbyswitchuser;
    @JoinColumn(name = "dischargedreasonid", referencedColumnName = "patientdischargereasonid")
    @ManyToOne
    private ModPatientdischargereason dischargedreasonid;
    @JoinColumn(name = "dischargedbyswitchuser", referencedColumnName = "userid")
    @ManyToOne
    private ModUser dischargedbyswitchuser;
    @JoinColumn(name = "dischargedby", referencedColumnName = "userid")
    @ManyToOne
    private ModUser dischargedby;
    @JoinColumn(name = "modifiedbyswitchuser", referencedColumnName = "userid")
    @ManyToOne
    private ModUser modifiedbyswitchuser;
    @JoinColumn(name = "deptid", referencedColumnName = "deptid")
    @ManyToOne(optional = false)
    private ModDept deptid;
    @JoinColumn(name = "patientid", referencedColumnName = "patientid")
    @ManyToOne(optional = false)
    private ModPatient patientid;
    @JoinColumn(name = "createdby", referencedColumnName = "userid")
    @ManyToOne(optional = false)
    private ModUser createdby;
    @JoinColumn(name = "modifiedby", referencedColumnName = "userid")
    @ManyToOne
    private ModUser modifiedby;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patientclinicid")
    private List<ModPatientpermission> modPatientpermissionList;

    public ModPatientclinicGeneric() {
    }

    public ModPatientclinicGeneric(Integer patientclinicid) {
        this.patientclinicid = patientclinicid;
    }

    public ModPatientclinicGeneric(Integer patientclinicid, Date created) {
        this.patientclinicid = patientclinicid;
        this.created = created;
    }

    public Integer getPatientclinicid() {
        return patientclinicid;
    }

    public void setPatientclinicid(Integer patientclinicid) {
        this.patientclinicid = patientclinicid;
    }

    public String getMrn() {
        return mrn;
    }

    public void setMrn(String mrn) {
        this.mrn = mrn;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getHashedmrn() {
        return hashedmrn;
    }

    public void setHashedmrn(String hashedmrn) {
        this.hashedmrn = hashedmrn;
    }

    public Date getCreatedswitchuser() {
        return createdswitchuser;
    }

    public void setCreatedswitchuser(Date createdswitchuser) {
        this.createdswitchuser = createdswitchuser;
    }

    public Date getModifiedswitchuser() {
        return modifiedswitchuser;
    }

    public void setModifiedswitchuser(Date modifiedswitchuser) {
        this.modifiedswitchuser = modifiedswitchuser;
    }

    public Date getDateofdischarge() {
        return dateofdischarge;
    }

    public void setDateofdischarge(Date dateofdischarge) {
        this.dateofdischarge = dateofdischarge;
    }

    public Date getDischarged() {
        return discharged;
    }

    public void setDischarged(Date discharged) {
        this.discharged = discharged;
    }

    public Date getDischargedswitchuser() {
        return dischargedswitchuser;
    }

    public void setDischargedswitchuser(Date dischargedswitchuser) {
        this.dischargedswitchuser = dischargedswitchuser;
    }

    public ModUser getCreatedbyswitchuser() {
        return createdbyswitchuser;
    }

    public void setCreatedbyswitchuser(ModUser createdbyswitchuser) {
        this.createdbyswitchuser = createdbyswitchuser;
    }

    public ModPatientdischargereason getDischargedreasonid() {
        return dischargedreasonid;
    }

    public void setDischargedreasonid(ModPatientdischargereason dischargedreasonid) {
        this.dischargedreasonid = dischargedreasonid;
    }

    public ModUser getDischargedbyswitchuser() {
        return dischargedbyswitchuser;
    }

    public void setDischargedbyswitchuser(ModUser dischargedbyswitchuser) {
        this.dischargedbyswitchuser = dischargedbyswitchuser;
    }

    public ModUser getDischargedby() {
        return dischargedby;
    }

    public void setDischargedby(ModUser dischargedby) {
        this.dischargedby = dischargedby;
    }

    public ModUser getModifiedbyswitchuser() {
        return modifiedbyswitchuser;
    }

    public void setModifiedbyswitchuser(ModUser modifiedbyswitchuser) {
        this.modifiedbyswitchuser = modifiedbyswitchuser;
    }

    public ModDept getDeptid() {
        return deptid;
    }

    public void setDeptid(ModDept deptid) {
        this.deptid = deptid;
    }

    public ModPatient getPatientid() {
        return patientid;
    }

    public void setPatientid(ModPatient patientid) {
        this.patientid = patientid;
    }

    public ModUser getCreatedby() {
        return createdby;
    }

    public void setCreatedby(ModUser createdby) {
        this.createdby = createdby;
    }

    public ModUser getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(ModUser modifiedby) {
        this.modifiedby = modifiedby;
    }

    public List<ModPatientpermission> getModPatientpermissionList() {
        return modPatientpermissionList;
    }

    public void setModPatientpermissionList(List<ModPatientpermission> modPatientpermissionList) {
        this.modPatientpermissionList = modPatientpermissionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patientclinicid != null ? patientclinicid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModPatientclinicGeneric)) {
            return false;
        }
        ModPatientclinicGeneric other = (ModPatientclinicGeneric) object;
        if ((this.patientclinicid == null && other.patientclinicid != null) || (this.patientclinicid != null && !this.patientclinicid.equals(other.patientclinicid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModPatientclinic[ patientclinicid=" + patientclinicid + " ]";
    }
    
}
