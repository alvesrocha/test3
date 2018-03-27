package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Embeddable
public class ModClinicfieldsPK extends ModClinicfieldsPKGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModClinicfieldsPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModClinicfieldsPK(int clinicid, int fieldid) {
		super(clinicid, fieldid);
		// TODO Auto-generated constructor stub
	}

}