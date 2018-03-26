package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_clinicfieldlang database table.
 * 
 */
@MappedSuperclass
public class ModClinicfieldlangGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModClinicfieldlangPK id;

	@Column(nullable=false, length=255)
	private String fieldname;

	//bi-directional many-to-one association to ModClinicfield
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="clinicid", referencedColumnName="clinicid", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="fieldid", referencedColumnName="fieldid", nullable=false, insertable=false, updatable=false)
		})
	private ModClinicfield modClinicfield;

	//bi-directional many-to-one association to ModLang
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="langused", nullable=false, insertable=false, updatable=false)
	private ModLang modLang;

	public ModClinicfieldlangGeneric() {
	}

	public ModClinicfieldlangPK getId() {
		return this.id;
	}

	public void setId(ModClinicfieldlangPK id) {
		this.id = id;
	}

	public String getFieldname() {
		return this.fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	public ModClinicfield getModClinicfield() {
		return this.modClinicfield;
	}

	public void setModClinicfield(ModClinicfield modClinicfield) {
		this.modClinicfield = modClinicfield;
	}

	public ModLang getModLang() {
		return this.modLang;
	}

	public void setModLang(ModLang modLang) {
		this.modLang = modLang;
	}

}
