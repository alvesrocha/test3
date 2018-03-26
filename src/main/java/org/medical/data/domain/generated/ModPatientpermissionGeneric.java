package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_patientpermission database table.
 * 
 */
@MappedSuperclass
public class ModPatientpermissionGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int patientpermissionid;

	@Column(nullable=false, length=1)
	private String permission;

	//bi-directional many-to-one association to ModPatientclinic
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="patientclinicid", nullable=false)
	private ModPatientclinic modPatientclinic;

	//bi-directional many-to-one association to ModPermissiongroup
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="permissiongroupid", nullable=false)
	private ModPermissiongroup modPermissiongroup;

	public ModPatientpermissionGeneric() {
	}

	public int getPatientpermissionid() {
		return this.patientpermissionid;
	}

	public void setPatientpermissionid(int patientpermissionid) {
		this.patientpermissionid = patientpermissionid;
	}

	public String getPermission() {
		return this.permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public ModPatientclinic getModPatientclinic() {
		return this.modPatientclinic;
	}

	public void setModPatientclinic(ModPatientclinic modPatientclinic) {
		this.modPatientclinic = modPatientclinic;
	}

	public ModPermissiongroup getModPermissiongroup() {
		return this.modPermissiongroup;
	}

	public void setModPermissiongroup(ModPermissiongroup modPermissiongroup) {
		this.modPermissiongroup = modPermissiongroup;
	}

}
