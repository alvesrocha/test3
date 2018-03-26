package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;

/**
 * The primary key class for the mod_deptfielddata database table.
 * 
 */
@MappedSuperclass
public class ModDeptfielddataPKGeneric implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int deptid;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int fieldid;

	public ModDeptfielddataPKGeneric() {
	}
	public int getDeptid() {
		return this.deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
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
		if (!(other instanceof ModDeptfielddataPKGeneric)) {
			return false;
		}
		ModDeptfielddataPKGeneric castOther = (ModDeptfielddataPKGeneric)other;
		return 
			(this.deptid == castOther.deptid)
			&& (this.fieldid == castOther.fieldid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.deptid;
		hash = hash * prime + this.fieldid;
		
		return hash;
	}
}
