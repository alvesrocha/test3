package org.medical.data.service;

import org.medical.data.domain.source.ModUser;
import org.medical.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public ModUser saveUser(ModUser user) {
		//logic here
		return userRepository.save(user);
	}
	
}
