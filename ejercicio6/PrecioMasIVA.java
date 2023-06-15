package ejercicio6;

import java.util.Scanner;

public class PrecioMasIVA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        float precioProducto = Integer.parseInt(scanner.nextLine());

        float precioFinal = precioMasIVA(precioProducto);
        System.out.println("El precio final del producto es $" + precioFinal);
    }

    public static float precioMasIVA(float precio){
        return precio + precio*21/100;
    }
}
