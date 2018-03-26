package org.medical.data.repository;

import org.medical.data.domain.source.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
