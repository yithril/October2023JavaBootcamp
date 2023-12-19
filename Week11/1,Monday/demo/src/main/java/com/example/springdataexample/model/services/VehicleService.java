package com.example.springdataexample.model.services;

import com.example.springdataexample.model.Vehicle;
import com.example.springdataexample.model.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class VehicleService {
    private final VehicleRepository vehicleRepository;

    //Dependency Injection
    @Autowired
    public VehicleService(VehicleRepository vehicleRepository){
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> getAllVehicles(){
        return this.vehicleRepository.findAll();
    }

    public List<Vehicle> getVehiclesByPrice(BigDecimal min, BigDecimal max){
        return this.vehicleRepository.findByPriceBetween(min, max);
    }
}
