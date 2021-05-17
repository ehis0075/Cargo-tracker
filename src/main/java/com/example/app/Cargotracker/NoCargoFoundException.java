package com.example.app.Cargotracker;


public class NoCargoFoundException extends Throwable {

    public NoCargoFoundException(String s) {
        super(s);
    }

    public NoCargoFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoCargoFoundException(Throwable cause) {
        super(cause);
    }


}

