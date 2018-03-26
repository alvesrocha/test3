package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_text database table.
 * 
 */
@MappedSuperclass
public class ModTextGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModTextPK id;

	@Column(nullable=false, length=4000)
	private String textvalue;

	//bi-directional many-to-one association to ModLang
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="langused", nullable=false, insertable=false, updatable=false)
	private ModLang modLang;

	public ModTextGeneric() {
	}

	public ModTextPK getId() {
		return this.id;
	}

	public void setId(ModTextPK id) {
		this.id = id;
	}

	public String getTextvalue() {
		return this.textvalue;
	}

	public void setTextvalue(String textvalue) {
		this.textvalue = textvalue;
	}

	public ModLang getModLang() {
		return this.modLang;
	}

	public void setModLang(ModLang modLang) {
		this.modLang = modLang;
	}

}