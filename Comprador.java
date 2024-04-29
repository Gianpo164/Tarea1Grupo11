package org.example;

/**
 * Representacion de un comprador el cual adquirira un producto en una maquina expendedora
 */
public class Comprador {
    private Expendedor expendedor;
    private String nproducto;
    private int vuelto = 0;

    /**
     * Compra un producto de un expendedor con una moneda, saca las monedas del deposito para calcular el vuelto y consume el producto comprado
     * @param m utilizada para comprar el producto
     * @param cual Utilizado para identificar el tipo de producto que quiere comprar
     * @param exp Expendedor en el cual intentara comprar el producto
     * @throws NoHayProductoException si el producto no existe en el Expendedor
     * @throws PagoInsuficienteException si ingreso una moneda con valor menor al costo del producto
     * @throws PagoIncorrectoException si no paso un moneda
     * @throws ProductoIncorrectoException si pide un producto que no existe en el expendedor
     */
    public Comprador(Moneda m, int cual, Expendedor exp) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException, ProductoIncorrectoException{
        expendedor = exp;
        Producto Producto = exp.comprarProducto(m, cual);
        for (Moneda i = expendedor.getVuelto(); i != null; i = expendedor.getVuelto()) {
            vuelto += i.getValor();
        }
        if (Producto == null) {
            nproducto = null;
        } else nproducto = Producto.consumir();
    }
    /**
     * Retorna el vuelto
     * @return La suma del valor de todas las monedas que el comprador saco del Expendedor despues de hacer una compra exitosa
     */
    public int cuantoVuelto() {
        return vuelto;
    }

    /**
     * Retorna el nombre del producto que adquirio
     * @return el nombre del producto que adquirio
     */
    public String queConsumiste() {
        return nproducto;
    }
}