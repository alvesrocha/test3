package org.medical.data.repository;

import org.medical.data.domain.source.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String username);
}
