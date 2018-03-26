package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_patientdischargereasonlang database table.
 * 
 */
@MappedSuperclass
public class ModPatientdischargereasonlangGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModPatientdischargereasonlangPK id;

	@Column(nullable=false, length=100)
	private String patientdischargereason;

	//bi-directional many-to-one association to ModLang
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="langused", nullable=false, insertable=false, updatable=false)
	private ModLang modLang;

	//bi-directional many-to-one association to ModPatientdischargereason
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="patientdischargereasonid", nullable=false, insertable=false, updatable=false)
	private ModPatientdischargereason modPatientdischargereason;

	public ModPatientdischargereasonlangGeneric() {
	}

	public ModPatientdischargereasonlangPK getId() {
		return this.id;
	}

	public void setId(ModPatientdischargereasonlangPK id) {
		this.id = id;
	}

	public String getPatientdischargereason() {
		return this.patientdischargereason;
	}

	public void setPatientdischargereason(String patientdischargereason) {
		this.patientdischargereason = patientdischargereason;
	}

	public ModLang getModLang() {
		return this.modLang;
	}

	public void setModLang(ModLang modLang) {
		this.modLang = modLang;
	}

	public ModPatientdischargereason getModPatientdischargereason() {
		return this.modPatientdischargereason;
	}

	public void setModPatientdischargereason(ModPatientdischargereason modPatientdischargereason) {
		this.modPatientdischargereason = modPatientdischargereason;
	}

}
