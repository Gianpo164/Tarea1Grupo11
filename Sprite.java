package org.example;
/**
 * Producto Sprite
 */
public class Sprite extends Producto{
    /**
     * Crea una Sprite
     * @param x Serie
     */
    public Sprite(int x){
        super(x);
    }

    /**
     * Retorna el nombre del producto consumido
     * @return El nombre del producto consumido
     */
    public String consumir(){
        return "sprite";
    }

}
