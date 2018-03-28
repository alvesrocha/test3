package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;

import java.util.Date;

import javax.persistence.*;


@Entity
public class ModUser extends ModUserGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public boolean isLocked() {
		return "y".equals(getLocked());
	}
	
	
	public boolean withProfiles() {
		for(ModStaff staff : getModStaffList()) {
			if(staff.isActivated()) {
				for(ModUserprofile userProfile : staff.getModUserprofileList()) {
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