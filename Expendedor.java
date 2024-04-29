package org.example;

/**
 * Representacion de una maquina expendedora
 */
public class Expendedor {
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> fanta;
    private Deposito<Producto> snickers;
    private Deposito<Producto> super8;
    private Deposito<Moneda> monVu;
    private int precioProducto;
    private Producto p;

    /**
     * Crear los depositos y agregarle productos
     * @param numProductos cuantos productos habra de cada tipo
     */
    public Expendedor(int numProductos) {
        coca = new Deposito<>();
        sprite = new Deposito<>();
        fanta = new Deposito<>();
        snickers = new Deposito<>();
        super8 = new Deposito<>();
        monVu = new Deposito<>();

        for (int i = 100; i < 100 + numProductos; i++) {
            coca.addObject(new CocaCola(i));
            sprite.addObject(new Sprite(i+100));
            fanta.addObject(new Fanta(i+200));
            snickers.addObject(new Snickers(i+300));
            super8.addObject(new Super8(i+400));
        }
    }

    /**
     * Se asegura de que el producto y el vuelto sean el correcto
     * @param m para corroborar que se ingreso el dinero suficiente para efectuar la compra
     * @param x el tipo de producto que se quiere comprar
     * @return el producto pedido
     * @throws NoHayProductoException si no quedan productos del que se pide
     * @throws PagoIncorrectoException si no se ingresa una moneda
     * @throws PagoInsuficienteException si con la moneda ingresada no alcanza a comprar el producto
     * @throws ProductoIncorrectoException si el producto que se pide no existe en la expendedora
     */
    public Producto comprarProducto(Moneda m, int x) throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException, ProductoIncorrectoException {
        p = null;
        if (m == null) {
            throw new PagoIncorrectoException("Pago incorrecto");
        }
        switch (x){
            case 1:
                p = coca.getObject();
                precioProducto = EnumProductos.COCACOLA.getPrecio();
                break;
            case 2:
                p = sprite.getObject();
                precioProducto = EnumProductos.SPRITE.getPrecio();
                break;
            case 3:
                p = fanta.getObject();
                precioProducto = EnumProductos.FANTA.getPrecio();
                break;
            case 4:
                p = snickers.getObject();
                precioProducto = EnumProductos.SNICKERS.getPrecio();
                break;
            case 5:
                p = super8.getObject();
                precioProducto = EnumProductos.SUPER8.getPrecio();
                break;
            default:
                throw new ProductoIncorrectoException("No existe el producto pedido", m);
        }

        if (p == null) {
            monVu.addObject(m);
            throw new NoHayProductoException("No hay producto", m);
        }
        if (m.getValor() >= precioProducto){
            for (int i = 0; m.getValor() > precioProducto + i; i += 100) {
                monVu.addObject(new Moneda100());
            }
        }
        else {
            throw new PagoInsuficienteException("El producto cuesta mas de lo que se entrego", m);
        }

        return p;
    }

    /**
     * Saca las monedas del deposito de monedas
     * @return el vuelto que se genera en la compra
     */
    public Moneda getVuelto() {
        return monVu.getObject();
    }
}