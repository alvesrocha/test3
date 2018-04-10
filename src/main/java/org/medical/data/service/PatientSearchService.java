package org.medical.data.service;

import java.util.List;
import java.util.stream.Collectors;

import org.medical.data.domain.dto.PatientDTO;
import org.medical.data.domain.dto.PatientSearchDTO;
import org.medical.data.domain.dto.UserDTO;
import org.medical.data.domain.source.ModUser;
import org.medical.data.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class PatientSearchService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
    private ModelMapper modelMapper;
	
	public List<PatientDTO> search(PatientSearchDTO patientSearch) {
		
		return null;
	}
	
}
