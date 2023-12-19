package com.example.springdataexample.model.repositories;

import com.example.springdataexample.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);
}
