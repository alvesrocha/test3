package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_patientclinic database table.
 * 
 */
@MappedSuperclass
public class ModPatientclinicGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int patientclinicid;

	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date created;

	@Temporal(TemporalType.DATE)
	private Date createdswitchuser;

	@Temporal(TemporalType.DATE)
	private Date dateofdischarge;

	@Temporal(TemporalType.DATE)
	private Date discharged;

	@Temporal(TemporalType.DATE)
	private Date dischargedswitchuser;

	@Column(length=512)
	private String hashedmrn;

	@Temporal(TemporalType.DATE)
	private Date modified;

	@Temporal(TemporalType.DATE)
	private Date modifiedswitchuser;

	@Column(length=255)
	private String mrn;

	//bi-directional many-to-one association to ModDept
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="deptid", nullable=false)
	private ModDept modDept;

	//bi-directional many-to-one association to ModPatient
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="patientid", nullable=false)
	private ModPatient modPatient;

	//bi-directional many-to-one association to ModPatientdischargereason
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dischargedreasonid")
	private ModPatientdischargereason modPatientdischargereason;

	//bi-directional many-to-one association to ModUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="createdbyswitchuser")
	private ModUser modUser1;

	//bi-directional many-to-one association to ModUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dischargedbyswitchuser")
	private ModUser modUser2;

	//bi-directional many-to-one association to ModUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dischargedby")
	private ModUser modUser3;

	//bi-directional many-to-one association to ModUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="modifiedbyswitchuser")
	private ModUser modUser4;

	//bi-directional many-to-one association to ModUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="createdby", nullable=false)
	private ModUser modUser5;

	//bi-directional many-to-one association to ModUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="modifiedby")
	private ModUser modUser6;

	//bi-directional many-to-one association to ModPatientpermission
	@OneToMany(mappedBy="modPatientclinic")
	private List<ModPatientpermission> modPatientpermissions;

	public ModPatientclinicGeneric() {
	}

	public int getPatientclinicid() {
		return this.patientclinicid;
	}

	public void setPatientclinicid(int patientclinicid) {
		this.patientclinicid = patientclinicid;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getCreatedswitchuser() {
		return this.createdswitchuser;
	}

	public void setCreatedswitchuser(Date createdswitchuser) {
		this.createdswitchuser = createdswitchuser;
	}

	public Date getDateofdischarge() {
		return this.dateofdischarge;
	}

	public void setDateofdischarge(Date dateofdischarge) {
		this.dateofdischarge = dateofdischarge;
	}

	public Date getDischarged() {
		return this.discharged;
	}

	public void setDischarged(Date discharged) {
		this.discharged = discharged;
	}

	public Date getDischargedswitchuser() {
		return this.dischargedswitchuser;
	}

	public void setDischargedswitchuser(Date dischargedswitchuser) {
		this.dischargedswitchuser = dischargedswitchuser;
	}

	public String getHashedmrn() {
		return this.hashedmrn;
	}

	public void setHashedmrn(String hashedmrn) {
		this.hashedmrn = hashedmrn;
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

	public String getMrn() {
		return this.mrn;
	}

	public void setMrn(String mrn) {
		this.mrn = mrn;
	}

	public ModDept getModDept() {
		return this.modDept;
	}

	public void setModDept(ModDept modDept) {
		this.modDept = modDept;
	}

	public ModPatient getModPatient() {
		return this.modPatient;
	}

	public void setModPatient(ModPatient modPatient) {
		this.modPatient = modPatient;
	}

	public ModPatientdischargereason getModPatientdischargereason() {
		return this.modPatientdischargereason;
	}

	public void setModPatientdischargereason(ModPatientdischargereason modPatientdischargereason) {
		this.modPatientdischargereason = modPatientdischargereason;
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

	public ModUser getModUser3() {
		return this.modUser3;
	}

	public void setModUser3(ModUser modUser3) {
		this.modUser3 = modUser3;
	}

	public ModUser getModUser4() {
		return this.modUser4;
	}

	public void setModUser4(ModUser modUser4) {
		this.modUser4 = modUser4;
	}

	public ModUser getModUser5() {
		return this.modUser5;
	}

	public void setModUser5(ModUser modUser5) {
		this.modUser5 = modUser5;
	}

	public ModUser getModUser6() {
		return this.modUser6;
	}

	public void setModUser6(ModUser modUser6) {
		this.modUser6 = modUser6;
	}

	public List<ModPatientpermission> getModPatientpermissions() {
		return this.modPatientpermissions;
	}

	public void setModPatientpermissions(List<ModPatientpermission> modPatientpermissions) {
		this.modPatientpermissions = modPatientpermissions;
	}

}
