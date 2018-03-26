package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;

/**
 * The primary key class for the mod_clinicfielddata database table.
 * 
 */
@MappedSuperclass
public class ModClinicfielddataPKGeneric implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int clinicid;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int fieldid;

	public ModClinicfielddataPKGeneric() {
	}
	public int getClinicid() {
		return this.clinicid;
	}
	public void setClinicid(int clinicid) {
		this.clinicid = clinicid;
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
		if (!(other instanceof ModClinicfielddataPKGeneric)) {
			return false;
		}
		ModClinicfielddataPKGeneric castOther = (ModClinicfielddataPKGeneric)other;
		return 
			(this.clinicid == castOther.clinicid)
			&& (this.fieldid == castOther.fieldid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.clinicid;
		hash = hash * prime + this.fieldid;
		
		return hash;
	}
}
