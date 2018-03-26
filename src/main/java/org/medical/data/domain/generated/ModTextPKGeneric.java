package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;

/**
 * The primary key class for the mod_text database table.
 * 
 */
@MappedSuperclass
public class ModTextPKGeneric implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false, length=50)
	private String bundlename;

	@Column(unique=true, nullable=false, length=50)
	private String textkey;

	@Column(insertable=false, updatable=false, unique=true, nullable=false, length=2)
	private String langused;

	public ModTextPKGeneric() {
	}
	public String getBundlename() {
		return this.bundlename;
	}
	public void setBundlename(String bundlename) {
		this.bundlename = bundlename;
	}
	public String getTextkey() {
		return this.textkey;
	}
	public void setTextkey(String textkey) {
		this.textkey = textkey;
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
		if (!(other instanceof ModTextPKGeneric)) {
			return false;
		}
		ModTextPKGeneric castOther = (ModTextPKGeneric)other;
		return 
			this.bundlename.equals(castOther.bundlename)
			&& this.textkey.equals(castOther.textkey)
			&& this.langused.equals(castOther.langused);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.bundlename.hashCode();
		hash = hash * prime + this.textkey.hashCode();
		hash = hash * prime + this.langused.hashCode();
		
		return hash;
	}
}
