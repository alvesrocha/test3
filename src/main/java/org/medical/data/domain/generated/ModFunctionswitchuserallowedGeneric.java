package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_functionswitchuserallowed database table.
 * 
 */
@MappedSuperclass
public class ModFunctionswitchuserallowedGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int functionswitchuserallowedid;

	@Column(nullable=false, length=1)
	private String keepfunction;

	//bi-directional many-to-one association to ModFunction
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FUNCTIONID", nullable=false)
	private ModFunction modFunction1;

	//bi-directional many-to-one association to ModFunction
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ALTERNATIVEFUNCTIONID", nullable=false)
	private ModFunction modFunction2;

	public ModFunctionswitchuserallowedGeneric() {
	}

	public int getFunctionswitchuserallowedid() {
		return this.functionswitchuserallowedid;
	}

	public void setFunctionswitchuserallowedid(int functionswitchuserallowedid) {
		this.functionswitchuserallowedid = functionswitchuserallowedid;
	}

	public String getKeepfunction() {
		return this.keepfunction;
	}

	public void setKeepfunction(String keepfunction) {
		this.keepfunction = keepfunction;
	}

	public ModFunction getModFunction1() {
		return this.modFunction1;
	}

	public void setModFunction1(ModFunction modFunction1) {
		this.modFunction1 = modFunction1;
	}

	public ModFunction getModFunction2() {
		return this.modFunction2;
	}

	public void setModFunction2(ModFunction modFunction2) {
		this.modFunction2 = modFunction2;
	}

}
