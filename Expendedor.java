package org.example;

public class Expendedor {
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> fanta;
    private Deposito<Producto> snickers;
    private Deposito<Producto> super8;
    private Deposito<Moneda> monVu;
    private int precioBebida;
    private Producto b;
    public static final int COCA = 1;
    public static final int SPRITE = 2;

    public Expendedor(int numBebidas) {
        coca = new Deposito<>();
        sprite = new Deposito<>();
        fanta = new Deposito<>();
        snickers = new Deposito<>();
        super8 = new Deposito<>();
        monVu = new Deposito<>();

        for (int i = 100; i < 100 + numBebidas; i++) {
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
            //System.out.println("null");
            throw new PagoIncorrectoException("Pago incorrecto");
        }
        switch (x){
            case 1:
                b = coca.getObject();
                precioBebida = EnumProductos.COCACOLA.getPrecio();
                break;
            case 2:
                b = sprite.getObject();
                precioBebida = EnumProductos.SPRITE.getPrecio();
                break;
            case 3:
                b = fanta.getObject();
                precioBebida = EnumProductos.FANTA.getPrecio();
                break;
            case 4:
                b = snickers.getObject();
                precioBebida = EnumProductos.SNICKERS.getPrecio();
                break;
            case 5:
                b = super8.getObject();
                precioBebida = EnumProductos.SUPER8.getPrecio();
                break;
            default:
                throw new ProductoIncorrectoException("No existe el producto pedido");
        }

        if (b == null) {
            monVu.addObject(m);
            throw new NoHayProductoException("No hay producto");
        }
        if (m.getValor() >= precioBebida){
            for (int i = 0; m.getValor() > precioBebida + i; i += 100) {
                monVu.addObject(new Moneda100());
            }
        }
        else throw new PagoInsuficienteException("El producto custa mas de lo que se entrego");

        return b;
    }

    public Moneda getVuelto() {
        return (Moneda) monVu.getObject();
    }
}