package org.medical.data.repository;

import org.medical.data.domain.source.ModUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<ModUser, Long> {

	public ModUser findByUserloginid(String username);
}
