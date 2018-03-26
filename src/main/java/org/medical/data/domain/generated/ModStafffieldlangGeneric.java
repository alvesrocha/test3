package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_stafffieldlang database table.
 * 
 */
@MappedSuperclass
public class ModStafffieldlangGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModStafffieldlangPK id;

	@Column(nullable=false, length=255)
	private String fieldname;

	//bi-directional many-to-one association to ModLang
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="langused", nullable=false, insertable=false, updatable=false)
	private ModLang modLang;

	//bi-directional many-to-one association to ModStafffield
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fieldid", nullable=false, insertable=false, updatable=false)
	private ModStafffield modStafffield;

	public ModStafffieldlangGeneric() {
	}

	public ModStafffieldlangPK getId() {
		return this.id;
	}

	public void setId(ModStafffieldlangPK id) {
		this.id = id;
	}

	public String getFieldname() {
		return this.fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	public ModLang getModLang() {
		return this.modLang;
	}

	public void setModLang(ModLang modLang) {
		this.modLang = modLang;
	}

	public ModStafffield getModStafffield() {
		return this.modStafffield;
	}

	public void setModStafffield(ModStafffield modStafffield) {
		this.modStafffield = modStafffield;
	}

}
