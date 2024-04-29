package org.example;
/**
 * Producto Fanta
 */
public class Fanta extends Producto{
    /**
     * Crea una Fanta
     * @param x Serie
     */
    public Fanta(int x){ super(x); }
    /**
     * Retorna el nombre del producto consumido
     * @return El nombre del producto consumido
     */
    public String consumir(){ return "fanta"; }
}
