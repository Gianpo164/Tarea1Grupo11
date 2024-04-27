package org.example;

public class Expendedor {
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> fanta;
    private Deposito<Producto> snickers;
    private Deposito<Producto> super8;
    private Deposito<Moneda> monVu;
    private int precioProducto;
    private Producto b;

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

    public Producto comprarProducto(Moneda m, int x) throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException, ProductoIncorrectoException {
        b = null;
        if (m == null) {
            throw new PagoIncorrectoException("Pago incorrecto");
        }
        switch (x){
            case 1:
                b = coca.getObject();
                precioProducto = EnumProductos.COCACOLA.getPrecio();
                break;
            case 2:
                b = sprite.getObject();
                precioProducto = EnumProductos.SPRITE.getPrecio();
                break;
            case 3:
                b = fanta.getObject();
                precioProducto = EnumProductos.FANTA.getPrecio();
                break;
            case 4:
                b = snickers.getObject();
                precioProducto = EnumProductos.SNICKERS.getPrecio();
                break;
            case 5:
                b = super8.getObject();
                precioProducto = EnumProductos.SUPER8.getPrecio();
                break;
            default:
                throw new ProductoIncorrectoException("No existe el producto pedido", m);
        }

        if (b == null) {
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

        return b;
    }

    public Moneda getVuelto() {
        return (Moneda) monVu.getObject();
    }
}