package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_deptfielddata database table.
 * 
 */
@MappedSuperclass
public class ModDeptfielddataGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModDeptfielddataPK id;

	@Column(length=255)
	private String charvalue;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datevalue;

	//bi-directional one-to-one association to ModDeptfield
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="deptid", referencedColumnName="deptid", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="fieldid", referencedColumnName="fieldid", nullable=false, insertable=false, updatable=false)
		})
	private ModDeptfield modDeptfield;

	public ModDeptfielddataGeneric() {
	}

	public ModDeptfielddataPK getId() {
		return this.id;
	}

	public void setId(ModDeptfielddataPK id) {
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

	public ModDeptfield getModDeptfield() {
		return this.modDeptfield;
	}

	public void setModDeptfield(ModDeptfield modDeptfield) {
		this.modDeptfield = modDeptfield;
	}

}
