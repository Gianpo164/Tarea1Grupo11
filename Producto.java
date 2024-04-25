package org.example;

public abstract class Producto {
    private int serie;
    private int valor;
    public Producto(int x) { serie = x; }
    public int getSerie() { return serie; }
    public abstract String consumir();
}
