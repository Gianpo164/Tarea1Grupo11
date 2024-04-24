package org.example;

public abstract class Bebida extends Producto {

    public Bebida(int x) { super(x); }

    public abstract String beber();
}
class Sprite extends Bebida{
    public Sprite(int x){
        super(x);
    }
    public String beber(){
        return "sprite";
    }
}
class CocaCola extends Bebida{
    public CocaCola(int x){
        super(x);
    }
    public String beber(){
        return "cocacola";
    }
}
class Fanta extends Bebida{
    public Fanta(int x){
        super(x);
    }
    public String beber(){
        return "fanta";
    }
}
