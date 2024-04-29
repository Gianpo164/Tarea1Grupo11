package org.example;

/**
 * Enumeracion de los productos y sus respectivos valores
 */
public enum EnumProductos {
    /**
     * Tipo y precio de CocaCola
     */
    COCACOLA(1,700),
    /**
     * Tipo y precio de Sprite
     */
    SPRITE(2,500),
    /**
     * Tipo y precio de Fanta
     */
    FANTA(3,600),
    /**
     * Tipo y precio de Snickers
     */
    SNICKERS(4,1000),
    /**
     * Tipo y precio de Super8
     */
    SUPER8(5,500);

    int x = 0;
    int y = 0;

    /**
     * @param num El numero identificador de cada producto
     * @param precio El precio de cada producto
     */
    EnumProductos(int num, int precio) {
        x = num;
        y = precio;
    }

    /**
     * Retorna el precio del producto
     * @return El precio del producto
     */
    public int getPrecio(){
        return y;
    }
}
