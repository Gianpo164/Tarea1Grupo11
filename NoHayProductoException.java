package org.example;

public class NoHayProductoException extends Exception{

    private Moneda moneda;

    public NoHayProductoException(String errorMessage, Moneda m){
        super(errorMessage);
        moneda = m;
    }
    public String getMessage() {
        return super.getMessage() + ", su moneda: " + moneda.getValor();
    }
}