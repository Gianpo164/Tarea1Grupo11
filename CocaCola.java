package org.example;

/**
 * Producto CocaCola
 */
public class CocaCola extends Producto{
    /**
     * Crea una CocaCola
     * @param x Serie
     */
    public CocaCola(int x){
        super(x);
    }
    /**
     * Retorna el nombre del producto consumido
     * @return El nombre del producto consumido
     */
    public String consumir(){
        return "cocacola";
    }
}
