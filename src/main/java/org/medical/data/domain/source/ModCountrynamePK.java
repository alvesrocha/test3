package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;

@Embeddable
public class ModCountrynamePK extends ModCountrynamePKGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModCountrynamePK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModCountrynamePK(String countryid, String langused) {
		super(countryid, langused);
		// TODO Auto-generated constructor stub
	}

}