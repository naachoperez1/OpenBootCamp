package ejercicio10;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//  1. Escribe el código que devuelva una cadena al revés.
//     Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
        System.out.println(reverse("hola nacho"));

//  2. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String[] array = {"juan", "pedro", "matias"};
        for (String palabra : array){
            System.out.println(palabra);
        }

//  3. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y
//     el valor de cada elemento en ambas dimensiones.
        int[][] enteros = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < enteros.length; i++){
            for (int j = 0; j < enteros[i].length; j++){
                System.out.println("valor: " + enteros[i][j]);
            }
        }

//  4. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
//     Elimina el 2o y 3er elemento y muestra el resultado final.
        Vector<String> vector = new Vector<>(5);
        vector.add("Barcelona");
        vector.add("Real Madrid");
        vector.add("Atletico Madrid");
        vector.add("Sevilla");
        vector.add("Valencia");
        System.out.println(vector);

        vector.remove(1);
        vector.remove(2);
        System.out.println(vector);

//  5. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si
//     tuviésemos 1000 elementos para ser añadidos al mismo.
//
//     El problema radicaria en que cada vez que el Vector llega al limite de su capacidad, duplica su tamaño
//     por lo que este tendria que redimensionarse 100 veces para poder almacenar los 1000 elementos, lo que supondria
//     un uso ineficiente de memoria y operaciones adicionales de sobra. Lo que seria recomendable en este caso,
//     si ya se sabe el tamaño final del Vector habria que modificar su capacidad inicial a 1000 asi no se redimensionaria nunca.


//  6. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
//     Recorre ambos mostrando únicamente el valor de cada elemento.
        ArrayList<String> ciudades = new ArrayList<>();

        ciudades.add("Buenos Aires");
        ciudades.add("Cordoba");
        ciudades.add("Santa Fe");
        ciudades.add("Entre Rios");

        LinkedList<String> linkedList = new LinkedList<>(ciudades);

        for (int i = 0; i < ciudades.size(); i ++){
            System.out.println(ciudades.get(i));
            System.out.println(linkedList.get(i));
        }

//  7. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
//     A continuación, con otro bucle, recórrelo y elimina los numeros pares.
//     Por último, vuelve a recorrerlo y muestra el ArrayList final.
//     Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        ArrayList<Integer> arregloEnteros = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            if (i % 2 == 0){
                continue;
            }
            arregloEnteros.add(i);
        }
        System.out.println(arregloEnteros);

//  8. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
//     ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
//     Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
//     Finalmente, mostraremos en cualquier caso: "Demo de código".
        DividePorCero(4,0);


//  9. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
//     La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado
//     en "fileOut".
        String fileIn = "C:/Users/NoteBook/Downloads/rock.txt";
        String fileOut = "C:/Users/NoteBook/Downloads/imagen hecha con java.png";

        try {
            copyFile(fileIn, fileOut);
            System.out.println("¡Archivo copiado exitosamente!");
        } catch (IOException e) {
            System.out.println("Error al copiar el archivo: " + e.getMessage());
        }




//  10. Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones,
//      un HashMap y un ArrayList, LinkedList o array.

//      Ejercicio hecho en la clase MovieListCreator

    }

//  Funcion para revertir strings.
    public static String reverse(String texto) {
        String textoFinal = "";

        for (int i = texto.length()-1; i >= 0; i--){
            textoFinal += texto.charAt(i);
        }

        return textoFinal;
    }


//  Funcion que divide por 0.
    public static void DividePorCero(int a, int b) throws ArithmeticException {
        float num1 = (float) a;
        float num2 = (float) b;

        try {
            System.out.println(num1/num2);
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir por 0. " + e.getMessage());
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        finally {
            System.out.println("Demo de codigo");
        }
    }


//  Funcion InputStream/PrintStream.
    public static void copyFile(String fileIn, String fileOut) throws IOException {
        // Crea objetos File para los archivos de entrada y salida
        File inputFile = new File(fileIn);
        File outputFile = new File(fileOut);

        // Crea un InputStream para el archivo de entrada y un PrintStream para el archivo de salida
        try (InputStream inputStream = new FileInputStream(inputFile);
             PrintStream outputStream = new PrintStream(new FileOutputStream(outputFile))) {

            // Lee los datos del archivo de entrada y escribe en el archivo de salida
            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                    outputStream.write(byteRead);
            }
        }
    }

}
