package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_module database table.
 * 
 */
@MappedSuperclass
public class ModModuleGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int moduleid;

	@Column(length=255)
	private String emailaddress4config;

	@Column(length=255)
	private String emailaddress4smtp;

	@Column(length=80)
	private String logo1;

	@Column(length=80)
	private String logo2;

	@Column(nullable=false, length=255)
	private String memdocpublickey;

	@Column(nullable=false, length=255)
	private String memdocurl;

	@Temporal(TemporalType.DATE)
	private Date modified;

	@Column(nullable=false, length=255)
	private String moduleprivatekey;

	@Column(nullable=false, length=255)
	private String modulepublickey;

	@Column(nullable=false, length=1)
	private String patientdeletepolicy;

	@Column(nullable=false, length=1)
	private String patientlistpolicy;

	@Column(nullable=false, length=1)
	private String patientownerpolicy;

	@Column(nullable=false, length=1)
	private String patientreadpolicy;

	@Column(nullable=false, length=1)
	private String patientwritepolicy;

	@Column(length=255)
	private String smtpserver;

	@Column(length=255)
	private String url;

	@Column(length=255)
	private String urlnat;

	@Column(nullable=false, length=1)
	private String usecasenumber;

	@Column(length=1)
	private String usesalt;

	//bi-directional many-to-one association to ModCountry
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="countryid")
	private ModCountry modCountry;

	//bi-directional many-to-one association to ModLang
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="langid")
	private ModLang modLang;

	//bi-directional many-to-one association to ModPermissiongroup
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="permissiongroupid", nullable=false)
	private ModPermissiongroup modPermissiongroup;

	//bi-directional many-to-one association to ModUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="moduleadmin")
	private ModUser moduleadmin;

	//bi-directional many-to-one association to ModUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="modifiedby")
	private ModUser modifiedby;

	//bi-directional many-to-one association to ModModulelang
	@OneToMany(mappedBy="modModule")
	private List<ModModulelang> modModulelangs;

	public ModModuleGeneric() {
	}

	public int getModuleid() {
		return this.moduleid;
	}

	public void setModuleid(int moduleid) {
		this.moduleid = moduleid;
	}

	public String getEmailaddress4config() {
		return this.emailaddress4config;
	}

	public void setEmailaddress4config(String emailaddress4config) {
		this.emailaddress4config = emailaddress4config;
	}

	public String getEmailaddress4smtp() {
		return this.emailaddress4smtp;
	}

	public void setEmailaddress4smtp(String emailaddress4smtp) {
		this.emailaddress4smtp = emailaddress4smtp;
	}

	public String getLogo1() {
		return this.logo1;
	}

	public void setLogo1(String logo1) {
		this.logo1 = logo1;
	}

	public String getLogo2() {
		return this.logo2;
	}

	public void setLogo2(String logo2) {
		this.logo2 = logo2;
	}

	public String getMemdocpublickey() {
		return this.memdocpublickey;
	}

	public void setMemdocpublickey(String memdocpublickey) {
		this.memdocpublickey = memdocpublickey;
	}

	public String getMemdocurl() {
		return this.memdocurl;
	}

	public void setMemdocurl(String memdocurl) {
		this.memdocurl = memdocurl;
	}

	public Date getModified() {
		return this.modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getModuleprivatekey() {
		return this.moduleprivatekey;
	}

	public void setModuleprivatekey(String moduleprivatekey) {
		this.moduleprivatekey = moduleprivatekey;
	}

	public String getModulepublickey() {
		return this.modulepublickey;
	}

	public void setModulepublickey(String modulepublickey) {
		this.modulepublickey = modulepublickey;
	}

	public String getPatientdeletepolicy() {
		return this.patientdeletepolicy;
	}

	public void setPatientdeletepolicy(String patientdeletepolicy) {
		this.patientdeletepolicy = patientdeletepolicy;
	}

	public String getPatientlistpolicy() {
		return this.patientlistpolicy;
	}

	public void setPatientlistpolicy(String patientlistpolicy) {
		this.patientlistpolicy = patientlistpolicy;
	}

	public String getPatientownerpolicy() {
		return this.patientownerpolicy;
	}

	public void setPatientownerpolicy(String patientownerpolicy) {
		this.patientownerpolicy = patientownerpolicy;
	}

	public String getPatientreadpolicy() {
		return this.patientreadpolicy;
	}

	public void setPatientreadpolicy(String patientreadpolicy) {
		this.patientreadpolicy = patientreadpolicy;
	}

	public String getPatientwritepolicy() {
		return this.patientwritepolicy;
	}

	public void setPatientwritepolicy(String patientwritepolicy) {
		this.patientwritepolicy = patientwritepolicy;
	}

	public String getSmtpserver() {
		return this.smtpserver;
	}

	public void setSmtpserver(String smtpserver) {
		this.smtpserver = smtpserver;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlnat() {
		return this.urlnat;
	}

	public void setUrlnat(String urlnat) {
		this.urlnat = urlnat;
	}

	public String getUsecasenumber() {
		return this.usecasenumber;
	}

	public void setUsecasenumber(String usecasenumber) {
		this.usecasenumber = usecasenumber;
	}

	public String getUsesalt() {
		return this.usesalt;
	}

	public void setUsesalt(String usesalt) {
		this.usesalt = usesalt;
	}

	public ModCountry getModCountry() {
		return this.modCountry;
	}

	public void setModCountry(ModCountry modCountry) {
		this.modCountry = modCountry;
	}

	public ModLang getModLang() {
		return this.modLang;
	}

	public void setModLang(ModLang modLang) {
		this.modLang = modLang;
	}

	public ModPermissiongroup getModPermissiongroup() {
		return this.modPermissiongroup;
	}

	public void setModPermissiongroup(ModPermissiongroup modPermissiongroup) {
		this.modPermissiongroup = modPermissiongroup;
	}

	public ModUser getModuleadmin() {
		return moduleadmin;
	}

	public void setModuleadmin(ModUser moduleadmin) {
		this.moduleadmin = moduleadmin;
	}

	public ModUser getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(ModUser modifiedby) {
		this.modifiedby = modifiedby;
	}

	public List<ModModulelang> getModModulelangs() {
		return this.modModulelangs;
	}

	public void setModModulelangs(List<ModModulelang> modModulelangs) {
		this.modModulelangs = modModulelangs;
	}

}
