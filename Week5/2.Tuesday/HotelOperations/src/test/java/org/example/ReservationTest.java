package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {
    @Test
    public void getPrice_KingSize_IsCorrect(){
        //Arrange
        Reservation reservation = new Reservation(RoomType.KING, 1, true);

        //Act
        double testPrice = reservation.getPrice();

        //Assert
        assertEquals(139, testPrice);
    }

    @Test
    public void getPrice_DoubleSize_IsCorrect(){
        Reservation reservation = new Reservation(RoomType.DOUBLE, 2, false);

        double testPrice = reservation.getPrice();

        assertEquals(124, testPrice);
    }
}