package org.example;

public class PagoInsuficienteException extends Exception{
    private Moneda moneda;

    public PagoInsuficienteException(String errorMessage,Moneda m){
        super(errorMessage);
        moneda = m;
    }
    public String getMessage() {
        return super.getMessage() + ", su moneda: " + moneda.getValor();
    }

}
