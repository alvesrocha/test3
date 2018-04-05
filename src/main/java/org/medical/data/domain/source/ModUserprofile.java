package org.medical.data.domain.source;

import javax.persistence.Entity;

import org.medical.data.domain.generated.ModUserprofileGeneric;


@Entity
public class ModUserprofile extends ModUserprofileGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean isEnabled() {
		return "y".equals(getEnabled());
	}
	
	public boolean isValid() {
		return "y".equals(getValid());
	}
}