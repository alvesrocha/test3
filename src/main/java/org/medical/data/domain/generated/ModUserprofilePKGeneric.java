package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;

/**
 * The primary key class for the mod_userprofile database table.
 * 
 */
@MappedSuperclass
public class ModUserprofilePKGeneric implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int profileid;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int staffid;

	public ModUserprofilePKGeneric() {
	}
	public int getProfileid() {
		return this.profileid;
	}
	public void setProfileid(int profileid) {
		this.profileid = profileid;
	}
	public int getStaffid() {
		return this.staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ModUserprofilePKGeneric)) {
			return false;
		}
		ModUserprofilePKGeneric castOther = (ModUserprofilePKGeneric)other;
		return 
			(this.profileid == castOther.profileid)
			&& (this.staffid == castOther.staffid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.profileid;
		hash = hash * prime + this.staffid;
		
		return hash;
	}
}
