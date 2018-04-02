package org.medical.data.service;

import java.util.List;

import org.medical.data.domain.source.ModUser;
import org.medical.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public ModUser save(ModUser user) {
		//logic here
		return userRepository.save(user);
	}

	public List<ModUser> findAll() {
		return null;
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
}
