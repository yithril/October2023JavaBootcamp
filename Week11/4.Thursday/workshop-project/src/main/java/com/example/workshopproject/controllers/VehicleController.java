package com.example.workshopproject.controllers;

import com.example.workshopproject.models.Vehicle;
import com.example.workshopproject.models.VehicleSearchCriteria;
import com.example.workshopproject.models.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {
    private final VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }
    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles(@ModelAttribute VehicleSearchCriteria searchCriteria){
        return new ResponseEntity<>(null);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteVehicle(@PathVariable int id){
        this.vehicleService.deleteVehicle(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
