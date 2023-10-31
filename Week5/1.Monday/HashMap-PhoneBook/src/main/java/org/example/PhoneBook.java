package org.example;

import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, String> contacts;

    public PhoneBook(){
        contacts = new HashMap<>();
    }

    public void addContactToPhoneBook(String name, String phoneNumber){
        this.contacts.put(name, phoneNumber);
    }

    public String lookUpNumber(String name){
        return this.contacts.get(name);
    }

    public void removeContact(String name){
        this.contacts.remove(name);
    }
}
