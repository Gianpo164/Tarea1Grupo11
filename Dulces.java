package org.example;

public abstract class Dulces extends Producto{
    public Dulces(int x) { super(x); }

    public abstract String consumir();
}

class Snickers extends Dulces{
    public Snickers(int x) { super(x); }
    public String consumir(){ return "snicker"; }
}
class Super8 extends Dulces{
    public Super8(int x) { super(x); }
    public String consumir(){ return "super8"; }
}