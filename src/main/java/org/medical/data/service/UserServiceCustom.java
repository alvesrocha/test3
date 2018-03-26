package org.medical.data.service;

import java.util.HashSet;
import java.util.Set;

import org.medical.data.domain.source.ModProfilefunction;
import org.medical.data.domain.source.ModStaff;
import org.medical.data.domain.source.ModUser;
import org.medical.data.domain.source.ModUserprofile;
import org.medical.data.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserServiceCustom implements UserDetailsService {

	private final UserRepository userRepository;

	public UserServiceCustom(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		ModUser user = userRepository.findByUserloginid(username);
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		if (user != null) {
			org.springframework.security.core.userdetails.User userDetails = new org.springframework.security.core.userdetails.User(
					username, user.getPw(), true, user.isExpired(), false, !user.isLocked(), authorities);
			if (!user.isLocked() && user.withProfiles()) {
				for (ModStaff staff : user.getModStaffs()) {
					if (staff.isActivated()) {
						for (ModUserprofile userProfile : staff.getModUserprofiles()) {
							if (userProfile.isValid() && userProfile.isEnabled()) {
								for (ModProfilefunction profileFunction : userProfile.getModProfile()
										.getModProfilefunctions()) {
									authorities.add(new SimpleGrantedAuthority("dept_" + staff.getModDept().getDeptid()
											+ "_" + profileFunction.getModFunction().getInternalfunctionname()));
								}
							}
						}
					}
				}
			}
			return userDetails;
		}
		return new org.springframework.security.core.userdetails.User(username, user.getPw(), authorities);
	}

}
