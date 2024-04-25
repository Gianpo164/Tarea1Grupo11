package org.example;

public class PagoInsuficienteException extends Exception{
    private Moneda moneda;

    public PagoInsuficienteException(String errorMessage,Moneda m){
        super(errorMessage);
        moneda = m;
    }
    public Moneda DevuelveMoneda(){
        return moneda;
    }

}
