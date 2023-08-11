package com.kent.fleetapp.repository;

import com.kent.fleetapp.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Integer> {
}
