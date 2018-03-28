package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Embeddable
public class ModFieldoptionlangPK extends ModFieldoptionlangPKGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModFieldoptionlangPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModFieldoptionlangPK(int fieldoptionid, String langused) {
		super(fieldoptionid, langused);
		// TODO Auto-generated constructor stub
	}

}