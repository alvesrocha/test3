package org.medical.data.config;

import org.springframework.security.authentication.encoding.ShaPasswordEncoder;

public class ShaPasswordEncoderCustom extends ShaPasswordEncoder{

	public ShaPasswordEncoderCustom(int strength) {
		super(strength);
		setEncodeHashAsBase64(true);
	}

	@Override
	protected String mergePasswordAndSalt(String password, Object salt, boolean strict) {
		if (password == null) {
			password = "";
		}

		if ((salt == null) || "".equals(salt)) {
			return password;
		}
		else {
			return salt + password;
		}
	}
	
	@Override
	public String encodePassword(String rawPass, Object salt) {
		String encodedPassword = super.encodePassword(rawPass, salt);
		if(encodedPassword.length() > 1) {
			return encodedPassword.substring(0, encodedPassword.length() - 1);
		}
		return encodedPassword;
	}
}
