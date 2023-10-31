package modulo7;

import java.sql.SQLOutput;

public class MetodosString {


    public static void main(String[] args) {

        String phoneNum= "315-555-5555";
        int idx1 = phoneNum.indexOf("-");
        System.out.println(idx1);

        int idx2 = phoneNum.indexOf("-",4);
        System.out.println(idx1+1); // Posicion 3 en adelante comienza la busqueda

        System.out.println(Float.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);

        String espacio = " ";
        char[] espacioC = espacio.toCharArray();
        System.out.println(espacioC[0]);



    }

}
