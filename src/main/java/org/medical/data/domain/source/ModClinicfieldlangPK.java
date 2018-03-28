package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Embeddable
public class ModClinicfieldlangPK extends ModClinicfieldlangPKGeneric {

	public ModClinicfieldlangPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModClinicfieldlangPK(int clinicid, int fieldid, String langused) {
		super(clinicid, fieldid, langused);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7973484779549396329L;


}