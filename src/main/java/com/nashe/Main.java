package com.nashe;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Sorts ordenamientos;

    static Scanner scanner = new Scanner(System.in);
    static int opcion = 0;




    public static Integer[] generateArray(int n) {
        Integer[] result = new Integer[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            result[i] = random.nextInt(1000); // You can adjust the range of generated numbers as needed
        }

        return result;
    }
    public static void llamarOrdenamientos(){
        ordenamientos = new Sorts();
        for (int i = 10; i < 3000; i++) {
            ordenamientos.bubbleSort(generateArray(i));

            ordenamientos.gnomeSort(generateArray(i));

            ordenamientos.quickSort(generateArray(i),0,i-1);

            ordenamientos.radixSort(generateArray(i));

            ordenamientos.mergeSort(generateArray(i));
        }
    }

    public static void main(String[] args) {

        while (opcion != 2) {
            System.out.println("Menú:");
            System.out.println("1. Ordenamientos");
            System.out.println("2. Salir");

            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ordenamientos");
                    llamarOrdenamientos();
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida.");
            }
        }
        scanner.close();

    }
}