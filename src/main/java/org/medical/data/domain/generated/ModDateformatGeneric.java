package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_dateformat database table.
 * 
 */
@MappedSuperclass
public class ModDateformatGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int dateformatid;

	@Column(nullable=false, length=255)
	private String dateformat;

	//bi-directional many-to-one association to ModCountry
	@OneToMany(mappedBy="modDateformat")
	private List<ModCountry> modCountries;

	public ModDateformatGeneric() {
	}

	public int getDateformatid() {
		return this.dateformatid;
	}

	public void setDateformatid(int dateformatid) {
		this.dateformatid = dateformatid;
	}

	public String getDateformat() {
		return this.dateformat;
	}

	public void setDateformat(String dateformat) {
		this.dateformat = dateformat;
	}

	public List<ModCountry> getModCountries() {
		return this.modCountries;
	}

	public void setModCountries(List<ModCountry> modCountries) {
		this.modCountries = modCountries;
	}

}
