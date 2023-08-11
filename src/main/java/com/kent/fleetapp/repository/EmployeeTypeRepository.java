package com.kent.fleetapp.repository;

import com.kent.fleetapp.entity.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeTypeRepository extends JpaRepository<EmployeeType,Integer> {
}
