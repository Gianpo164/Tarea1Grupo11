package org.example;

public class PagoIncorrectoException extends Exception{

    public PagoIncorrectoException(String errorMessage){
        super(errorMessage);
    }
}
