package org.example;
/**
 * Producto Super8
 */
public class Super8 extends Producto{
    /**
     * Crea una Super8
     * @param x Serie
     */
    public Super8(int x) { super(x); }

    /**
     * Retorna el nombre del producto consumido
     * @return El nombre del producto consumido
     */
    public String consumir(){ return "super8"; }
}
