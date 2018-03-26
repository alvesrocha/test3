package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_modulelang database table.
 * 
 */
@MappedSuperclass
public class ModModulelangGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModModulelangPK id;

	@Column(nullable=false, length=255)
	private String modname;

	//bi-directional many-to-one association to ModLang
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="langused", nullable=false, insertable=false, updatable=false)
	private ModLang modLang;

	//bi-directional many-to-one association to ModModule
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="moduleid", nullable=false, insertable=false, updatable=false)
	private ModModule modModule;

	public ModModulelangGeneric() {
	}

	public ModModulelangPK getId() {
		return this.id;
	}

	public void setId(ModModulelangPK id) {
		this.id = id;
	}

	public String getModname() {
		return this.modname;
	}

	public void setModname(String modname) {
		this.modname = modname;
	}

	public ModLang getModLang() {
		return this.modLang;
	}

	public void setModLang(ModLang modLang) {
		this.modLang = modLang;
	}

	public ModModule getModModule() {
		return this.modModule;
	}

	public void setModModule(ModModule modModule) {
		this.modModule = modModule;
	}

}
