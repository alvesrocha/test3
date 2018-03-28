package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Embeddable
public class ModStafffielddataPK extends ModStafffielddataPKGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6754052985085565516L;

	public ModStafffielddataPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModStafffielddataPK(int staffid, int fieldid) {
		super(staffid, fieldid);
		// TODO Auto-generated constructor stub
	}

}