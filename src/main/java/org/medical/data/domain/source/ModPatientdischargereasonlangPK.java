package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Embeddable
public class ModPatientdischargereasonlangPK extends ModPatientdischargereasonlangPKGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModPatientdischargereasonlangPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModPatientdischargereasonlangPK(int patientdischargereasonid, String langused) {
		super(patientdischargereasonid, langused);
		// TODO Auto-generated constructor stub
	}

}