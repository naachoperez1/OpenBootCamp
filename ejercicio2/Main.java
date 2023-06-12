package ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      CHEQUEAR SI numeroIf ES MENOR, MAYOR O IGUAL A 0.
        int numeroIf = -5;

        if (numeroIf == 0) {
            System.out.println("El numero  es 0");
        } else if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }


//      BUCLE WHILE.
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }


//      BUCLE DO-WHILE.
        int contador = 1;

        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador < 2);


//      BUCLE FOR.
        int numeroFor;
        for (numeroFor = 0; numeroFor <= 3; numeroFor ++) {
            System.out.println("numeroFor: " + numeroFor);
        }


//      SWICTH CASE.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la estacion: ");
        String estacion = scanner.nextLine();


        switch (estacion) {
            case "verano" -> System.out.println("La estacion es verano");
            case "primavera" -> System.out.println("La estacion es primavera");
            case "otoño" -> System.out.println("La estacion es otoño");
            case "invierno" -> System.out.println("La estacion es invierno");
            default -> System.out.println("Opción inválida");
        }

        scanner.close();


    }
}