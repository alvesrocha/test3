package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Embeddable
public class ModDeptfieldsPK extends ModDeptfieldsPKGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModDeptfieldsPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModDeptfieldsPK(int deptid, int fieldid) {
		super(deptid, fieldid);
		// TODO Auto-generated constructor stub
	}

}