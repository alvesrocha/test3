package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_user database table.
 * 
 */
@MappedSuperclass
public class ModUserGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int userid;

	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	@Temporal(TemporalType.DATE)
	private Date dateofbirth;

	@Column(nullable=false, length=255)
	private String email;

	@Temporal(TemporalType.DATE)
	private Date expiration;

	@Column(length=255)
	private String externaluserid;

	@Temporal(TemporalType.TIMESTAMP)
	private Date firstlogin;

	@Column(length=255)
	private String firstname;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastfailedlogin;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastlogin;

	@Column(length=255)
	private String lastname;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lockdate;

	@Column(nullable=false, length=1)
	private String locked;

	@Column(length=512)
	private String lockreason;

	private int nbroffailedlogins;

	private int nbroflogins;

	@Column(nullable=false, length=256)
	private String pw;

	@Column(length=256)
	private String pwchangemessage;

	@Temporal(TemporalType.DATE)
	private Date requestpwchange;

	@Column(length=64)
	private String salt;

	@Column(length=255)
	private String userloginid;

	//bi-directional many-to-one association to ModApplicationfielddata
	@OneToMany(mappedBy="modUser")
	private List<ModApplicationfielddata> modApplicationfielddata;

	//bi-directional many-to-one association to ModClinic
	@OneToMany(mappedBy="modUser")
	private List<ModClinic> modClinics;

	//bi-directional many-to-one association to ModDept
	@OneToMany(mappedBy="modUser")
	private List<ModDept> modDepts;

	//bi-directional many-to-one association to ModModule
	@OneToMany(mappedBy="modUser1")
	private List<ModModule> modModules1;

	//bi-directional many-to-one association to ModModule
	@OneToMany(mappedBy="modUser2")
	private List<ModModule> modModules2;

	//bi-directional many-to-one association to ModPatient
	@OneToMany(mappedBy="modUser1")
	private List<ModPatient> modPatients1;

	//bi-directional many-to-one association to ModPatient
	@OneToMany(mappedBy="modUser2")
	private List<ModPatient> modPatients2;

	//bi-directional many-to-one association to ModPatientclinic
	@OneToMany(mappedBy="modUser1")
	private List<ModPatientclinic> modPatientclinics1;

	//bi-directional many-to-one association to ModPatientclinic
	@OneToMany(mappedBy="modUser2")
	private List<ModPatientclinic> modPatientclinics2;

	//bi-directional many-to-one association to ModPatientclinic
	@OneToMany(mappedBy="modUser3")
	private List<ModPatientclinic> modPatientclinics3;

	//bi-directional many-to-one association to ModPatientclinic
	@OneToMany(mappedBy="modUser4")
	private List<ModPatientclinic> modPatientclinics4;

	//bi-directional many-to-one association to ModPatientclinic
	@OneToMany(mappedBy="modUser5")
	private List<ModPatientclinic> modPatientclinics5;

	//bi-directional many-to-one association to ModPatientclinic
	@OneToMany(mappedBy="modUser6")
	private List<ModPatientclinic> modPatientclinics6;

	//bi-directional many-to-one association to ModPermissiongroup
	@OneToMany(mappedBy="modUser")
	private List<ModPermissiongroup> modPermissiongroups;

	//bi-directional many-to-one association to ModStaff
	@OneToMany(mappedBy="modUser")
	private List<ModStaff> modStaffs;

	//bi-directional many-to-one association to ModLang
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="langid")
	private ModLang modLang;

	public ModUserGeneric() {
	}

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getDateofbirth() {
		return this.dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getExpiration() {
		return this.expiration;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

	public String getExternaluserid() {
		return this.externaluserid;
	}

	public void setExternaluserid(String externaluserid) {
		this.externaluserid = externaluserid;
	}

	public Date getFirstlogin() {
		return this.firstlogin;
	}

	public void setFirstlogin(Date firstlogin) {
		this.firstlogin = firstlogin;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Date getLastfailedlogin() {
		return this.lastfailedlogin;
	}

	public void setLastfailedlogin(Date lastfailedlogin) {
		this.lastfailedlogin = lastfailedlogin;
	}

	public Date getLastlogin() {
		return this.lastlogin;
	}

	public void setLastlogin(Date lastlogin) {
		this.lastlogin = lastlogin;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getLockdate() {
		return this.lockdate;
	}

	public void setLockdate(Date lockdate) {
		this.lockdate = lockdate;
	}

	public String getLocked() {
		return this.locked;
	}

	public void setLocked(String locked) {
		this.locked = locked;
	}

	public String getLockreason() {
		return this.lockreason;
	}

	public void setLockreason(String lockreason) {
		this.lockreason = lockreason;
	}

	public int getNbroffailedlogins() {
		return this.nbroffailedlogins;
	}

	public void setNbroffailedlogins(int nbroffailedlogins) {
		this.nbroffailedlogins = nbroffailedlogins;
	}

	public int getNbroflogins() {
		return this.nbroflogins;
	}

	public void setNbroflogins(int nbroflogins) {
		this.nbroflogins = nbroflogins;
	}

	public String getPw() {
		return this.pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPwchangemessage() {
		return this.pwchangemessage;
	}

	public void setPwchangemessage(String pwchangemessage) {
		this.pwchangemessage = pwchangemessage;
	}

	public Date getRequestpwchange() {
		return this.requestpwchange;
	}

	public void setRequestpwchange(Date requestpwchange) {
		this.requestpwchange = requestpwchange;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getUserloginid() {
		return this.userloginid;
	}

	public void setUserloginid(String userloginid) {
		this.userloginid = userloginid;
	}

	public List<ModApplicationfielddata> getModApplicationfielddata() {
		return this.modApplicationfielddata;
	}

	public void setModApplicationfielddata(List<ModApplicationfielddata> modApplicationfielddata) {
		this.modApplicationfielddata = modApplicationfielddata;
	}

	public List<ModClinic> getModClinics() {
		return this.modClinics;
	}

	public void setModClinics(List<ModClinic> modClinics) {
		this.modClinics = modClinics;
	}

	public List<ModDept> getModDepts() {
		return this.modDepts;
	}

	public void setModDepts(List<ModDept> modDepts) {
		this.modDepts = modDepts;
	}

	public List<ModModule> getModModules1() {
		return this.modModules1;
	}

	public void setModModules1(List<ModModule> modModules1) {
		this.modModules1 = modModules1;
	}

	public List<ModModule> getModModules2() {
		return this.modModules2;
	}

	public void setModModules2(List<ModModule> modModules2) {
		this.modModules2 = modModules2;
	}

	public List<ModPatient> getModPatients1() {
		return this.modPatients1;
	}

	public void setModPatients1(List<ModPatient> modPatients1) {
		this.modPatients1 = modPatients1;
	}

	public List<ModPatient> getModPatients2() {
		return this.modPatients2;
	}

	public void setModPatients2(List<ModPatient> modPatients2) {
		this.modPatients2 = modPatients2;
	}

	public List<ModPatientclinic> getModPatientclinics1() {
		return this.modPatientclinics1;
	}

	public void setModPatientclinics1(List<ModPatientclinic> modPatientclinics1) {
		this.modPatientclinics1 = modPatientclinics1;
	}

	public List<ModPatientclinic> getModPatientclinics2() {
		return this.modPatientclinics2;
	}

	public void setModPatientclinics2(List<ModPatientclinic> modPatientclinics2) {
		this.modPatientclinics2 = modPatientclinics2;
	}

	public List<ModPatientclinic> getModPatientclinics3() {
		return this.modPatientclinics3;
	}

	public void setModPatientclinics3(List<ModPatientclinic> modPatientclinics3) {
		this.modPatientclinics3 = modPatientclinics3;
	}

	public List<ModPatientclinic> getModPatientclinics4() {
		return this.modPatientclinics4;
	}

	public void setModPatientclinics4(List<ModPatientclinic> modPatientclinics4) {
		this.modPatientclinics4 = modPatientclinics4;
	}

	public List<ModPatientclinic> getModPatientclinics5() {
		return this.modPatientclinics5;
	}

	public void setModPatientclinics5(List<ModPatientclinic> modPatientclinics5) {
		this.modPatientclinics5 = modPatientclinics5;
	}

	public List<ModPatientclinic> getModPatientclinics6() {
		return this.modPatientclinics6;
	}

	public void setModPatientclinics6(List<ModPatientclinic> modPatientclinics6) {
		this.modPatientclinics6 = modPatientclinics6;
	}

	public List<ModPermissiongroup> getModPermissiongroups() {
		return this.modPermissiongroups;
	}

	public void setModPermissiongroups(List<ModPermissiongroup> modPermissiongroups) {
		this.modPermissiongroups = modPermissiongroups;
	}

	public List<ModStaff> getModStaffs() {
		return this.modStaffs;
	}

	public void setModStaffs(List<ModStaff> modStaffs) {
		this.modStaffs = modStaffs;
	}

	public ModLang getModLang() {
		return this.modLang;
	}

	public void setModLang(ModLang modLang) {
		this.modLang = modLang;
	}

}
