package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_permissiongroup database table.
 * 
 */
@MappedSuperclass
public class ModPermissiongroupGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int permissiongroupid;

	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date created;

	@Column(length=255)
	private String groupname;

	@Column(nullable=false, length=1)
	private String grouptype;

	//bi-directional many-to-one association to ModClinic
	@OneToMany(mappedBy="modPermissiongroup")
	private List<ModClinic> modClinics;

	//bi-directional many-to-one association to ModDept
	@OneToMany(mappedBy="modPermissiongroup")
	private List<ModDept> modDepts;

	//bi-directional many-to-one association to ModModule
	@OneToMany(mappedBy="modPermissiongroup")
	private List<ModModule> modModules;

	//bi-directional many-to-one association to ModPatientpermission
	@OneToMany(mappedBy="modPermissiongroup")
	private List<ModPatientpermission> modPatientpermissions;

	//bi-directional many-to-one association to ModUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="createdby")
	private ModUser modUser;

	public ModPermissiongroupGeneric() {
	}

	public int getPermissiongroupid() {
		return this.permissiongroupid;
	}

	public void setPermissiongroupid(int permissiongroupid) {
		this.permissiongroupid = permissiongroupid;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getGroupname() {
		return this.groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public String getGrouptype() {
		return this.grouptype;
	}

	public void setGrouptype(String grouptype) {
		this.grouptype = grouptype;
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

	public List<ModModule> getModModules() {
		return this.modModules;
	}

	public void setModModules(List<ModModule> modModules) {
		this.modModules = modModules;
	}

	public List<ModPatientpermission> getModPatientpermissions() {
		return this.modPatientpermissions;
	}

	public void setModPatientpermissions(List<ModPatientpermission> modPatientpermissions) {
		this.modPatientpermissions = modPatientpermissions;
	}

	public ModUser getModUser() {
		return this.modUser;
	}

	public void setModUser(ModUser modUser) {
		this.modUser = modUser;
	}

}
