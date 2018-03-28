package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Embeddable
public class ModApplicationfielddataPK extends ModApplicationfielddataPKGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModApplicationfielddataPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModApplicationfielddataPK(int userid, int fieldid) {
		super(userid, fieldid);
		// TODO Auto-generated constructor stub
	}


}