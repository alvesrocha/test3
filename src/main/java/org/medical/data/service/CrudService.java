package org.medical.data.service;

import java.util.List;

import org.medical.data.domain.source.City;
import org.medical.data.domain.source.Country;
import org.medical.data.repository.CityRepository;
import org.medical.data.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrudService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	public List<Country> getAllCountries() {
		return countryRepository.findAll();
	}

	public List<City> getCitiesByCountryId(String countryId) {
		return cityRepository.findByCountryId(countryId);
	}
	
}
