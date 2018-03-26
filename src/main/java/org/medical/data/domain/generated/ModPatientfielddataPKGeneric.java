package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;

/**
 * The primary key class for the mod_patientfielddata database table.
 * 
 */
@MappedSuperclass
public class ModPatientfielddataPKGeneric implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int patientid;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int fieldid;

	public ModPatientfielddataPKGeneric() {
	}
	public int getPatientid() {
		return this.patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public int getFieldid() {
		return this.fieldid;
	}
	public void setFieldid(int fieldid) {
		this.fieldid = fieldid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ModPatientfielddataPKGeneric)) {
			return false;
		}
		ModPatientfielddataPKGeneric castOther = (ModPatientfielddataPKGeneric)other;
		return 
			(this.patientid == castOther.patientid)
			&& (this.fieldid == castOther.fieldid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.patientid;
		hash = hash * prime + this.fieldid;
		
		return hash;
	}
}
