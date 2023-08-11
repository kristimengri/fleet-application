package com.kent.fleetapp.repository;

import com.kent.fleetapp.entity.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus,Integer> {
}
