package com.example.demo.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class VoitureException extends Exception{

    public VoitureException(){
        super("Pas de voiture");
    }
}
