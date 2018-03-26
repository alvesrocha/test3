package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_fieldoption database table.
 * 
 */
@MappedSuperclass
public class ModFieldoptionGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int fieldoptionid;

	@Column(nullable=false)
	private int fieldid;

	@Column(nullable=false, length=100)
	private String internalname;

	@Column(nullable=false, length=1)
	private String type;

	//bi-directional many-to-one association to ModFieldoptionlang
	@OneToMany(mappedBy="modFieldoption")
	private List<ModFieldoptionlang> modFieldoptionlangs;

	public ModFieldoptionGeneric() {
	}

	public int getFieldoptionid() {
		return this.fieldoptionid;
	}

	public void setFieldoptionid(int fieldoptionid) {
		this.fieldoptionid = fieldoptionid;
	}

	public int getFieldid() {
		return this.fieldid;
	}

	public void setFieldid(int fieldid) {
		this.fieldid = fieldid;
	}

	public String getInternalname() {
		return this.internalname;
	}

	public void setInternalname(String internalname) {
		this.internalname = internalname;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<ModFieldoptionlang> getModFieldoptionlangs() {
		return this.modFieldoptionlangs;
	}

	public void setModFieldoptionlangs(List<ModFieldoptionlang> modFieldoptionlangs) {
		this.modFieldoptionlangs = modFieldoptionlangs;
	}

}
