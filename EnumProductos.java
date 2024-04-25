package org.example;

public enum EnumProductos {
    COCACOLA(1,700),
    SPRITE(2,500),
    FANTA(3,600),
    SNICKERS(4,1000),
    SUPER8(5,500);

    int x = 0;
    int y = 0;
    EnumProductos(int num, int precio) {
        x = num;
        y = precio;
    }
    public int getPrecio(){
        return y;
    }
}
