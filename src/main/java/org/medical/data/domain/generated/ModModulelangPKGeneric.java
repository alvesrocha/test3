package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;

/**
 * The primary key class for the mod_modulelang database table.
 * 
 */
@MappedSuperclass
public class ModModulelangPKGeneric implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int moduleid;

	@Column(insertable=false, updatable=false, unique=true, nullable=false, length=2)
	private String langused;

	public ModModulelangPKGeneric() {
	}
	public int getModuleid() {
		return this.moduleid;
	}
	public void setModuleid(int moduleid) {
		this.moduleid = moduleid;
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
		if (!(other instanceof ModModulelangPKGeneric)) {
			return false;
		}
		ModModulelangPKGeneric castOther = (ModModulelangPKGeneric)other;
		return 
			(this.moduleid == castOther.moduleid)
			&& this.langused.equals(castOther.langused);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.moduleid;
		hash = hash * prime + this.langused.hashCode();
		
		return hash;
	}
}
