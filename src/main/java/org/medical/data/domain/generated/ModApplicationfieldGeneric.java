package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_applicationfields database table.
 * 
 */
@MappedSuperclass
public class ModApplicationfieldGeneric implements Serializable {
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

	//bi-directional many-to-one association to ModApplicationfielddata
	@OneToMany(mappedBy="modApplicationfield")
	private List<ModApplicationfielddata> modApplicationfielddata;

	//bi-directional many-to-one association to ModApplicationfieldlang
	@OneToMany(mappedBy="modApplicationfield")
	private List<ModApplicationfieldlang> modApplicationfieldlangs;

	//bi-directional many-to-one association to ModApplicationfield
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="autocompleteparentfield")
	private ModApplicationfield modApplicationfield;

	//bi-directional many-to-one association to ModApplicationfield
	@OneToMany(mappedBy="modApplicationfield")
	private List<ModApplicationfield> modApplicationfields;

	public ModApplicationfieldGeneric() {
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

	public List<ModApplicationfielddata> getModApplicationfielddata() {
		return this.modApplicationfielddata;
	}

	public void setModApplicationfielddata(List<ModApplicationfielddata> modApplicationfielddata) {
		this.modApplicationfielddata = modApplicationfielddata;
	}


	public List<ModApplicationfieldlang> getModApplicationfieldlangs() {
		return this.modApplicationfieldlangs;
	}

	public void setModApplicationfieldlangs(List<ModApplicationfieldlang> modApplicationfieldlangs) {
		this.modApplicationfieldlangs = modApplicationfieldlangs;
	}

	
	public ModApplicationfield getModApplicationfield() {
		return this.modApplicationfield;
	}

	public void setModApplicationfield(ModApplicationfield modApplicationfield) {
		this.modApplicationfield = modApplicationfield;
	}

	public List<ModApplicationfield> getModApplicationfields() {
		return this.modApplicationfields;
	}

	public void setModApplicationfields(List<ModApplicationfield> modApplicationfields) {
		this.modApplicationfields = modApplicationfields;
	}

}
