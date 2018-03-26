package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_country database table.
 * 
 */
@MappedSuperclass
public class ModCountryGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, length=2)
	private String countryid;

	//bi-directional many-to-one association to ModClinic
	@OneToMany(mappedBy="modCountry")
	private List<ModClinic> modClinics;

	//bi-directional many-to-one association to ModDateformat
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dateformatid", nullable=false)
	private ModDateformat modDateformat;

	//bi-directional many-to-one association to ModCountryname
	@OneToMany(mappedBy="modCountry")
	private List<ModCountryname> modCountrynames;

	//bi-directional many-to-one association to ModModule
	@OneToMany(mappedBy="modCountry")
	private List<ModModule> modModules;

	//bi-directional many-to-one association to ModPatient
	@OneToMany(mappedBy="modCountry")
	private List<ModPatient> modPatients;

	public ModCountryGeneric() {
	}

	public String getCountryid() {
		return this.countryid;
	}

	public void setCountryid(String countryid) {
		this.countryid = countryid;
	}

	public List<ModClinic> getModClinics() {
		return this.modClinics;
	}

	public void setModClinics(List<ModClinic> modClinics) {
		this.modClinics = modClinics;
	}

	public ModDateformat getModDateformat() {
		return this.modDateformat;
	}

	public void setModDateformat(ModDateformat modDateformat) {
		this.modDateformat = modDateformat;
	}

	public List<ModCountryname> getModCountrynames() {
		return this.modCountrynames;
	}

	public void setModCountrynames(List<ModCountryname> modCountrynames) {
		this.modCountrynames = modCountrynames;
	}

	public List<ModModule> getModModules() {
		return this.modModules;
	}

	public void setModModules(List<ModModule> modModules) {
		this.modModules = modModules;
	}

	public List<ModPatient> getModPatients() {
		return this.modPatients;
	}

	public void setModPatients(List<ModPatient> modPatients) {
		this.modPatients = modPatients;
	}
}
