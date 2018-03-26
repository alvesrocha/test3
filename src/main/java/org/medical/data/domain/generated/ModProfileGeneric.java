package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_profile database table.
 * 
 */
@MappedSuperclass
public class ModProfileGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int profileid;

	@Column(length=1)
	private String hidden;

	@Column(length=1)
	private String permanent;

	private int profilelevel;

	//bi-directional many-to-one association to ModProfilefunction
	@OneToMany(mappedBy="modProfile")
	private List<ModProfilefunction> modProfilefunctions;

	//bi-directional many-to-one association to ModUserprofile
	@OneToMany(mappedBy="modProfile")
	private List<ModUserprofile> modUserprofiles;

	public ModProfileGeneric() {
	}

	public int getProfileid() {
		return this.profileid;
	}

	public void setProfileid(int profileid) {
		this.profileid = profileid;
	}

	public String getHidden() {
		return this.hidden;
	}

	public void setHidden(String hidden) {
		this.hidden = hidden;
	}

	public String getPermanent() {
		return this.permanent;
	}

	public void setPermanent(String permanent) {
		this.permanent = permanent;
	}

	public int getProfilelevel() {
		return this.profilelevel;
	}

	public void setProfilelevel(int profilelevel) {
		this.profilelevel = profilelevel;
	}

	public List<ModProfilefunction> getModProfilefunctions() {
		return this.modProfilefunctions;
	}

	public void setModProfilefunctions(List<ModProfilefunction> modProfilefunctions) {
		this.modProfilefunctions = modProfilefunctions;
	}


	public List<ModUserprofile> getModUserprofiles() {
		return this.modUserprofiles;
	}

	public void setModUserprofiles(List<ModUserprofile> modUserprofiles) {
		this.modUserprofiles = modUserprofiles;
	}
}
