package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    @Test
    public void getHouseValue(){
        //Arrange
        //Given a house that 1000 sq ft and has a lot size of 1000 with a quality of 1
        //expectation is 180,250
        House house = new House("Vacation home", "10/21/22", 250000, "1818 Wherever",
                                1, 1000, 1000);

        //Act
        double expectedValue = 1000 * 180 + (.25 * 1000);
        var houseValue = house.getValue();

        //Assert
        assertEquals(expectedValue, houseValue);
    }

}