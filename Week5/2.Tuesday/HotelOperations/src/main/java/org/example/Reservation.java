package org.example;

public class Reservation {
    private RoomType roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(RoomType roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    //derived getter
    /*
    The room type can be either "king" or "double". If the room type is
    "king" the price per night is $139.00
    if the room type is "double" the price per night is $124.00
     */
    public double getPrice(){
        if(this.roomType == RoomType.KING){
            return 139;
        }
        else{
            return 124;
        }
    }

    public int getNumberOfNights(){
        return this.numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights){
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend(){
        return this.isWeekend;
    }

    public void setIsWeekend(boolean isWeekend){
        this.isWeekend = isWeekend;
    }
}
