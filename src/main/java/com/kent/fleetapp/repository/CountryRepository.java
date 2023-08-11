package com.kent.fleetapp.repository;

import com.kent.fleetapp.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country,Integer> {
}
