package com.kent.fleetapp.repository;

import com.kent.fleetapp.entity.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleRepository extends JpaRepository<JobTitle,Integer> {
}
