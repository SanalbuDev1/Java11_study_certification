package modulo7;

import java.sql.SQLOutput;

public class CasteoPrimitivos {

    public static void main(String[] args) {

        byte edad = 0;
        int var1 = 15;
        int var2 = 10;

        edad = (byte) (var1 * var2);
        System.out.println(edad);

        long totalJugadores = 0L;
        int var3 = 5555;
        int var4 = 666666666;

        totalJugadores = var3 * var4;
        System.out.println(totalJugadores);

        float parejas = 0;
        int var5 = 10;
        float var6 = 3;
        parejas = var5/var6;

        System.out.println(parejas);

        short a,b,c = 0;
        a = 1;
        b = 2;
        c = (byte)(short)(int)(long) (b + a + 10l);
        System.out.println(c);

        float f1 = (float)0.9, f2 = 0.9f;

    }

}
