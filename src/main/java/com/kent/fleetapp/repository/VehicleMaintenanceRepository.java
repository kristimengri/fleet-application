package com.kent.fleetapp.repository;

import com.kent.fleetapp.entity.VehicleMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance, Integer> {
}
