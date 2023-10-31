package modulo8;

public class PasoPorValor {

    public static void main(String[] args) {
        ShoppingCart myCart = new ShoppingCart();
    }

}

class ShoppingCart {
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        System.out.println("Shirt color: " + myShirt.colorCode);
        changeShirtColorNoFunc(myShirt, 'B');
        System.out.println("Shirt color: " + myShirt.colorCode);

        //

        Shirt myShirt2 = new Shirt();
        System.out.println("Shirt color: " + myShirt2.colorCode);
        changeShirtColorFunc(myShirt2, 'B');
        System.out.println("Shirt color: " + myShirt2.colorCode);
    }

    public static void changeShirtColorNoFunc(Shirt theShirt, char color) {
        theShirt = new Shirt();
        theShirt.colorCode = color;
    }

    public static void changeShirtColorFunc(Shirt theShirt, char color) {
        theShirt.colorCode = color;
    }
}
