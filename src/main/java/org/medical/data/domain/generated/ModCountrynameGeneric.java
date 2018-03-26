package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_countryname database table.
 * 
 */
@MappedSuperclass
public class ModCountrynameGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModCountrynamePK id;

	@Column(nullable=false, length=255)
	private String longname;

	@Column(nullable=false, length=255)
	private String shortname;

	//bi-directional many-to-one association to ModCountry
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="countryid", nullable=false, insertable=false, updatable=false)
	private ModCountry modCountry;

	//bi-directional many-to-one association to ModLang
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="langused", nullable=false, insertable=false, updatable=false)
	private ModLang modLang;

	public ModCountrynameGeneric() {
	}

	public ModCountrynamePK getId() {
		return this.id;
	}

	public void setId(ModCountrynamePK id) {
		this.id = id;
	}

	public String getLongname() {
		return this.longname;
	}

	public void setLongname(String longname) {
		this.longname = longname;
	}

	public String getShortname() {
		return this.shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
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

}
