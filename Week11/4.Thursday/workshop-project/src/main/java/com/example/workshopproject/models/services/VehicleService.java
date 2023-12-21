package com.example.workshopproject.models.services;

import com.example.workshopproject.exceptions.EntityNotFoundException;
import com.example.workshopproject.models.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//the different search methods
//and the crud functions
@Service
public class VehicleService {
    //inject the repository into the service
    private final VehicleRepository vehicleRepository;

    @Autowired
    public VehicleService(VehicleRepository vehicleRepository){
        this.vehicleRepository = vehicleRepository;
    }

    //delete a vehicle
    public void deleteVehicle(int vehicleId){
        //or else throw means if it doens't find the vehicle
        //it will throw this exception
        var vehicle = this.vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new EntityNotFoundException("Vehicle not found"));
    }
}
