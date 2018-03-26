package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;

/**
 * The primary key class for the mod_applicationfielddata database table.
 * 
 */
@MappedSuperclass
public class ModApplicationfielddataPKGeneric implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int userid;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int fieldid;

	public ModApplicationfielddataPKGeneric() {
	}
	public int getUserid() {
		return this.userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
		if (!(other instanceof ModApplicationfielddataPKGeneric)) {
			return false;
		}
		ModApplicationfielddataPKGeneric castOther = (ModApplicationfielddataPKGeneric)other;
		return 
			(this.userid == castOther.userid)
			&& (this.fieldid == castOther.fieldid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userid;
		hash = hash * prime + this.fieldid;
		
		return hash;
	}
}
