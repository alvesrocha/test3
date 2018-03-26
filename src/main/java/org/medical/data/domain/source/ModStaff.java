package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Entity
@Table(name="mod_staff")
public class ModStaff extends ModStaffGeneric {

	public boolean isActivated() {
		return "y".equals(getActivated());
	}

}