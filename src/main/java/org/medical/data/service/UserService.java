package org.medical.data.service;

import java.util.List;
import java.util.stream.Collectors;

import org.medical.data.domain.dto.UserDTO;
import org.medical.data.domain.source.ModUser;
import org.medical.data.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
    private ModelMapper modelMapper;
	
	@PreAuthorize("hasRole('saveuser')")
	public ModUser save(ModUser user) {
		//logic here
		return userRepository.save(user);
	}

	//@PreAuthorize("hasRole('listusers')")
	public List<UserDTO> findAll() {
		List<ModUser> users = userRepository.findAll();
		return users.stream().map(u -> modelMapper.map(u, UserDTO.class)).collect(Collectors.toList());
		//List<UserDTO> usersList = users.stream().map(mapper)
	}

	@PreAuthorize("hasRole('deleteuser')")
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
}
