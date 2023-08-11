package com.kent.fleetapp.repository;

import com.kent.fleetapp.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State,Integer> {
}
