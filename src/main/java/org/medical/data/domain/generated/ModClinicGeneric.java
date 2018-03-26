package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_clinic database table.
 * 
 */
@MappedSuperclass
public class ModClinicGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int clinicid;

	@Column(length=255)
	private String city;

	@Column(nullable=false, length=255)
	private String clinicname;

	@Column(length=80)
	private String logo;

	@Temporal(TemporalType.DATE)
	private Date modified;

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

	@Column(nullable=false, length=1)
	private String usecasenumber;

	//bi-directional many-to-one association to ModCountry
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="countryid", nullable=false)
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
	@JoinColumn(name="modifiedby")
	private ModUser modUser;

	//bi-directional many-to-one association to ModClinicfield
	@OneToMany(mappedBy="modClinic")
	private List<ModClinicfield> modClinicfields;

	//bi-directional many-to-one association to ModDept
	@OneToMany(mappedBy="modClinic")
	private List<ModDept> modDepts;

	//bi-directional many-to-one association to ModPatientfield
	@OneToMany(mappedBy="modClinic")
	private List<ModPatientfield> modPatientfields;

	public ModClinicGeneric() {
	}

	public int getClinicid() {
		return this.clinicid;
	}

	public void setClinicid(int clinicid) {
		this.clinicid = clinicid;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getClinicname() {
		return this.clinicname;
	}

	public void setClinicname(String clinicname) {
		this.clinicname = clinicname;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Date getModified() {
		return this.modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
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

	public String getUsecasenumber() {
		return this.usecasenumber;
	}

	public void setUsecasenumber(String usecasenumber) {
		this.usecasenumber = usecasenumber;
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

	public ModUser getModUser() {
		return this.modUser;
	}

	public void setModUser(ModUser modUser) {
		this.modUser = modUser;
	}

	public List<ModClinicfield> getModClinicfields() {
		return this.modClinicfields;
	}

	public void setModClinicfields(List<ModClinicfield> modClinicfields) {
		this.modClinicfields = modClinicfields;
	}

	public List<ModDept> getModDepts() {
		return this.modDepts;
	}

	public void setModDepts(List<ModDept> modDepts) {
		this.modDepts = modDepts;
	}

	public ModDept removeModDept(ModDept modDept) {
		getModDepts().remove(modDept);
		modDept.setModClinic(null);

		return modDept;
	}

	public List<ModPatientfield> getModPatientfields() {
		return this.modPatientfields;
	}

	public void setModPatientfields(List<ModPatientfield> modPatientfields) {
		this.modPatientfields = modPatientfields;
	}

}
