package ejerciciosDeClase;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 * autor: Santy
 * date: 02/09/2023
 */

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());
    static Consumer<String> writeInfo = (men) -> logger.info(men);

    public static void main(String[] args) throws InterruptedException {
        writeInfo.accept("Hello World");
        writeInfo.accept("Resultado " + (25 - 5 * 4 / 2 % 3 - 10 + 4));

        int[] datos = {};
        int[] datos2 = {};
        int[] datos3 = {};
        int datos4[] = new int[3];
        int datos5[] = { 1, 2, 4 };

    }

}
