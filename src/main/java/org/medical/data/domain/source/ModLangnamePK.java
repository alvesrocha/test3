package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Embeddable
public class ModLangnamePK extends ModLangnamePKGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModLangnamePK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModLangnamePK(String langid, String langused) {
		super(langid, langused);
		// TODO Auto-generated constructor stub
	}

}