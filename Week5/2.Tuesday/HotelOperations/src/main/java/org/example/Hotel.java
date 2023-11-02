package org.example;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Room> rooms;

    public Hotel(String name, String address, String phoneNumber, ArrayList<Room> rooms){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfAvailableRooms(){
        int counter = 0;
        for(Room room : this.rooms){
            if(room.isAvailable()){
                counter++;
            }
        }
        return counter;
    }
}
