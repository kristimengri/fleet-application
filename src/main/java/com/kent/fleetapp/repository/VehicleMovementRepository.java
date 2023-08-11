package com.kent.fleetapp.repository;

import com.kent.fleetapp.entity.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMovementRepository extends JpaRepository<VehicleMovement,Integer> {
}
