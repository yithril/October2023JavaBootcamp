package com.example.springdataexample.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "vehicles")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int year;

    @Column(nullable = false, length = 25)
    private String make;

    @Column(nullable = false, length = 25)
    private String model;

    @Column(nullable = true)
    private String color;

    @Column(nullable = false, name = "vehicle_type")
    private String vehicleType;

    @Column(nullable = false)
    private int odometer;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(name = "sold")
    private boolean isSold;
}
