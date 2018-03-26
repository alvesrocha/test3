package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_fieldoptionlang database table.
 * 
 */
@MappedSuperclass
public class ModFieldoptionlangGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModFieldoptionlangPK id;

	@Column(nullable=false, length=255)
	private String option;

	//bi-directional many-to-one association to ModFieldoption
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fieldoptionid", nullable=false, insertable=false, updatable=false)
	private ModFieldoption modFieldoption;

	//bi-directional many-to-one association to ModLang
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="langused", nullable=false, insertable=false, updatable=false)
	private ModLang modLang;

	public ModFieldoptionlangGeneric() {
	}

	public ModFieldoptionlangPK getId() {
		return this.id;
	}

	public void setId(ModFieldoptionlangPK id) {
		this.id = id;
	}

	public String getOption() {
		return this.option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public ModFieldoption getModFieldoption() {
		return this.modFieldoption;
	}

	public void setModFieldoption(ModFieldoption modFieldoption) {
		this.modFieldoption = modFieldoption;
	}

	public ModLang getModLang() {
		return this.modLang;
	}

	public void setModLang(ModLang modLang) {
		this.modLang = modLang;
	}

}
