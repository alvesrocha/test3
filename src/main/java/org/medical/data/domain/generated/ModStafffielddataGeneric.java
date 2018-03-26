package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_stafffielddata database table.
 * 
 */
@MappedSuperclass
public class ModStafffielddataGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModStafffielddataPK id;

	@Column(length=255)
	private String charvalue;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datevalue;

	//bi-directional many-to-one association to ModStaff
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="staffid", nullable=false, insertable=false, updatable=false)
	private ModStaff modStaff;

	//bi-directional many-to-one association to ModStafffield
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fieldid", nullable=false, insertable=false, updatable=false)
	private ModStafffield modStafffield;

	public ModStafffielddataGeneric() {
	}

	public ModStafffielddataPK getId() {
		return this.id;
	}

	public void setId(ModStafffielddataPK id) {
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

	public ModStaff getModStaff() {
		return this.modStaff;
	}

	public void setModStaff(ModStaff modStaff) {
		this.modStaff = modStaff;
	}

	public ModStafffield getModStafffield() {
		return this.modStafffield;
	}

	public void setModStafffield(ModStafffield modStafffield) {
		this.modStafffield = modStafffield;
	}

}
