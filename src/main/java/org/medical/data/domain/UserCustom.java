package org.medical.data.domain;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class UserCustom extends User{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String salt;

	public UserCustom(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}

	public UserCustom(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
	
}
