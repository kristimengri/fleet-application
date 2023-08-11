package com.kent.fleetapp.repository;

import com.kent.fleetapp.entity.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTypeRepository extends JpaRepository<VehicleType,Integer> {
}
