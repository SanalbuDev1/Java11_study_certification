package ejerciciosDeClase;

import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nivel de la piramide");
        int preguntar = sc.nextInt();
        String caracter = sc.next();
        sc.nextLine();
        int contadorEspacios = 0;

        for (int i = preguntar; i > 0; i--) {
            int contador = 0;
            String pintarNivel = "";
            while (contador <= i) {
                pintarNivel += caracter;
                contador++;
                if (contador == i && i % 2 == 0) {
                    System.out.print(String.format("%-" + ++contadorEspacios + "s nivel -> %d", "", contadorEspacios));
                    System.out.print(pintarNivel);
                }
            }

            if (i % 2 == 0) {
                System.out.println("");
            }
        }

        sc.close();

    }

}
