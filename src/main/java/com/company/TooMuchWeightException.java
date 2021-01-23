package com.company;

public class TooMuchWeightException extends Exception {
    public TooMuchWeightException(){
        super("Your pizza weights too much! Dont eat so much, you would be fat and ugly!");
    }
}
