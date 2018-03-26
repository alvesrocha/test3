package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;

/**
 * The primary key class for the mod_langname database table.
 * 
 */
@MappedSuperclass
public class ModLangnamePKGeneric implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false, unique=true, nullable=false, length=2)
	private String langid;

	@Column(insertable=false, updatable=false, unique=true, nullable=false, length=2)
	private String langused;

	public ModLangnamePKGeneric() {
	}
	public String getLangid() {
		return this.langid;
	}
	public void setLangid(String langid) {
		this.langid = langid;
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
		if (!(other instanceof ModLangnamePKGeneric)) {
			return false;
		}
		ModLangnamePKGeneric castOther = (ModLangnamePKGeneric)other;
		return 
			this.langid.equals(castOther.langid)
			&& this.langused.equals(castOther.langused);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.langid.hashCode();
		hash = hash * prime + this.langused.hashCode();
		
		return hash;
	}
}
