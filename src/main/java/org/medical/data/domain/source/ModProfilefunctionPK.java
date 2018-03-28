package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Embeddable
public class ModProfilefunctionPK extends ModProfilefunctionPKGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModProfilefunctionPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModProfilefunctionPK(int profileid, int functionid) {
		super(profileid, functionid);
		// TODO Auto-generated constructor stub
	}

}