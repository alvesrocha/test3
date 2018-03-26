package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_clinicfielddata database table.
 * 
 */
@MappedSuperclass
public class ModClinicfielddataGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModClinicfielddataPK id;

	@Column(length=255)
	private String charvalue;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datevalue;

	//bi-directional one-to-one association to ModClinicfield
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="clinicid", referencedColumnName="clinicid", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="fieldid", referencedColumnName="fieldid", nullable=false, insertable=false, updatable=false)
		})
	private ModClinicfield modClinicfield;

	public ModClinicfielddataGeneric() {
	}

	public ModClinicfielddataPK getId() {
		return this.id;
	}

	public void setId(ModClinicfielddataPK id) {
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

	public ModClinicfield getModClinicfield() {
		return this.modClinicfield;
	}

	public void setModClinicfield(ModClinicfield modClinicfield) {
		this.modClinicfield = modClinicfield;
	}

}
