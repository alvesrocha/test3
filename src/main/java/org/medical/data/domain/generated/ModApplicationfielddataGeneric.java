package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_applicationfielddata database table.
 * 
 */
@MappedSuperclass
public class ModApplicationfielddataGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModApplicationfielddataPK id;

	@Column(length=255)
	private String charvalue;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datevalue;

	//bi-directional many-to-one association to ModApplicationfield
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fieldid", nullable=false, insertable=false, updatable=false)
	private ModApplicationfield modApplicationfield;

	//bi-directional many-to-one association to ModUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userid", nullable=false, insertable=false, updatable=false)
	private ModUser modUser;

	public ModApplicationfielddataGeneric() {
	}

	public ModApplicationfielddataPK getId() {
		return this.id;
	}

	public void setId(ModApplicationfielddataPK id) {
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

	public ModApplicationfield getModApplicationfield() {
		return this.modApplicationfield;
	}

	public void setModApplicationfield(ModApplicationfield modApplicationfield) {
		this.modApplicationfield = modApplicationfield;
	}

	public ModUser getModUser() {
		return this.modUser;
	}

	public void setModUser(ModUser modUser) {
		this.modUser = modUser;
	}

}
