package org.medical.data.service;

import java.util.HashSet;
import java.util.Set;

import org.medical.data.domain.UserCustom;
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
import org.springframework.stereotype.Service;

@Service
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
			UserCustom userDetails = new UserCustom(
					username, user.getPw(), true, !user.isExpired(), true, !user.isLocked(), authorities);
			userDetails.setSalt(user.getSalt());
			if (!user.isLocked() && user.withProfiles()) {
				for (ModStaff staff : user.getModStaffList()) {
					if (staff.isActivated()) {
						for (ModUserprofile userProfile : staff.getModUserprofileList()) {
							if (userProfile.isValid() && userProfile.isEnabled()) {
								for (ModProfilefunction profileFunction : userProfile.getModProfile()
										.getModProfilefunctionList()) {
									authorities.add(new SimpleGrantedAuthority("dept_" + staff.getDeptid().getDeptid()
											+ "_" + profileFunction.getModFunction().getInternalfunctionname()));
								}
							}
						}
					}
				}
			}
			return userDetails;
		}
		return new UserCustom(username, "", authorities);
	}

}
