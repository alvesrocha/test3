package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_patientfields database table.
 * 
 */
@MappedSuperclass
public class ModPatientfieldGeneric implements Serializable {
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

	@Column(nullable=false, length=1)
	private String extendedsearchmask;

	@Column(nullable=false)
	private int fieldposition;

	@Column(length=1)
	private String fieldtype;

	@Column(length=1)
	private String fixedfieldtype;

	@Column(length=255)
	private String generatevaluescript;

	@Column(nullable=false)
	private int groupnumber;

	@Column(nullable=false, length=1)
	private String hashbase;

	@Column(nullable=false)
	private int lengthmax;

	@Column(nullable=false)
	private int lengthmin;

	@Column(nullable=false, length=1)
	private String patientlist;

	private int patientlistorder;

	@Column(nullable=false, length=1)
	private String readonly;

	@Column(nullable=false, length=1)
	private String searchmask;

	@Column(nullable=false, length=1)
	private String usetime;

	@Column(nullable=false, length=1)
	private String useunspecifiedgender;

	@Column(length=255)
	private String validatevaluescript;

	@Column(length=255)
	private String validationexp;

	@Column(nullable=false, length=1)
	private String visible;

	//bi-directional many-to-one association to ModPatientfielddata
	@OneToMany(mappedBy="modPatientfield")
	private List<ModPatientfielddata> modPatientfielddata;

	//bi-directional many-to-one association to ModPatientfieldlang
	@OneToMany(mappedBy="modPatientfield")
	private List<ModPatientfieldlang> modPatientfieldlangs;

	//bi-directional many-to-one association to ModClinic
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clinicid")
	private ModClinic modClinic;

	//bi-directional many-to-one association to ModDept
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="deptid")
	private ModDept modDept;

	//bi-directional many-to-one association to ModPatientfield
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="autocompleteparentfield")
	private ModPatientfield modPatientfield;

	//bi-directional many-to-one association to ModPatientfield
	@OneToMany(mappedBy="modPatientfield")
	private List<ModPatientfield> modPatientfields;

	public ModPatientfieldGeneric() {
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

	public String getExtendedsearchmask() {
		return this.extendedsearchmask;
	}

	public void setExtendedsearchmask(String extendedsearchmask) {
		this.extendedsearchmask = extendedsearchmask;
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

	public String getGeneratevaluescript() {
		return this.generatevaluescript;
	}

	public void setGeneratevaluescript(String generatevaluescript) {
		this.generatevaluescript = generatevaluescript;
	}

	public int getGroupnumber() {
		return this.groupnumber;
	}

	public void setGroupnumber(int groupnumber) {
		this.groupnumber = groupnumber;
	}

	public String getHashbase() {
		return this.hashbase;
	}

	public void setHashbase(String hashbase) {
		this.hashbase = hashbase;
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

	public String getPatientlist() {
		return this.patientlist;
	}

	public void setPatientlist(String patientlist) {
		this.patientlist = patientlist;
	}

	public int getPatientlistorder() {
		return this.patientlistorder;
	}

	public void setPatientlistorder(int patientlistorder) {
		this.patientlistorder = patientlistorder;
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

	public String getUseunspecifiedgender() {
		return this.useunspecifiedgender;
	}

	public void setUseunspecifiedgender(String useunspecifiedgender) {
		this.useunspecifiedgender = useunspecifiedgender;
	}

	public String getValidatevaluescript() {
		return this.validatevaluescript;
	}

	public void setValidatevaluescript(String validatevaluescript) {
		this.validatevaluescript = validatevaluescript;
	}

	public String getValidationexp() {
		return this.validationexp;
	}

	public void setValidationexp(String validationexp) {
		this.validationexp = validationexp;
	}

	public String getVisible() {
		return this.visible;
	}

	public void setVisible(String visible) {
		this.visible = visible;
	}

	public List<ModPatientfielddata> getModPatientfielddata() {
		return this.modPatientfielddata;
	}

	public void setModPatientfielddata(List<ModPatientfielddata> modPatientfielddata) {
		this.modPatientfielddata = modPatientfielddata;
	}

	public List<ModPatientfieldlang> getModPatientfieldlangs() {
		return this.modPatientfieldlangs;
	}

	public void setModPatientfieldlangs(List<ModPatientfieldlang> modPatientfieldlangs) {
		this.modPatientfieldlangs = modPatientfieldlangs;
	}

	public ModClinic getModClinic() {
		return this.modClinic;
	}

	public void setModClinic(ModClinic modClinic) {
		this.modClinic = modClinic;
	}

	public ModDept getModDept() {
		return this.modDept;
	}

	public void setModDept(ModDept modDept) {
		this.modDept = modDept;
	}

	public ModPatientfield getModPatientfield() {
		return this.modPatientfield;
	}

	public void setModPatientfield(ModPatientfield modPatientfield) {
		this.modPatientfield = modPatientfield;
	}

	public List<ModPatientfield> getModPatientfields() {
		return this.modPatientfields;
	}

	public void setModPatientfields(List<ModPatientfield> modPatientfields) {
		this.modPatientfields = modPatientfields;
	}

}
