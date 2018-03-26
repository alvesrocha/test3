package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_defaultclinicfields database table.
 * 
 */
@MappedSuperclass
public class ModDefaultclinicfieldGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int fieldid;

	@Column(nullable=false, length=1)
	private String activated;

	@Column(nullable=false, length=40)
	private String additionalchar;

	@Column(nullable=false, length=1)
	private String editable;

	@Column(nullable=false)
	private int fieldposition;

	@Column(nullable=false, length=1)
	private String fieldtype;

	@Column(nullable=false, length=1)
	private String fixedfieldtype;

	@Column(nullable=false)
	private int lengthmax;

	@Column(nullable=false)
	private int lengthmin;

	@Column(nullable=false, length=1)
	private String searchmask;

	@Column(nullable=false, length=1)
	private String usetime;

	@Column(length=255)
	private String validationexp;

	//bi-directional many-to-one association to ModDefaultclinicfieldlang
	@OneToMany(mappedBy="modDefaultclinicfield")
	private List<ModDefaultclinicfieldlang> modDefaultclinicfieldlangs;

	public ModDefaultclinicfieldGeneric() {
	}

	public int getFieldid() {
		return this.fieldid;
	}

	public void setFieldid(int fieldid) {
		this.fieldid = fieldid;
	}

	public String getActivated() {
		return this.activated;
	}

	public void setActivated(String activated) {
		this.activated = activated;
	}

	public String getAdditionalchar() {
		return this.additionalchar;
	}

	public void setAdditionalchar(String additionalchar) {
		this.additionalchar = additionalchar;
	}

	public String getEditable() {
		return this.editable;
	}

	public void setEditable(String editable) {
		this.editable = editable;
	}

	public int getFieldposition() {
		return this.fieldposition;
	}

	public void setFieldposition(int fieldposition) {
		this.fieldposition = fieldposition;
	}

	public String getFieldtype() {
		return this.fieldtype;
	}

	public void setFieldtype(String fieldtype) {
		this.fieldtype = fieldtype;
	}

	public String getFixedfieldtype() {
		return this.fixedfieldtype;
	}

	public void setFixedfieldtype(String fixedfieldtype) {
		this.fixedfieldtype = fixedfieldtype;
	}

	public int getLengthmax() {
		return this.lengthmax;
	}

	public void setLengthmax(int lengthmax) {
		this.lengthmax = lengthmax;
	}

	public int getLengthmin() {
		return this.lengthmin;
	}

	public void setLengthmin(int lengthmin) {
		this.lengthmin = lengthmin;
	}

	public String getSearchmask() {
		return this.searchmask;
	}

	public void setSearchmask(String searchmask) {
		this.searchmask = searchmask;
	}

	public String getUsetime() {
		return this.usetime;
	}

	public void setUsetime(String usetime) {
		this.usetime = usetime;
	}

	public String getValidationexp() {
		return this.validationexp;
	}

	public void setValidationexp(String validationexp) {
		this.validationexp = validationexp;
	}

	public List<ModDefaultclinicfieldlang> getModDefaultclinicfieldlangs() {
		return this.modDefaultclinicfieldlangs;
	}

	public void setModDefaultclinicfieldlangs(List<ModDefaultclinicfieldlang> modDefaultclinicfieldlangs) {
		this.modDefaultclinicfieldlangs = modDefaultclinicfieldlangs;
	}

}
