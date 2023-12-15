package com.dealership.demo.models.repositories;

import com.dealership.demo.models.config.DatabaseConfig;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
@TestPropertySource(locations = "classpath:application-test.properties")
class VehicleRepositoryTest {
    private VehicleRepository vehicleRepository;
    private DataSource dataSource;

    @BeforeEach
    public void setUp() {
        // Create a Spring context and get the DataSource bean
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(DatabaseConfig.class);
        context.refresh();
        dataSource = context.getBean(DataSource.class);

        vehicleRepository = new VehicleRepository(dataSource);
    }

    @Test
    public void getAllVehicles_Succeeds(){
        var vehicles = this.vehicleRepository.getAllVehicles();

        assertEquals(25, vehicles.size());
    }
}