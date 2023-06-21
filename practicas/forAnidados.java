package practicas;

public class forAnidados {
    public static void main(String[] args) {
        int arrayNumeros[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 }
        };

        for (int i = 0; i < arrayNumeros.length; i++){
            for (int j = 0; j < arrayNumeros[i].length; j++){
                System.out.println("estoy en la posicion i: " + i);
                System.out.println("estoy en la posicion j: " + j);
                System.out.println("elemento del array: " + arrayNumeros[i][j]);
                System.out.println(" ");

            }
        }
    }
}
