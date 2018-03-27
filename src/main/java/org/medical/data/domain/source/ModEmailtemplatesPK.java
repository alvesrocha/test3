package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Embeddable
public class ModEmailtemplatesPK extends ModEmailtemplatesPKGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModEmailtemplatesPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModEmailtemplatesPK(String templatename, String langid) {
		super(templatename, langid);
		// TODO Auto-generated constructor stub
	}


}