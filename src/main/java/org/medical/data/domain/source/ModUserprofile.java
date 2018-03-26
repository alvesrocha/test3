package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Entity
@Table(name="mod_userprofile")
public class ModUserprofile extends ModUserprofileGeneric {

	public boolean isEnabled() {
		return "y".equals(getEnabled());
	}
	
	public boolean isValid() {
		return "y".equals(getValid());
	}
}