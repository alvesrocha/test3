package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;

/**
 * The primary key class for the mod_profilefunction database table.
 * 
 */
@MappedSuperclass
public class ModProfilefunctionPKGeneric implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int profileid;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int functionid;

	public ModProfilefunctionPKGeneric() {
	}
	public int getProfileid() {
		return this.profileid;
	}
	public void setProfileid(int profileid) {
		this.profileid = profileid;
	}
	public int getFunctionid() {
		return this.functionid;
	}
	public void setFunctionid(int functionid) {
		this.functionid = functionid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ModProfilefunctionPKGeneric)) {
			return false;
		}
		ModProfilefunctionPKGeneric castOther = (ModProfilefunctionPKGeneric)other;
		return 
			(this.profileid == castOther.profileid)
			&& (this.functionid == castOther.functionid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.profileid;
		hash = hash * prime + this.functionid;
		
		return hash;
	}
}
