package org.example;

public class NoHayProductoException extends Exception{

    private Moneda moneda;

    public NoHayProductoException(String errorMessage, Moneda m){
        super(errorMessage);
        moneda = m;
    }
    public Moneda DevuelveMoneda(){
        return moneda;
    }
}