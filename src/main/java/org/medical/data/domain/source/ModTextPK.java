package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Embeddable
public class ModTextPK extends ModTextPKGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModTextPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModTextPK(String bundlename, String textkey, String langused) {
		super(bundlename, textkey, langused);
		// TODO Auto-generated constructor stub
	}

}