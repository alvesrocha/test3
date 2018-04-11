package org.medical.data.service;

import java.util.List;

import org.medical.data.domain.source.ModUser;
import org.medical.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@PreAuthorize("hasRole('saveuser')")
	public ModUser save(ModUser user) {
		//logic here
		return userRepository.save(user);
	}

	//@PreAuthorize("hasRole('listusers')")
	public List<ModUser> findAll() {
		//ModelMapper mapper = new ModelMapper();
		return userRepository.findAll();
		
		//List<UserDTO> usersList = users.stream().map(mapper)
	}
	
	public ModUser findByUserid(long userid) {
		return userRepository.findByUserid(userid);
	}

	@PreAuthorize("hasRole('deleteuser')")
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
}
