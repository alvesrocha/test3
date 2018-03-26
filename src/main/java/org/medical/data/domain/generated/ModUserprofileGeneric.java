package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_userprofile database table.
 * 
 */
@MappedSuperclass
public class ModUserprofileGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModUserprofilePK id;

	@Column(nullable=false, length=1)
	private String enabled;

	@Column(nullable=false, length=1)
	private String valid;

	//bi-directional many-to-one association to ModProfile
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PROFILEID", nullable=false, insertable=false, updatable=false)
	private ModProfile modProfile;

	//bi-directional many-to-one association to ModStaff
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="STAFFID", nullable=false, insertable=false, updatable=false)
	private ModStaff modStaff;

	public ModUserprofileGeneric() {
	}

	public ModUserprofilePK getId() {
		return this.id;
	}

	public void setId(ModUserprofilePK id) {
		this.id = id;
	}

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getValid() {
		return this.valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	public ModProfile getModProfile() {
		return this.modProfile;
	}

	public void setModProfile(ModProfile modProfile) {
		this.modProfile = modProfile;
	}

	public ModStaff getModStaff() {
		return this.modStaff;
	}

	public void setModStaff(ModStaff modStaff) {
		this.modStaff = modStaff;
	}

}
