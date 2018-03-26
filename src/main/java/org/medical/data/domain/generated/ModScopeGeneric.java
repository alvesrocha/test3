package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_scope database table.
 * 
 */
@MappedSuperclass
public class ModScopeGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false, length=1)
	private String scopecode;

	@Column(nullable=false)
	private int scopelevel;

	public ModScopeGeneric() {
	}

	public String getScopecode() {
		return this.scopecode;
	}

	public void setScopecode(String scopecode) {
		this.scopecode = scopecode;
	}

	public int getScopelevel() {
		return this.scopelevel;
	}

	public void setScopelevel(int scopelevel) {
		this.scopelevel = scopelevel;
	}

}
