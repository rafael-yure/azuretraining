package com.mastercard.azuretraining.exception;

public class HeroNotFoundException extends RuntimeException {

    public HeroNotFoundException(String message) {
        super(message);
    }

}
