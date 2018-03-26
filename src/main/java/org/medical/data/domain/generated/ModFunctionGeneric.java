package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_function database table.
 * 
 */
@MappedSuperclass
public class ModFunctionGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int functionid;

	@Column(nullable=false, length=80)
	private String internalfunctionname;

	@Column(nullable=false, length=80)
	private String scope;

	//bi-directional many-to-one association to ModFunctionswitchuserallowed
	@OneToMany(mappedBy="modFunction1")
	private List<ModFunctionswitchuserallowed> modFunctionswitchuseralloweds1;

	//bi-directional many-to-one association to ModFunctionswitchuserallowed
	@OneToMany(mappedBy="modFunction2")
	private List<ModFunctionswitchuserallowed> modFunctionswitchuseralloweds2;

	//bi-directional many-to-one association to ModProfilefunction
	@OneToMany(mappedBy="modFunction")
	private List<ModProfilefunction> modProfilefunctions;

	public ModFunctionGeneric() {
	}

	public int getFunctionid() {
		return this.functionid;
	}

	public void setFunctionid(int functionid) {
		this.functionid = functionid;
	}

	public String getInternalfunctionname() {
		return this.internalfunctionname;
	}

	public void setInternalfunctionname(String internalfunctionname) {
		this.internalfunctionname = internalfunctionname;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public List<ModFunctionswitchuserallowed> getModFunctionswitchuseralloweds1() {
		return this.modFunctionswitchuseralloweds1;
	}

	public void setModFunctionswitchuseralloweds1(List<ModFunctionswitchuserallowed> modFunctionswitchuseralloweds1) {
		this.modFunctionswitchuseralloweds1 = modFunctionswitchuseralloweds1;
	}

	public List<ModFunctionswitchuserallowed> getModFunctionswitchuseralloweds2() {
		return this.modFunctionswitchuseralloweds2;
	}

	public void setModFunctionswitchuseralloweds2(List<ModFunctionswitchuserallowed> modFunctionswitchuseralloweds2) {
		this.modFunctionswitchuseralloweds2 = modFunctionswitchuseralloweds2;
	}

	public List<ModProfilefunction> getModProfilefunctions() {
		return this.modProfilefunctions;
	}

	public void setModProfilefunctions(List<ModProfilefunction> modProfilefunctions) {
		this.modProfilefunctions = modProfilefunctions;
	}

}
