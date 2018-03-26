package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_profilefunction database table.
 * 
 */
@MappedSuperclass
public class ModProfilefunctionGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModProfilefunctionPK id;

	@Column(nullable=false, length=1)
	private String scopecode;

	//bi-directional many-to-one association to ModFunction
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FUNCTIONID", nullable=false, insertable=false, updatable=false)
	private ModFunction modFunction;

	//bi-directional many-to-one association to ModProfile
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PROFILEID", nullable=false, insertable=false, updatable=false)
	private ModProfile modProfile;

	public ModProfilefunctionGeneric() {
	}

	public ModProfilefunctionPK getId() {
		return this.id;
	}

	public void setId(ModProfilefunctionPK id) {
		this.id = id;
	}

	public String getScopecode() {
		return this.scopecode;
	}

	public void setScopecode(String scopecode) {
		this.scopecode = scopecode;
	}

	public ModFunction getModFunction() {
		return this.modFunction;
	}

	public void setModFunction(ModFunction modFunction) {
		this.modFunction = modFunction;
	}

	public ModProfile getModProfile() {
		return this.modProfile;
	}

	public void setModProfile(ModProfile modProfile) {
		this.modProfile = modProfile;
	}

}
