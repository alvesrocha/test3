package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;

/**
 * The primary key class for the mod_patientdischargereasonlang database table.
 * 
 */
@MappedSuperclass
public class ModPatientdischargereasonlangPKGeneric implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int patientdischargereasonid;

	@Column(insertable=false, updatable=false, unique=true, nullable=false, length=2)
	private String langused;

	public ModPatientdischargereasonlangPKGeneric() {
	}
	public int getPatientdischargereasonid() {
		return this.patientdischargereasonid;
	}
	public void setPatientdischargereasonid(int patientdischargereasonid) {
		this.patientdischargereasonid = patientdischargereasonid;
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
		if (!(other instanceof ModPatientdischargereasonlangPKGeneric)) {
			return false;
		}
		ModPatientdischargereasonlangPKGeneric castOther = (ModPatientdischargereasonlangPKGeneric)other;
		return 
			(this.patientdischargereasonid == castOther.patientdischargereasonid)
			&& this.langused.equals(castOther.langused);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.patientdischargereasonid;
		hash = hash * prime + this.langused.hashCode();
		
		return hash;
	}
}
