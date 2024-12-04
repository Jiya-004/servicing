package com.AJS.vehicleservice.repository;

import com.AJS.vehicleservice.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRepository extends JpaRepository<Service, Long> {
    List<Service> findByVehicleNumber(String vehicleNumber);
    List<Service> findByOwnerId(Long ownerId);
}