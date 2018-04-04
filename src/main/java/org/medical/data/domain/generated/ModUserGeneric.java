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
@Table(name = "mod_user")
public class ModUserGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "userid")
    private Integer userid;
    @Column(name = "userloginid")
    private String userloginid;
    @Basic(optional = false)
    @Column(name = "pw")
    private String pw;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Column(name = "requestpwchange")
    @Temporal(TemporalType.DATE)
    private Date requestpwchange;
    @Column(name = "nbroflogins")
    private Integer nbroflogins;
    @Column(name = "nbroffailedlogins")
    private Integer nbroffailedlogins;
    @Column(name = "lastlogin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastlogin;
    @Column(name = "expiration")
    @Temporal(TemporalType.DATE)
    private Date expiration;
    @Basic(optional = false)
    @Column(name = "locked",columnDefinition="enum('y','n')")
    private String locked;
    @Column(name = "lockdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lockdate;
    @Column(name = "lockreason")
    private String lockreason;
    @Column(name = "dateofbirth")
    @Temporal(TemporalType.DATE)
    private Date dateofbirth;
    @Column(name = "pwchangemessage")
    private String pwchangemessage;
    @Column(name = "firstlogin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date firstlogin;
    @Column(name = "externaluserid")
    private String externaluserid;
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Column(name = "lastfailedlogin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastfailedlogin;
    @Column(name = "salt")
    private String salt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdby")
    private List<ModAutomaticlogin> modAutomaticloginList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "loginiuserid")
    private List<ModAutomaticlogin> modAutomaticloginList1;
    @OneToMany(mappedBy = "modifiedby")
    private List<ModPatient> modPatientList;
    @OneToMany(mappedBy = "modifiedbyswitchuser")
    private List<ModPatient> modPatientList1;
    @OneToMany(mappedBy = "modifiedby")
    private List<ModDept> modDeptList;
    @JoinColumn(name = "langid", referencedColumnName = "langid")
    @ManyToOne
    private ModLang langid;
    @OneToMany(mappedBy = "modifiedby")
    private List<ModClinic> modClinicList;
    @OneToMany(mappedBy = "createdbyswitchuser")
    private List<ModPatientclinic> modPatientclinicList;
    @OneToMany(mappedBy = "dischargedbyswitchuser")
    private List<ModPatientclinic> modPatientclinicList1;
    @OneToMany(mappedBy = "dischargedby")
    private List<ModPatientclinic> modPatientclinicList2;
    @OneToMany(mappedBy = "modifiedbyswitchuser")
    private List<ModPatientclinic> modPatientclinicList3;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdby")
    private List<ModPatientclinic> modPatientclinicList4;
    @OneToMany(mappedBy = "modifiedby")
    private List<ModPatientclinic> modPatientclinicList5;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userid")
    private List<ModStaff> modStaffList;
    @OneToMany(mappedBy = "createdby")
    private List<ModPermissiongroup> modPermissiongroupList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modUser")
    private List<ModApplicationfielddata> modApplicationfielddataList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdby")
    private List<ModGroupmember> modGroupmemberList;
    @OneToMany(mappedBy = "moduleadmin")
    private List<ModModule> modModuleList;
    @OneToMany(mappedBy = "modifiedby")
    private List<ModModule> modModuleList1;

    public ModUserGeneric() {
    }

    public ModUserGeneric(Integer userid) {
        this.userid = userid;
    }

    public ModUserGeneric(Integer userid, String pw, String email, String locked) {
        this.userid = userid;
        this.pw = pw;
        this.email = email;
        this.locked = locked;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserloginid() {
        return userloginid;
    }

    public void setUserloginid(String userloginid) {
        this.userloginid = userloginid;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRequestpwchange() {
        return requestpwchange;
    }

    public void setRequestpwchange(Date requestpwchange) {
        this.requestpwchange = requestpwchange;
    }

    public Integer getNbroflogins() {
        return nbroflogins;
    }

    public void setNbroflogins(Integer nbroflogins) {
        this.nbroflogins = nbroflogins;
    }

    public Integer getNbroffailedlogins() {
        return nbroffailedlogins;
    }

    public void setNbroffailedlogins(Integer nbroffailedlogins) {
        this.nbroffailedlogins = nbroffailedlogins;
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    public Date getLockdate() {
        return lockdate;
    }

    public void setLockdate(Date lockdate) {
        this.lockdate = lockdate;
    }

    public String getLockreason() {
        return lockreason;
    }

    public void setLockreason(String lockreason) {
        this.lockreason = lockreason;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getPwchangemessage() {
        return pwchangemessage;
    }

    public void setPwchangemessage(String pwchangemessage) {
        this.pwchangemessage = pwchangemessage;
    }

    public Date getFirstlogin() {
        return firstlogin;
    }

    public void setFirstlogin(Date firstlogin) {
        this.firstlogin = firstlogin;
    }

    public String getExternaluserid() {
        return externaluserid;
    }

    public void setExternaluserid(String externaluserid) {
        this.externaluserid = externaluserid;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastfailedlogin() {
        return lastfailedlogin;
    }

    public void setLastfailedlogin(Date lastfailedlogin) {
        this.lastfailedlogin = lastfailedlogin;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public List<ModAutomaticlogin> getModAutomaticloginList() {
        return modAutomaticloginList;
    }

    public void setModAutomaticloginList(List<ModAutomaticlogin> modAutomaticloginList) {
        this.modAutomaticloginList = modAutomaticloginList;
    }

    public List<ModAutomaticlogin> getModAutomaticloginList1() {
        return modAutomaticloginList1;
    }

    public void setModAutomaticloginList1(List<ModAutomaticlogin> modAutomaticloginList1) {
        this.modAutomaticloginList1 = modAutomaticloginList1;
    }

    public List<ModPatient> getModPatientList() {
        return modPatientList;
    }

    public void setModPatientList(List<ModPatient> modPatientList) {
        this.modPatientList = modPatientList;
    }

    public List<ModPatient> getModPatientList1() {
        return modPatientList1;
    }

    public void setModPatientList1(List<ModPatient> modPatientList1) {
        this.modPatientList1 = modPatientList1;
    }

    public List<ModDept> getModDeptList() {
        return modDeptList;
    }

    public void setModDeptList(List<ModDept> modDeptList) {
        this.modDeptList = modDeptList;
    }

    public ModLang getLangid() {
        return langid;
    }

    public void setLangid(ModLang langid) {
        this.langid = langid;
    }

    public List<ModClinic> getModClinicList() {
        return modClinicList;
    }

    public void setModClinicList(List<ModClinic> modClinicList) {
        this.modClinicList = modClinicList;
    }

    public List<ModPatientclinic> getModPatientclinicList() {
        return modPatientclinicList;
    }

    public void setModPatientclinicList(List<ModPatientclinic> modPatientclinicList) {
        this.modPatientclinicList = modPatientclinicList;
    }

    public List<ModPatientclinic> getModPatientclinicList1() {
        return modPatientclinicList1;
    }

    public void setModPatientclinicList1(List<ModPatientclinic> modPatientclinicList1) {
        this.modPatientclinicList1 = modPatientclinicList1;
    }

    public List<ModPatientclinic> getModPatientclinicList2() {
        return modPatientclinicList2;
    }

    public void setModPatientclinicList2(List<ModPatientclinic> modPatientclinicList2) {
        this.modPatientclinicList2 = modPatientclinicList2;
    }

    public List<ModPatientclinic> getModPatientclinicList3() {
        return modPatientclinicList3;
    }

    public void setModPatientclinicList3(List<ModPatientclinic> modPatientclinicList3) {
        this.modPatientclinicList3 = modPatientclinicList3;
    }

    public List<ModPatientclinic> getModPatientclinicList4() {
        return modPatientclinicList4;
    }

    public void setModPatientclinicList4(List<ModPatientclinic> modPatientclinicList4) {
        this.modPatientclinicList4 = modPatientclinicList4;
    }

    public List<ModPatientclinic> getModPatientclinicList5() {
        return modPatientclinicList5;
    }

    public void setModPatientclinicList5(List<ModPatientclinic> modPatientclinicList5) {
        this.modPatientclinicList5 = modPatientclinicList5;
    }

    public List<ModStaff> getModStaffList() {
        return modStaffList;
    }

    public void setModStaffList(List<ModStaff> modStaffList) {
        this.modStaffList = modStaffList;
    }

    public List<ModPermissiongroup> getModPermissiongroupList() {
        return modPermissiongroupList;
    }

    public void setModPermissiongroupList(List<ModPermissiongroup> modPermissiongroupList) {
        this.modPermissiongroupList = modPermissiongroupList;
    }

    public List<ModApplicationfielddata> getModApplicationfielddataList() {
        return modApplicationfielddataList;
    }

    public void setModApplicationfielddataList(List<ModApplicationfielddata> modApplicationfielddataList) {
        this.modApplicationfielddataList = modApplicationfielddataList;
    }

    public List<ModGroupmember> getModGroupmemberList() {
        return modGroupmemberList;
    }

    public void setModGroupmemberList(List<ModGroupmember> modGroupmemberList) {
        this.modGroupmemberList = modGroupmemberList;
    }

    public List<ModModule> getModModuleList() {
        return modModuleList;
    }

    public void setModModuleList(List<ModModule> modModuleList) {
        this.modModuleList = modModuleList;
    }

    public List<ModModule> getModModuleList1() {
        return modModuleList1;
    }

    public void setModModuleList1(List<ModModule> modModuleList1) {
        this.modModuleList1 = modModuleList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userid != null ? userid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModUserGeneric)) {
            return false;
        }
        ModUserGeneric other = (ModUserGeneric) object;
        if ((this.userid == null && other.userid != null) || (this.userid != null && !this.userid.equals(other.userid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModUser[ userid=" + userid + " ]";
    }
    
}
