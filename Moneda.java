package org.example;

public abstract class Moneda implements Comparable<Moneda> {
    public Moneda() {}

    public Moneda getSerie() {
        return this;
    }

    public abstract int getValor();

    public int compareTo(Moneda m) {
        if (this.getValor() > m.getValor())
            return 1;

        else if (this.getValor() < m.getValor())
            return -1;

        else
            return 0;
    }
}