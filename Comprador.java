package org.example;

public class Comprador {
    private Expendedor expendedor;
    private String sabor;
    private int vuelto = 0;

    public Comprador(Moneda m, int cual, Expendedor exp) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException, ProductoIncorrectoException{
        expendedor = exp;
        Producto Producto = exp.comprarProducto(m, cual);
        for (Moneda i = expendedor.getVuelto(); i != null; i = expendedor.getVuelto()) {
            vuelto += i.getValor();
        }
        if (Producto == null) {
            sabor = null;
        } else sabor = Producto.consumir();
    }

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queBebiste() {
        return sabor;
    }
}