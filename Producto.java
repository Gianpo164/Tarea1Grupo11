package org.example;

public abstract class Producto {
    private int serie;

    public Producto(int x) {
        serie = x;
    }

    public int getSerie() {
        return serie;
    }

    public abstract String beber();
}
class Sprite extends Producto{
    public Sprite(int x){
        super(x);
    }
    public String beber(){
        return "sprite";
    }
}
class CocaCola extends Producto{
    public CocaCola(int x){
        super(x);
    }
    public String beber(){
        return "cocacola";
    }
}
class Fanta extends Producto{
    public Fanta(int x){
        super(x);
    }
    public String beber(){
        return "Fanta";
    }
}
class Snickers extends Producto{
    public Snickers(int x){
        super(x);
    }
    public String beber(){
        return "Snickers";
    }
}
class Super8 extends Producto{
    public Super8(int x){
        super(x);
    }
    public String beber(){
        return "Super8";
    }
}
