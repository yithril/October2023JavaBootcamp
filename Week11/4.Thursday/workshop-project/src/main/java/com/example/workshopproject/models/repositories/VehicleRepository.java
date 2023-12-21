package com.example.workshopproject.models.repositories;

import com.example.workshopproject.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
