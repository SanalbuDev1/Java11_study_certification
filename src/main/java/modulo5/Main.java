package com.capacitacion.modulo5;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        int [] numberElement= {};
        System.out.println(numberElement);

        //isAnAdult();
        exampleLoop();

        System.out.println();

        // objets

        Persona p1 = new Persona();
        p1.setName("Santiago");

        Persona p2 = p1;

        System.out.println(p1);
        System.out.println(p2);

        p2.setName("otro");

        System.out.println(p1);
        System.out.println(p2);

        //Persona p3 = (Persona) p1.clone();

        System.out.println(p1);
        System.out.println(p2);


    }

    public static void calculateAverageClass(){
        double[] ages = new double [20];
        double sum = 0;


        for (int i=0; i<ages.length; i++){
            ages[i] =(double) new Random().nextInt(20);
        }

        for (int i=0; i<ages.length; i++){
            System.out.printf("student %d -> %f", i, ages[i]);
            sum += ages[i];
            System.out.println();

            if(ages[i]>=18){
                System.out.println("There are some students that have 18 or more");
                if(true){
                    // revisar si el break funciona en este punto
                    System.out.println("salir del ciclo");
                    break;
                }
            }
        }
        System.out.printf("sum %f", sum);
        System.out.printf("the average is %f", sum/ages.length);

    }

    public static void isAnAdult(){
        double[] ages = new double [20];
        double sum = 0;

        for (int i=0; i<ages.length; i++){
            ages[i] =(double) new Random().nextInt(20);
        }

        List<Double> lista = Arrays.stream(ages)
                .filter((x) -> x >= 18)
                .boxed()
                .collect(Collectors.toList());

        System.out.printf("There are %d people >= 18", lista.size());

    }

    public static void exampleLoop(){

        String [][] arreglo = new String[10][20];

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                arreglo[i][j] = "x -> " + i + " y -> " + j;
                System.out.print(arreglo[i][j]);

                if(i==5){
                    break;
                }
            }
            System.out.println();
        }

    }

}
