package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_hashfields database table.
 * 
 */
@MappedSuperclass
public class ModHashfieldGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int hashid;

	@Column(nullable=false, length=1)
	private String activated;

	private int clinicid;

	private int deptid;

	@Column(length=255)
	private String hashadditionalfieldids;

	@Column(nullable=false, length=255)
	private String hashcolumnname;

	@Column(nullable=false, length=255)
	private String hashmandatoryfieldids;

	@Column(nullable=false, length=1)
	private String hashtablefields;

	@Column(nullable=false, length=255)
	private String hashtablename;

	@Column(nullable=false, length=255)
	private String hashtableprimarykeyname;

	@Column(nullable=false, length=1)
	private String recreate;

	@Column(nullable=false, length=1)
	private String usesalt;

	public ModHashfieldGeneric() {
	}

	public int getHashid() {
		return this.hashid;
	}

	public void setHashid(int hashid) {
		this.hashid = hashid;
	}

	public String getActivated() {
		return this.activated;
	}

	public void setActivated(String activated) {
		this.activated = activated;
	}

	public int getClinicid() {
		return this.clinicid;
	}

	public void setClinicid(int clinicid) {
		this.clinicid = clinicid;
	}

	public int getDeptid() {
		return this.deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getHashadditionalfieldids() {
		return this.hashadditionalfieldids;
	}

	public void setHashadditionalfieldids(String hashadditionalfieldids) {
		this.hashadditionalfieldids = hashadditionalfieldids;
	}

	public String getHashcolumnname() {
		return this.hashcolumnname;
	}

	public void setHashcolumnname(String hashcolumnname) {
		this.hashcolumnname = hashcolumnname;
	}

	public String getHashmandatoryfieldids() {
		return this.hashmandatoryfieldids;
	}

	public void setHashmandatoryfieldids(String hashmandatoryfieldids) {
		this.hashmandatoryfieldids = hashmandatoryfieldids;
	}

	public String getHashtablefields() {
		return this.hashtablefields;
	}

	public void setHashtablefields(String hashtablefields) {
		this.hashtablefields = hashtablefields;
	}

	public String getHashtablename() {
		return this.hashtablename;
	}

	public void setHashtablename(String hashtablename) {
		this.hashtablename = hashtablename;
	}

	public String getHashtableprimarykeyname() {
		return this.hashtableprimarykeyname;
	}

	public void setHashtableprimarykeyname(String hashtableprimarykeyname) {
		this.hashtableprimarykeyname = hashtableprimarykeyname;
	}

	public String getRecreate() {
		return this.recreate;
	}

	public void setRecreate(String recreate) {
		this.recreate = recreate;
	}

	public String getUsesalt() {
		return this.usesalt;
	}

	public void setUsesalt(String usesalt) {
		this.usesalt = usesalt;
	}

}
