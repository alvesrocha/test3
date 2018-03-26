package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_staff database table.
 * 
 */
@MappedSuperclass
public class ModStaffGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int staffid;

	@Column(length=255)
	private String academicrank;

	@Column(length=1)
	private String activated;

	@Column(length=255)
	private String externaluserid;

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

	@Column(length=40)
	private String phone1;

	@Column(length=40)
	private String phone2;

	@Column(length=255)
	private String title;

	//bi-directional many-to-one association to ModDept
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="deptid", nullable=false)
	private ModDept modDept;

	//bi-directional many-to-one association to ModUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userid", nullable=false)
	private ModUser modUser;

	//bi-directional many-to-one association to ModStafffielddata
	@OneToMany(mappedBy="modStaff")
	private List<ModStafffielddata> modStafffielddata;

	//bi-directional many-to-one association to ModUserprofile
	@OneToMany(mappedBy="modStaff")
	private List<ModUserprofile> modUserprofiles;

	public ModStaffGeneric() {
	}

	public int getStaffid() {
		return this.staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	public String getAcademicrank() {
		return this.academicrank;
	}

	public void setAcademicrank(String academicrank) {
		this.academicrank = academicrank;
	}

	public String getActivated() {
		return this.activated;
	}

	public void setActivated(String activated) {
		this.activated = activated;
	}

	public String getExternaluserid() {
		return this.externaluserid;
	}

	public void setExternaluserid(String externaluserid) {
		this.externaluserid = externaluserid;
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

	public String getPhone1() {
		return this.phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return this.phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ModDept getModDept() {
		return this.modDept;
	}

	public void setModDept(ModDept modDept) {
		this.modDept = modDept;
	}

	public ModUser getModUser() {
		return this.modUser;
	}

	public void setModUser(ModUser modUser) {
		this.modUser = modUser;
	}

	public List<ModStafffielddata> getModStafffielddata() {
		return this.modStafffielddata;
	}

	public void setModStafffielddata(List<ModStafffielddata> modStafffielddata) {
		this.modStafffielddata = modStafffielddata;
	}

	public List<ModUserprofile> getModUserprofiles() {
		return this.modUserprofiles;
	}

	public void setModUserprofiles(List<ModUserprofile> modUserprofiles) {
		this.modUserprofiles = modUserprofiles;
	}
}
