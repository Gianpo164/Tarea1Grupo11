package org.example;

public class Comprador {
    private Expendedor expendedor;
    private String sonido;
    private int vuelto = 0;

    public Comprador(Moneda m, int cual, Expendedor exp) {
        expendedor = exp;
        Bebida bebida = exp.comprarBebida(m, cual);
        for (Moneda i = expendedor.getVuelto(); i != null; i = expendedor.getVuelto()) {
            vuelto += i.getValor();
        }
        if (bebida == null) {
            sonido = null;
        } else sonido = bebida.beber();
    }

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queBebiste() {
        return sonido;
    }

}
