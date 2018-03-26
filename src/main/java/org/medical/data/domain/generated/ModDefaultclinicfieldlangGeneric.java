package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_defaultclinicfieldlang database table.
 * 
 */
@MappedSuperclass
public class ModDefaultclinicfieldlangGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModDefaultclinicfieldlangPK id;

	@Column(nullable=false, length=255)
	private String fieldname;

	//bi-directional many-to-one association to ModDefaultclinicfield
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fieldid", nullable=false, insertable=false, updatable=false)
	private ModDefaultclinicfield modDefaultclinicfield;

	//bi-directional many-to-one association to ModLang
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="langused", nullable=false, insertable=false, updatable=false)
	private ModLang modLang;

	public ModDefaultclinicfieldlangGeneric() {
	}

	public ModDefaultclinicfieldlangPK getId() {
		return this.id;
	}

	public void setId(ModDefaultclinicfieldlangPK id) {
		this.id = id;
	}

	public String getFieldname() {
		return this.fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	public ModDefaultclinicfield getModDefaultclinicfield() {
		return this.modDefaultclinicfield;
	}

	public void setModDefaultclinicfield(ModDefaultclinicfield modDefaultclinicfield) {
		this.modDefaultclinicfield = modDefaultclinicfield;
	}

	public ModLang getModLang() {
		return this.modLang;
	}

	public void setModLang(ModLang modLang) {
		this.modLang = modLang;
	}

}
