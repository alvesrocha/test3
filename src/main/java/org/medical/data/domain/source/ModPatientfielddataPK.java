package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Embeddable
public class ModPatientfielddataPK extends ModPatientfielddataPKGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModPatientfielddataPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModPatientfielddataPK(int patientid, int fieldid) {
		super(patientid, fieldid);
		// TODO Auto-generated constructor stub
	}

}