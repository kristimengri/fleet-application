package com.kent.fleetapp.service;

import com.kent.fleetapp.entity.Country;
import com.kent.fleetapp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    // Returns a list of Countries
    public List<Country> getCountries(){
        return countryRepository.findAll();
    }

    // Save a new Country
    public void save(Country country){
         countryRepository.save(country);
    }

    public Optional<Country> findById(int id){
        return countryRepository.findById(id);
    }
}
