package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Embeddable
public class ModModulelangPK extends ModModulelangPKGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModModulelangPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModModulelangPK(int moduleid, String langused) {
		super(moduleid, langused);
		// TODO Auto-generated constructor stub
	}

}