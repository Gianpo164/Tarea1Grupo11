package org.example;

/**
 * Forma de pago para el expendedor
 */
public abstract class Moneda implements Comparable<Moneda> {
    /**
     * Genera la moneda
     */
    public Moneda() {}

    /**
     * Retorna la moneda
     * @return la moneda
     */
    public Moneda getSerie() {
        return this;
    }

    /**
     * Retorna el valor de la moneda
     * @return valor de la moneda
     */
    public abstract int getValor();

    /**
     * Compara dos monedas y dice si es mayor, igual o menor
     * @param m la moneda con la cual se va a comparar
     * @return un numero dependiendo de la comparacion
     */
    public int compareTo(Moneda m) {
        if (this.getValor() > m.getValor())
            return 1;

        else if (this.getValor() < m.getValor())
            return -1;

        else
            return 0;
    }
}