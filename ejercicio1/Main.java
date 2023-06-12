package ejercicio1;
import ejercicio1.Clases.Coche;

public class Main {
    public static void main(String[] args) {
//      Sumar tres numeros.
        int suma = sumaTresNum(5, 10, 15);
        System.out.println(suma);

//      Crear objeto coche y añadirle puertas.
        Coche miCoche = new Coche("Chronos", "Fiat", 4);
        System.out.println(miCoche.numeroPuertas);
        miCoche.sumarPuerta();
        System.out.println(miCoche.numeroPuertas);


    }

    public static int sumaTresNum(int a, int b, int c){
        return a + b + c;
    }
}