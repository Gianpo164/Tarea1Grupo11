package org.example;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(2);
        Comprador c;
        Moneda m;

        try {
            m = new Moneda1000();
            c = new Comprador(m, 5, exp);
            System.out.println(c.queConsumiste()+", su vuelto: "+c.cuantoVuelto());
        } catch (PagoIncorrectoException | ProductoIncorrectoException | PagoInsuficienteException | NoHayProductoException exc) {
            System.out.println(exc.getMessage());
        }
        try {
            m = null;
            c = new Comprador(m, 2, exp);
            System.out.println(c.queConsumiste()+", "+c.cuantoVuelto());
        } catch (PagoIncorrectoException | ProductoIncorrectoException | PagoInsuficienteException | NoHayProductoException exc) {
            System.out.println(exc.getMessage());
        }
        try {
            m = new Moneda1000();
            c = new Comprador(m, 6, exp);
            System.out.println(c.queConsumiste()+", "+c.cuantoVuelto());
        } catch (PagoIncorrectoException | ProductoIncorrectoException | PagoInsuficienteException | NoHayProductoException exc) {
            System.out.println(exc.getMessage());
        }
        try {
            m = new Moneda500();
            c = new Comprador(m, 4, exp);
            System.out.println(c.queConsumiste()+", "+c.cuantoVuelto());
        } catch (PagoIncorrectoException | ProductoIncorrectoException | PagoInsuficienteException | NoHayProductoException exc) {
            System.out.println(exc.getMessage());
        }
        try {
            m = new Moneda500();
            c = new Comprador(m, 5, exp);
            System.out.println(c.queConsumiste()+", su vuelto: "+c.cuantoVuelto());
        } catch (PagoIncorrectoException | ProductoIncorrectoException | PagoInsuficienteException | NoHayProductoException exc) {
            System.out.println(exc.getMessage());
        }
        try {
            m = new Moneda1000();
            c = new Comprador(m, 5, exp);
            System.out.println(c.queConsumiste()+", "+c.cuantoVuelto());
        } catch (PagoIncorrectoException | ProductoIncorrectoException | PagoInsuficienteException | NoHayProductoException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
