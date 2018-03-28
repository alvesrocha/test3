package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Embeddable
public class ModClinicfielddataPK extends ModClinicfielddataPKGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModClinicfielddataPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModClinicfielddataPK(int clinicid, int fieldid) {
		super(clinicid, fieldid);
		// TODO Auto-generated constructor stub
	}


}