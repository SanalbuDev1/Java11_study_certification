package modulo7;

public class Metodos {

    static Producto p = new Producto();

    public static void main(String[] args) {
        Metodos m = new Metodos();
        p.setName("play 5");
        m.facturar(p);
        System.out.println(p.getName()); // valor de referencia

    }

    public  String facturar(Producto p){
        p.setName("TV");
        return "hola";
    }

    public Producto getP() {
        return p;
    }

    public void setP(Producto p) {
        this.p = p;
    }
}
