package org.medical.data.repository;

import java.util.List;

import org.medical.data.domain.source.ModUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Modpatient, Long> {

	public ModUser findByUserloginid(String username);
	
	public List<ModUser> findAll();
	
	public ModUser findByUserid(Long userId);
}
