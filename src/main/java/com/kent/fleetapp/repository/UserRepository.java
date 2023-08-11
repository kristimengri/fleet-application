package com.kent.fleetapp.repository;

import com.kent.fleetapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
