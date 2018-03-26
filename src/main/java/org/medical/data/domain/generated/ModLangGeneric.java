package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_lang database table.
 * 
 */
@MappedSuperclass
public class ModLangGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, length=2)
	private String langid;

	//bi-directional many-to-one association to ModApplicationfieldlang
	@OneToMany(mappedBy="modLang")
	private List<ModApplicationfieldlang> modApplicationfieldlangs;

	//bi-directional many-to-one association to ModClinic
	@OneToMany(mappedBy="modLang")
	private List<ModClinic> modClinics;

	//bi-directional many-to-one association to ModClinicfieldlang
	@OneToMany(mappedBy="modLang")
	private List<ModClinicfieldlang> modClinicfieldlangs;

	//bi-directional many-to-one association to ModCountryname
	@OneToMany(mappedBy="modLang")
	private List<ModCountryname> modCountrynames;

	//bi-directional many-to-one association to ModDefaultclinicfieldlang
	@OneToMany(mappedBy="modLang")
	private List<ModDefaultclinicfieldlang> modDefaultclinicfieldlangs;

	//bi-directional many-to-one association to ModDefaultdeptfieldlang
	@OneToMany(mappedBy="modLang")
	private List<ModDefaultdeptfieldlang> modDefaultdeptfieldlangs;

	//bi-directional many-to-one association to ModDeptfieldlang
	@OneToMany(mappedBy="modLang")
	private List<ModDeptfieldlang> modDeptfieldlangs;

	//bi-directional many-to-one association to ModFieldoptionlang
	@OneToMany(mappedBy="modLang")
	private List<ModFieldoptionlang> modFieldoptionlangs;

	//bi-directional many-to-one association to ModLangname
	@OneToMany(mappedBy="modLang1")
	private List<ModLangname> modLangnames1;

	//bi-directional many-to-one association to ModLangname
	@OneToMany(mappedBy="modLang2")
	private List<ModLangname> modLangnames2;

	//bi-directional many-to-one association to ModModule
	@OneToMany(mappedBy="modLang")
	private List<ModModule> modModules;

	//bi-directional many-to-one association to ModModulelang
	@OneToMany(mappedBy="modLang")
	private List<ModModulelang> modModulelangs;

	//bi-directional many-to-one association to ModPatient
	@OneToMany(mappedBy="modLang")
	private List<ModPatient> modPatients;

	//bi-directional many-to-one association to ModPatientdischargereasonlang
	@OneToMany(mappedBy="modLang")
	private List<ModPatientdischargereasonlang> modPatientdischargereasonlangs;

	//bi-directional many-to-one association to ModPatientfieldlang
	@OneToMany(mappedBy="modLang")
	private List<ModPatientfieldlang> modPatientfieldlangs;

	//bi-directional many-to-one association to ModStafffieldlang
	@OneToMany(mappedBy="modLang")
	private List<ModStafffieldlang> modStafffieldlangs;

	//bi-directional many-to-one association to ModText
	@OneToMany(mappedBy="modLang")
	private List<ModText> modTexts;

	//bi-directional many-to-one association to ModUser
	@OneToMany(mappedBy="modLang")
	private List<ModUser> modUsers;

	public ModLangGeneric() {
	}

	public String getLangid() {
		return this.langid;
	}

	public void setLangid(String langid) {
		this.langid = langid;
	}

	public List<ModApplicationfieldlang> getModApplicationfieldlangs() {
		return this.modApplicationfieldlangs;
	}

	public void setModApplicationfieldlangs(List<ModApplicationfieldlang> modApplicationfieldlangs) {
		this.modApplicationfieldlangs = modApplicationfieldlangs;
	}

	public List<ModClinic> getModClinics() {
		return this.modClinics;
	}

	public void setModClinics(List<ModClinic> modClinics) {
		this.modClinics = modClinics;
	}


	public List<ModClinicfieldlang> getModClinicfieldlangs() {
		return this.modClinicfieldlangs;
	}

	public void setModClinicfieldlangs(List<ModClinicfieldlang> modClinicfieldlangs) {
		this.modClinicfieldlangs = modClinicfieldlangs;
	}

	public List<ModCountryname> getModCountrynames() {
		return this.modCountrynames;
	}

	public void setModCountrynames(List<ModCountryname> modCountrynames) {
		this.modCountrynames = modCountrynames;
	}

	public List<ModDefaultclinicfieldlang> getModDefaultclinicfieldlangs() {
		return this.modDefaultclinicfieldlangs;
	}

	public void setModDefaultclinicfieldlangs(List<ModDefaultclinicfieldlang> modDefaultclinicfieldlangs) {
		this.modDefaultclinicfieldlangs = modDefaultclinicfieldlangs;
	}



	public List<ModDefaultdeptfieldlang> getModDefaultdeptfieldlangs() {
		return this.modDefaultdeptfieldlangs;
	}

	public void setModDefaultdeptfieldlangs(List<ModDefaultdeptfieldlang> modDefaultdeptfieldlangs) {
		this.modDefaultdeptfieldlangs = modDefaultdeptfieldlangs;
	}

	public List<ModDeptfieldlang> getModDeptfieldlangs() {
		return this.modDeptfieldlangs;
	}

	public void setModDeptfieldlangs(List<ModDeptfieldlang> modDeptfieldlangs) {
		this.modDeptfieldlangs = modDeptfieldlangs;
	}

	public ModDeptfieldlang removeModDeptfieldlang(ModDeptfieldlang modDeptfieldlang) {
		getModDeptfieldlangs().remove(modDeptfieldlang);
		modDeptfieldlang.setModLang(null);

		return modDeptfieldlang;
	}

	public List<ModFieldoptionlang> getModFieldoptionlangs() {
		return this.modFieldoptionlangs;
	}

	public void setModFieldoptionlangs(List<ModFieldoptionlang> modFieldoptionlangs) {
		this.modFieldoptionlangs = modFieldoptionlangs;
	}

	public List<ModLangname> getModLangnames1() {
		return this.modLangnames1;
	}

	public void setModLangnames1(List<ModLangname> modLangnames1) {
		this.modLangnames1 = modLangnames1;
	}

	public List<ModLangname> getModLangnames2() {
		return this.modLangnames2;
	}

	public void setModLangnames2(List<ModLangname> modLangnames2) {
		this.modLangnames2 = modLangnames2;
	}

	public List<ModModule> getModModules() {
		return this.modModules;
	}

	public void setModModules(List<ModModule> modModules) {
		this.modModules = modModules;
	}

	public List<ModModulelang> getModModulelangs() {
		return this.modModulelangs;
	}

	public void setModModulelangs(List<ModModulelang> modModulelangs) {
		this.modModulelangs = modModulelangs;
	}
	public List<ModPatient> getModPatients() {
		return this.modPatients;
	}

	public void setModPatients(List<ModPatient> modPatients) {
		this.modPatients = modPatients;
	}

	public List<ModPatientdischargereasonlang> getModPatientdischargereasonlangs() {
		return this.modPatientdischargereasonlangs;
	}

	public void setModPatientdischargereasonlangs(List<ModPatientdischargereasonlang> modPatientdischargereasonlangs) {
		this.modPatientdischargereasonlangs = modPatientdischargereasonlangs;
	}

	public List<ModPatientfieldlang> getModPatientfieldlangs() {
		return this.modPatientfieldlangs;
	}

	public void setModPatientfieldlangs(List<ModPatientfieldlang> modPatientfieldlangs) {
		this.modPatientfieldlangs = modPatientfieldlangs;
	}


	public List<ModStafffieldlang> getModStafffieldlangs() {
		return this.modStafffieldlangs;
	}

	public void setModStafffieldlangs(List<ModStafffieldlang> modStafffieldlangs) {
		this.modStafffieldlangs = modStafffieldlangs;
	}

	public List<ModText> getModTexts() {
		return this.modTexts;
	}

	public void setModTexts(List<ModText> modTexts) {
		this.modTexts = modTexts;
	}

	public List<ModUser> getModUsers() {
		return this.modUsers;
	}

	public void setModUsers(List<ModUser> modUsers) {
		this.modUsers = modUsers;
	}

}
