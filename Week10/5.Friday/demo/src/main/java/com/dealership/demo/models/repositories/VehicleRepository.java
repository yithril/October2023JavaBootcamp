package com.dealership.demo.models.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;


@Repository
public class VehicleRepository {
    //Dependency
    //Without this, we can't connect to the database
    private final DataSource dataSource;

    //Autowired says, go and get me a copy of this
    @Autowired
    public VehicleRepository(DataSource dataSource){
        this.dataSource = dataSource;
    }
}
