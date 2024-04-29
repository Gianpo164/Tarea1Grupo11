package org.example;

/**
 * Excepcion que maneja un mensaje de error personalizado. Sera utilizado en Expendedor
 */
public class PagoIncorrectoException extends Exception{

    /**
     * Crea la excepcion para la situacion especificada
     * @param errorMessage Mensaje de error que sera entregado
     */
    public PagoIncorrectoException(String errorMessage){
        super(errorMessage);
    }
}
