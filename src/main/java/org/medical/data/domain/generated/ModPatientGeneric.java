package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_patient database table.
 * 
 */
@MappedSuperclass
public class ModPatientGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int patientid;

	@Temporal(TemporalType.TIMESTAMP)
	private Date accessed;

	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date dateofbirth;

	@Temporal(TemporalType.DATE)
	private Date dateofdeath;

	@Column(nullable=false, length=1)
	private String gender;

	@Column(length=512)
	private String hashcode;

	@Column(length=512)
	private String hashcode1;

	@Column(length=512)
	private String hashedssn;

	@Temporal(TemporalType.DATE)
	private Date modified;

	@Temporal(TemporalType.DATE)
	private Date modifiedswitchuser;

	@Column(length=255)
	private String ssn;

	//bi-directional many-to-one association to ModCountry
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="countryid")
	private ModCountry modCountry;

	//bi-directional many-to-one association to ModLang
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="langid")
	private ModLang modLang;

	//bi-directional many-to-one association to ModUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="modifiedby")
	private ModUser modUser1;

	//bi-directional many-to-one association to ModUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="modifiedbyswitchuser")
	private ModUser modUser2;

	//bi-directional many-to-one association to ModPatientclinic
	@OneToMany(mappedBy="modPatient")
	private List<ModPatientclinic> modPatientclinics;

	//bi-directional many-to-one association to ModPatientfielddata
	@OneToMany(mappedBy="modPatient")
	private List<ModPatientfielddata> modPatientfielddata;

	public ModPatientGeneric() {
	}

	public int getPatientid() {
		return this.patientid;
	}

	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}

	public Date getAccessed() {
		return this.accessed;
	}

	public void setAccessed(Date accessed) {
		this.accessed = accessed;
	}

	public Date getDateofbirth() {
		return this.dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public Date getDateofdeath() {
		return this.dateofdeath;
	}

	public void setDateofdeath(Date dateofdeath) {
		this.dateofdeath = dateofdeath;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHashcode() {
		return this.hashcode;
	}

	public void setHashcode(String hashcode) {
		this.hashcode = hashcode;
	}

	public String getHashcode1() {
		return this.hashcode1;
	}

	public void setHashcode1(String hashcode1) {
		this.hashcode1 = hashcode1;
	}

	public String getHashedssn() {
		return this.hashedssn;
	}

	public void setHashedssn(String hashedssn) {
		this.hashedssn = hashedssn;
	}

	public Date getModified() {
		return this.modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Date getModifiedswitchuser() {
		return this.modifiedswitchuser;
	}

	public void setModifiedswitchuser(Date modifiedswitchuser) {
		this.modifiedswitchuser = modifiedswitchuser;
	}

	public String getSsn() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
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

	public ModUser getModUser1() {
		return this.modUser1;
	}

	public void setModUser1(ModUser modUser1) {
		this.modUser1 = modUser1;
	}

	public ModUser getModUser2() {
		return this.modUser2;
	}

	public void setModUser2(ModUser modUser2) {
		this.modUser2 = modUser2;
	}

	public List<ModPatientclinic> getModPatientclinics() {
		return this.modPatientclinics;
	}

	public void setModPatientclinics(List<ModPatientclinic> modPatientclinics) {
		this.modPatientclinics = modPatientclinics;
	}


	public List<ModPatientfielddata> getModPatientfielddata() {
		return this.modPatientfielddata;
	}

	public void setModPatientfielddata(List<ModPatientfielddata> modPatientfielddata) {
		this.modPatientfielddata = modPatientfielddata;
	}

}
