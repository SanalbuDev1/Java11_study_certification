package modulo6;

public class Cliente {

    public static void main(String[] args) {

        Building buil = new Building();
        buil.addElevators();
        buil.addElevators();
        buil.addElevators();
        buil.addElevators();

        buil.getListElevators().forEach(System.out::println);

    }

}
