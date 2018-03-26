package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_langname database table.
 * 
 */
@MappedSuperclass
public class ModLangnameGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModLangnamePK id;

	@Column(nullable=false, length=255)
	private String langname;

	//bi-directional many-to-one association to ModLang
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="langid", nullable=false, insertable=false, updatable=false)
	private ModLang modLang1;

	//bi-directional many-to-one association to ModLang
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="langused", nullable=false, insertable=false, updatable=false)
	private ModLang modLang2;

	public ModLangnameGeneric() {
	}

	public ModLangnamePK getId() {
		return this.id;
	}

	public void setId(ModLangnamePK id) {
		this.id = id;
	}

	public String getLangname() {
		return this.langname;
	}

	public void setLangname(String langname) {
		this.langname = langname;
	}

	public ModLang getModLang1() {
		return this.modLang1;
	}

	public void setModLang1(ModLang modLang1) {
		this.modLang1 = modLang1;
	}

	public ModLang getModLang2() {
		return this.modLang2;
	}

	public void setModLang2(ModLang modLang2) {
		this.modLang2 = modLang2;
	}

}
