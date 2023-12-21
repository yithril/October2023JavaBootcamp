package com.example.workshopproject.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//This is a custom exception.
//What Response Status means it that when this exception is thrown
//The controller should return a 404
//Spring can handle all the wiring, you just need to make an exception
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String message){
        super(message);
    }
}
