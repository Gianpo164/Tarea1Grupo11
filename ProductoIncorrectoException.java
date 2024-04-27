package org.example;

public class ProductoIncorrectoException extends Exception{
    private Moneda moneda;

    public ProductoIncorrectoException(String errorMessage, Moneda m){
        super(errorMessage);
        moneda = m;
    }
    public String getMessage() {
        return super.getMessage() + ", su moneda: " + moneda.getValor();
    }
}