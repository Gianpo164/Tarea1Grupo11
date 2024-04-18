package org.example;

public class Expendedor {
    private Deposito coca;
    private Deposito sprite;
    private Deposito monVu;
    private int precioBebida;
    private Bebida b;
    public static final int COCA = 1;
    public static final int SPRITE = 2;

    public Expendedor(int numBebidas, int precioBebidas) {
        coca = new Deposito();
        sprite = new Deposito();
        monVu = new Deposito();
        precioBebida = precioBebidas;

        for (int i = 100; i < 100 + numBebidas; i++) {
            coca.addObject(new CocaCola(i));
        }
        for (int i = 200; i < 200 + numBebidas; i++) {
            sprite.addObject(new Sprite(i));
        }
    }

    public Bebida comprarBebida(Moneda m, int x) {
        b = null;
        if (m == null) {
            return null;
        }
        if (x == 1) {
            if (m.getValor() >= precioBebida) {
                b = (Bebida) coca.getObject();
            }
        } else if (x == 2) {
            if (m.getValor() >= precioBebida) {
                b = (Bebida) sprite.getObject();
            }
        }
        if (b == null) {
            monVu.addObject(m);
            return null;
        }
        for (int i = 0; m.getValor() > precioBebida + i; i += 100) {
            monVu.addObject(new Moneda100());
        }
        return b;
    }

    public Moneda getVuelto() {
        return (Moneda) monVu.getObject();
    }
}
