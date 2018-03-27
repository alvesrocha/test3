/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_automaticloginparam")
public class ModAutomaticloginparamGeneric implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "loginparamid")
	private Integer loginparamid;
	@Basic(optional = false)
	@Column(name = "automaticloginid")
	private String automaticloginid;
	@Basic(optional = false)
	@Column(name = "paramkey")
	private String paramkey;
	@Column(name = "paramvalue")
	private String paramvalue;

	public ModAutomaticloginparamGeneric() {
	}

	public ModAutomaticloginparamGeneric(Integer loginparamid) {
		this.loginparamid = loginparamid;
	}

	public ModAutomaticloginparamGeneric(Integer loginparamid, String automaticloginid, String paramkey) {
		this.loginparamid = loginparamid;
		this.automaticloginid = automaticloginid;
		this.paramkey = paramkey;
	}

	public Integer getLoginparamid() {
		return loginparamid;
	}

	public void setLoginparamid(Integer loginparamid) {
		this.loginparamid = loginparamid;
	}

	public String getAutomaticloginid() {
		return automaticloginid;
	}

	public void setAutomaticloginid(String automaticloginid) {
		this.automaticloginid = automaticloginid;
	}

	public String getParamkey() {
		return paramkey;
	}

	public void setParamkey(String paramkey) {
		this.paramkey = paramkey;
	}

	public String getParamvalue() {
		return paramvalue;
	}

	public void setParamvalue(String paramvalue) {
		this.paramvalue = paramvalue;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (loginparamid != null ? loginparamid.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof ModAutomaticloginparamGeneric)) {
			return false;
		}
		ModAutomaticloginparamGeneric other = (ModAutomaticloginparamGeneric) object;
		if ((this.loginparamid == null && other.loginparamid != null)
				|| (this.loginparamid != null && !this.loginparamid.equals(other.loginparamid))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "test.ModAutomaticloginparam[ loginparamid=" + loginparamid + " ]";
	}

}
