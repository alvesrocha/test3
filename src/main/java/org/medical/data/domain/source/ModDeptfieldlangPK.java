package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Embeddable
public class ModDeptfieldlangPK extends ModDeptfieldlangPKGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5688675785170623835L;

	public ModDeptfieldlangPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModDeptfieldlangPK(int deptid, int fieldid, String langused) {
		super(deptid, fieldid, langused);
		// TODO Auto-generated constructor stub
	}


}