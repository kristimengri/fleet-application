package com.kent.fleetapp.repository;

import com.kent.fleetapp.entity.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleStatusRepository extends JpaRepository<VehicleStatus,Integer> {
}
