package com.kent.fleetapp.repository;

import com.kent.fleetapp.entity.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleModelRepository extends JpaRepository<VehicleModel,Integer> {
}
