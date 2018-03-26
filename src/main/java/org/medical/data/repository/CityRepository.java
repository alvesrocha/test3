package org.medical.data.repository;

import java.util.List;

import org.medical.data.domain.source.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {

	public List<City> findByCountryId(String countryId);
}
