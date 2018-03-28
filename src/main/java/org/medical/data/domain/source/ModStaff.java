package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Entity
public class ModStaff extends ModStaffGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public boolean isActivated() {
		return "y".equals(getActivated());
	}

}