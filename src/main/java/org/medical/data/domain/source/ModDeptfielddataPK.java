package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Embeddable
public class ModDeptfielddataPK extends ModDeptfielddataPKGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModDeptfielddataPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModDeptfielddataPK(int deptid, int fieldid) {
		super(deptid, fieldid);
		// TODO Auto-generated constructor stub
	}


}