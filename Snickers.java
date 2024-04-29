package org.example;
/**
 * Producto Snickers
 */
public class Snickers extends Producto{
    /**
     * Crea un Snickers
     * @param x Serie
     */
    public Snickers(int x) { super(x); }
    /**
     * Retorna el nombre del producto consumido
     * @return El nombre del producto consumido
     */
    public String consumir(){ return "snicker"; }
}
