package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;

/**
 * The primary key class for the mod_stafffielddata database table.
 * 
 */
@MappedSuperclass
public class ModStafffielddataPKGeneric implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int staffid;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int fieldid;

	public ModStafffielddataPKGeneric() {
	}
	public int getStaffid() {
		return this.staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
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
		if (!(other instanceof ModStafffielddataPKGeneric)) {
			return false;
		}
		ModStafffielddataPKGeneric castOther = (ModStafffielddataPKGeneric)other;
		return 
			(this.staffid == castOther.staffid)
			&& (this.fieldid == castOther.fieldid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.staffid;
		hash = hash * prime + this.fieldid;
		
		return hash;
	}
}
