package org.example;

public class PagoInsuficienteException extends Exception{

    public PagoInsuficienteException(String errorMessage){
        super(errorMessage);
    }
}
