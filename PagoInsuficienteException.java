package org.example;

/**
 *Excepcion que maneja un mensaje de error personalizado y devuelve una modeda. Sera utilizado en Expendedor
 */
public class PagoInsuficienteException extends Exception{
    /**
     * Almacena la moneda devuelta
     */
    private Moneda moneda;

    /**
     * Crea la excepcion para la situacion especificada
     * @param errorMessage Mensaje de error que sera entregado
     * @param m Moneda que sera devuelta
     */
    public PagoInsuficienteException(String errorMessage,Moneda m){
        super(errorMessage);
        moneda = m;
    }

    /**
     * Devuelve el mensaje de error
     * @return mensaje de error y valor de la moneda
     */
    @Override
    public String getMessage() {
        return super.getMessage() + ", su moneda: " + moneda.getValor();
    }

}
