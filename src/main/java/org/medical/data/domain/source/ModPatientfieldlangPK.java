package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Embeddable
public class ModPatientfieldlangPK extends ModPatientfieldlangPKGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModPatientfieldlangPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModPatientfieldlangPK(int fieldid, String langused) {
		super(fieldid, langused);
		// TODO Auto-generated constructor stub
	}

}