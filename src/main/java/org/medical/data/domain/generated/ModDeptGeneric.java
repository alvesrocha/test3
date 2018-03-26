package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_dept database table.
 * 
 */
@MappedSuperclass
public class ModDeptGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int deptid;

	@Column(nullable=false, length=255)
	private String deptname;

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

	//bi-directional many-to-one association to ModClinic
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clinicid", nullable=false)
	private ModClinic modClinic;

	//bi-directional many-to-one association to ModPermissiongroup
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="permissiongroupid", nullable=false)
	private ModPermissiongroup modPermissiongroup;

	//bi-directional many-to-one association to ModUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="modifiedby")
	private ModUser modUser;

	//bi-directional many-to-one association to ModDeptfield
	@OneToMany(mappedBy="modDept")
	private List<ModDeptfield> modDeptfields;

	//bi-directional many-to-one association to ModPatientclinic
	@OneToMany(mappedBy="modDept")
	private List<ModPatientclinic> modPatientclinics;

	//bi-directional many-to-one association to ModPatientfield
	@OneToMany(mappedBy="modDept")
	private List<ModPatientfield> modPatientfields;

	//bi-directional many-to-one association to ModStaff
	@OneToMany(mappedBy="modDept")
	private List<ModStaff> modStaffs;

	public ModDeptGeneric() {
	}

	public int getDeptid() {
		return this.deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return this.deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
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

	public ModClinic getModClinic() {
		return this.modClinic;
	}

	public void setModClinic(ModClinic modClinic) {
		this.modClinic = modClinic;
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

	public List<ModDeptfield> getModDeptfields() {
		return this.modDeptfields;
	}

	public void setModDeptfields(List<ModDeptfield> modDeptfields) {
		this.modDeptfields = modDeptfields;
	}

	public List<ModPatientclinic> getModPatientclinics() {
		return this.modPatientclinics;
	}

	public void setModPatientclinics(List<ModPatientclinic> modPatientclinics) {
		this.modPatientclinics = modPatientclinics;
	}

	public List<ModPatientfield> getModPatientfields() {
		return this.modPatientfields;
	}

	public void setModPatientfields(List<ModPatientfield> modPatientfields) {
		this.modPatientfields = modPatientfields;
	}

	public List<ModStaff> getModStaffs() {
		return this.modStaffs;
	}

	public void setModStaffs(List<ModStaff> modStaffs) {
		this.modStaffs = modStaffs;
	}

}
