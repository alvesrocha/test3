package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_defaultdeptfieldlang database table.
 * 
 */
@MappedSuperclass
public class ModDefaultdeptfieldlangGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModDefaultdeptfieldlangPK id;

	@Column(nullable=false, length=255)
	private String fieldname;

	//bi-directional many-to-one association to ModDefaultdeptfield
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fieldid", nullable=false, insertable=false, updatable=false)
	private ModDefaultdeptfield modDefaultdeptfield;

	//bi-directional many-to-one association to ModLang
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="langused", nullable=false, insertable=false, updatable=false)
	private ModLang modLang;

	public ModDefaultdeptfieldlangGeneric() {
	}

	public ModDefaultdeptfieldlangPK getId() {
		return this.id;
	}

	public void setId(ModDefaultdeptfieldlangPK id) {
		this.id = id;
	}

	public String getFieldname() {
		return this.fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	public ModDefaultdeptfield getModDefaultdeptfield() {
		return this.modDefaultdeptfield;
	}

	public void setModDefaultdeptfield(ModDefaultdeptfield modDefaultdeptfield) {
		this.modDefaultdeptfield = modDefaultdeptfield;
	}

	public ModLang getModLang() {
		return this.modLang;
	}

	public void setModLang(ModLang modLang) {
		this.modLang = modLang;
	}

}
