package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;

/**
 * The primary key class for the mod_countryname database table.
 * 
 */
@MappedSuperclass
public class ModCountrynamePKGeneric implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false, unique=true, nullable=false, length=2)
	private String countryid;

	@Column(insertable=false, updatable=false, unique=true, nullable=false, length=2)
	private String langused;

	public ModCountrynamePKGeneric() {
	}
	public String getCountryid() {
		return this.countryid;
	}
	public void setCountryid(String countryid) {
		this.countryid = countryid;
	}
	public String getLangused() {
		return this.langused;
	}
	public void setLangused(String langused) {
		this.langused = langused;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ModCountrynamePKGeneric)) {
			return false;
		}
		ModCountrynamePKGeneric castOther = (ModCountrynamePKGeneric)other;
		return 
			this.countryid.equals(castOther.countryid)
			&& this.langused.equals(castOther.langused);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.countryid.hashCode();
		hash = hash * prime + this.langused.hashCode();
		
		return hash;
	}
}
