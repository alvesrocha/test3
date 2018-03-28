package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Embeddable
public class ModUserprofilePK extends ModUserprofilePKGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3662609233568331736L;

	public ModUserprofilePK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModUserprofilePK(int profileid, int staffid) {
		super(profileid, staffid);
		// TODO Auto-generated constructor stub
	}

}