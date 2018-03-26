package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_deptfieldlang database table.
 * 
 */
@MappedSuperclass
public class ModDeptfieldlangGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModDeptfieldlangPK id;

	@Column(nullable=false, length=255)
	private String fieldname;

	//bi-directional many-to-one association to ModDeptfield
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="deptid", referencedColumnName="deptid", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="fieldid", referencedColumnName="fieldid", nullable=false, insertable=false, updatable=false)
		})
	private ModDeptfield modDeptfield;

	//bi-directional many-to-one association to ModLang
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="langused", nullable=false, insertable=false, updatable=false)
	private ModLang modLang;

	public ModDeptfieldlangGeneric() {
	}

	public ModDeptfieldlangPK getId() {
		return this.id;
	}

	public void setId(ModDeptfieldlangPK id) {
		this.id = id;
	}

	public String getFieldname() {
		return this.fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	public ModDeptfield getModDeptfield() {
		return this.modDeptfield;
	}

	public void setModDeptfield(ModDeptfield modDeptfield) {
		this.modDeptfield = modDeptfield;
	}

	public ModLang getModLang() {
		return this.modLang;
	}

	public void setModLang(ModLang modLang) {
		this.modLang = modLang;
	}

}
