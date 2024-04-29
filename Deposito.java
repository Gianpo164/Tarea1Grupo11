package org.example;

import java.util.ArrayList;

/**
 * Almacena Productos y monedas
 * @param <T> Tipo generico del Deposito
 */
public class Deposito<T> {
    private ArrayList<T> deposito;

    /**
     * Crea el deposito
     */
    public Deposito() { this.deposito = new ArrayList<T>(); }

    /**
     * Agrega objeto al deposito
     * @param x Objeto para agregar al deposito
     */
    public void addObject(T x) {
        deposito.add(x);
    }

    /**
     * Retorna el primer objeto del deposito
     * @return el primer objeto del deposito
     */
    public T getObject() {
        if (deposito.size() == 0) {
            return null;
        }
        return deposito.remove(0);
    }
}
