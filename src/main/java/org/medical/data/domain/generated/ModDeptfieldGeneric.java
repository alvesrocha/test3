package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_deptfields database table.
 * 
 */
@MappedSuperclass
public class ModDeptfieldGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModDeptfieldPK id;

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

	@Column(length=1)
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

	//bi-directional one-to-one association to ModDeptfielddata
	@OneToOne(mappedBy="modDeptfield", fetch=FetchType.LAZY)
	private ModDeptfielddata modDeptfielddata;

	//bi-directional many-to-one association to ModDeptfieldlang
	@OneToMany(mappedBy="modDeptfield")
	private List<ModDeptfieldlang> modDeptfieldlangs;

	//bi-directional many-to-one association to ModDept
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="deptid", nullable=false, insertable=false, updatable=false)
	private ModDept modDept;

	public ModDeptfieldGeneric() {
	}

	public ModDeptfieldPK getId() {
		return this.id;
	}

	public void setId(ModDeptfieldPK id) {
		this.id = id;
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

	public ModDeptfielddata getModDeptfielddata() {
		return this.modDeptfielddata;
	}

	public void setModDeptfielddata(ModDeptfielddata modDeptfielddata) {
		this.modDeptfielddata = modDeptfielddata;
	}

	public List<ModDeptfieldlang> getModDeptfieldlangs() {
		return this.modDeptfieldlangs;
	}

	public void setModDeptfieldlangs(List<ModDeptfieldlang> modDeptfieldlangs) {
		this.modDeptfieldlangs = modDeptfieldlangs;
	}

	public ModDept getModDept() {
		return this.modDept;
	}

	public void setModDept(ModDept modDept) {
		this.modDept = modDept;
	}

}
