package org.example;

import java.util.ArrayList;

public class Deposito<T> {
    private ArrayList<T> deposito;

    public Deposito() { this.deposito = new ArrayList<T>(); }

    public void addObject(T x) {
        deposito.add(x);
    }

    public T getObject() {
        if (deposito.size() == 0) {
            return null;
        }
        return deposito.remove(0);
    }
}
