package com.company;

public class InvalidNameEcxeption extends RuntimeException{
    public InvalidNameEcxeption(){

    }

    public InvalidNameEcxeption(String message) {
        super(message);
    }
}
