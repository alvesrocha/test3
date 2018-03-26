package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_patientfielddata database table.
 * 
 */
@MappedSuperclass
public class ModPatientfielddataGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModPatientfielddataPK id;

	@Column(length=1024)
	private String charvalue;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datevalue;

	@Column(length=1024)
	private String hashvalue;

	//bi-directional many-to-one association to ModPatient
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="patientid", nullable=false, insertable=false, updatable=false)
	private ModPatient modPatient;

	//bi-directional many-to-one association to ModPatientfield
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fieldid", nullable=false, insertable=false, updatable=false)
	private ModPatientfield modPatientfield;

	public ModPatientfielddataGeneric() {
	}

	public ModPatientfielddataPK getId() {
		return this.id;
	}

	public void setId(ModPatientfielddataPK id) {
		this.id = id;
	}

	public String getCharvalue() {
		return this.charvalue;
	}

	public void setCharvalue(String charvalue) {
		this.charvalue = charvalue;
	}

	public Date getDatevalue() {
		return this.datevalue;
	}

	public void setDatevalue(Date datevalue) {
		this.datevalue = datevalue;
	}

	public String getHashvalue() {
		return this.hashvalue;
	}

	public void setHashvalue(String hashvalue) {
		this.hashvalue = hashvalue;
	}

	public ModPatient getModPatient() {
		return this.modPatient;
	}

	public void setModPatient(ModPatient modPatient) {
		this.modPatient = modPatient;
	}

	public ModPatientfield getModPatientfield() {
		return this.modPatientfield;
	}

	public void setModPatientfield(ModPatientfield modPatientfield) {
		this.modPatientfield = modPatientfield;
	}

}
