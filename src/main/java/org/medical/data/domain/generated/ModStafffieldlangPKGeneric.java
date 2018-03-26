package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;

/**
 * The primary key class for the mod_stafffieldlang database table.
 * 
 */
@MappedSuperclass
public class ModStafffieldlangPKGeneric implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int fieldid;

	@Column(insertable=false, updatable=false, unique=true, nullable=false, length=2)
	private String langused;

	public ModStafffieldlangPKGeneric() {
	}
	public int getFieldid() {
		return this.fieldid;
	}
	public void setFieldid(int fieldid) {
		this.fieldid = fieldid;
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
		if (!(other instanceof ModStafffieldlangPKGeneric)) {
			return false;
		}
		ModStafffieldlangPKGeneric castOther = (ModStafffieldlangPKGeneric)other;
		return 
			(this.fieldid == castOther.fieldid)
			&& this.langused.equals(castOther.langused);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.fieldid;
		hash = hash * prime + this.langused.hashCode();
		
		return hash;
	}
}
