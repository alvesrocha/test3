package org.medical.data.domain.source;

import javax.persistence.Entity;

import org.medical.data.domain.generated.ModStaffGeneric;


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