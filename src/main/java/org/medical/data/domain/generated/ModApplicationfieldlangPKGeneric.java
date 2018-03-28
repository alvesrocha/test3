/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
public class ModApplicationfieldlangPKGeneric implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Basic(optional = false)
	@Column(name = "fieldid")
	private int fieldid;
	@Basic(optional = false)
	@Column(name = "langused")
	private String langused;

	public ModApplicationfieldlangPKGeneric() {
	}

	public ModApplicationfieldlangPKGeneric(int fieldid, String langused) {
		this.fieldid = fieldid;
		this.langused = langused;
	}

	public int getFieldid() {
		return fieldid;
	}

	public void setFieldid(int fieldid) {
		this.fieldid = fieldid;
	}

	public String getLangused() {
		return langused;
	}

	public void setLangused(String langused) {
		this.langused = langused;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (int) fieldid;
		hash += (langused != null ? langused.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof ModApplicationfieldlangPKGeneric)) {
			return false;
		}
		ModApplicationfieldlangPKGeneric other = (ModApplicationfieldlangPKGeneric) object;
		if (this.fieldid != other.fieldid) {
			return false;
		}
		if ((this.langused == null && other.langused != null)
				|| (this.langused != null && !this.langused.equals(other.langused))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "test.ModApplicationfieldlangPK[ fieldid=" + fieldid + ", langused=" + langused + " ]";
	}

}
