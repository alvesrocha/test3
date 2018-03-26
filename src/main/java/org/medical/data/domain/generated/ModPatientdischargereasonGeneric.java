package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_patientdischargereason database table.
 * 
 */
@MappedSuperclass
public class ModPatientdischargereasonGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int patientdischargereasonid;

	@Column(nullable=false, length=100)
	private String internalname;

	//bi-directional many-to-one association to ModPatientclinic
	@OneToMany(mappedBy="modPatientdischargereason")
	private List<ModPatientclinic> modPatientclinics;

	//bi-directional many-to-one association to ModPatientdischargereasonlang
	@OneToMany(mappedBy="modPatientdischargereason")
	private List<ModPatientdischargereasonlang> modPatientdischargereasonlangs;

	public ModPatientdischargereasonGeneric() {
	}

	public int getPatientdischargereasonid() {
		return this.patientdischargereasonid;
	}

	public void setPatientdischargereasonid(int patientdischargereasonid) {
		this.patientdischargereasonid = patientdischargereasonid;
	}

	public String getInternalname() {
		return this.internalname;
	}

	public void setInternalname(String internalname) {
		this.internalname = internalname;
	}

	public List<ModPatientclinic> getModPatientclinics() {
		return this.modPatientclinics;
	}

	public void setModPatientclinics(List<ModPatientclinic> modPatientclinics) {
		this.modPatientclinics = modPatientclinics;
	}

	public List<ModPatientdischargereasonlang> getModPatientdischargereasonlangs() {
		return this.modPatientdischargereasonlangs;
	}

	public void setModPatientdischargereasonlangs(List<ModPatientdischargereasonlang> modPatientdischargereasonlangs) {
		this.modPatientdischargereasonlangs = modPatientdischargereasonlangs;
	}
}
