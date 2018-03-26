package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_stafffields database table.
 * 
 */
@MappedSuperclass
public class ModStafffieldGeneric implements Serializable {
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
	private String allowvalidationdeactivation;

	@Column(nullable=false, length=1)
	private String autocomplete;

	@Column(nullable=false)
	private int columnspan;

	@Column(nullable=false, length=1)
	private String editable;

	@Column(nullable=false)
	private int fieldposition;

	@Column(nullable=false, length=1)
	private String fieldtype;

	@Column(length=1)
	private String fixedfieldtype;

	@Column(nullable=false)
	private int groupnumber;

	@Column(nullable=false)
	private int lengthmax;

	@Column(nullable=false)
	private int lengthmin;

	@Column(nullable=false, length=1)
	private String readonly;

	@Column(nullable=false, length=1)
	private String searchmask;

	@Column(nullable=false, length=1)
	private String usetime;

	@Column(length=255)
	private String validationexp;

	//bi-directional many-to-one association to ModStafffielddata
	@OneToMany(mappedBy="modStafffield")
	private List<ModStafffielddata> modStafffielddata;

	//bi-directional many-to-one association to ModStafffieldlang
	@OneToMany(mappedBy="modStafffield")
	private List<ModStafffieldlang> modStafffieldlangs;

	//bi-directional many-to-one association to ModStafffield
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="autocompleteparentfield")
	private ModStafffield modStafffield;

	//bi-directional many-to-one association to ModStafffield
	@OneToMany(mappedBy="modStafffield")
	private List<ModStafffield> modStafffields;

	public ModStafffieldGeneric() {
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

	public String getAllowvalidationdeactivation() {
		return this.allowvalidationdeactivation;
	}

	public void setAllowvalidationdeactivation(String allowvalidationdeactivation) {
		this.allowvalidationdeactivation = allowvalidationdeactivation;
	}

	public String getAutocomplete() {
		return this.autocomplete;
	}

	public void setAutocomplete(String autocomplete) {
		this.autocomplete = autocomplete;
	}

	public int getColumnspan() {
		return this.columnspan;
	}

	public void setColumnspan(int columnspan) {
		this.columnspan = columnspan;
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

	public int getGroupnumber() {
		return this.groupnumber;
	}

	public void setGroupnumber(int groupnumber) {
		this.groupnumber = groupnumber;
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

	public String getReadonly() {
		return this.readonly;
	}

	public void setReadonly(String readonly) {
		this.readonly = readonly;
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

	public List<ModStafffielddata> getModStafffielddata() {
		return this.modStafffielddata;
	}

	public void setModStafffielddata(List<ModStafffielddata> modStafffielddata) {
		this.modStafffielddata = modStafffielddata;
	}

	public List<ModStafffieldlang> getModStafffieldlangs() {
		return this.modStafffieldlangs;
	}

	public void setModStafffieldlangs(List<ModStafffieldlang> modStafffieldlangs) {
		this.modStafffieldlangs = modStafffieldlangs;
	}

	public ModStafffield getModStafffield() {
		return this.modStafffield;
	}

	public void setModStafffield(ModStafffield modStafffield) {
		this.modStafffield = modStafffield;
	}

	public List<ModStafffield> getModStafffields() {
		return this.modStafffields;
	}

	public void setModStafffields(List<ModStafffield> modStafffields) {
		this.modStafffields = modStafffields;
	}
}
