package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


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