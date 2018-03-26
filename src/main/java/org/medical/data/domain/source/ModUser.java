package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="mod_user")
public class ModUser extends ModUserGeneric {


	public boolean isLocked() {
		return "y".equals(getLocked());
	}
	
	
	public boolean withProfiles() {
		for(ModStaff staff : getModStaffs()) {
			if(staff.isActivated()) {
				for(ModUserprofile userProfile : staff.getModUserprofiles()) {
					if(userProfile.isValid() && userProfile.isEnabled()) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean isExpired() {
		return getExpiration() != null && !getExpiration().after(new Date());
		
	}
}