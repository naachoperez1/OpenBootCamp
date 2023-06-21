package ejercicio10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MovieListCreator {
    public static void main(String[] args) {
//
//      MovieListCreator es un programa que le pide al usuario que ingrese nombres de peliculas,
//      crea un archivo llamado "peliculas.txt" y las va registrando en el mismo.

        boolean seguir = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> peliculas = new ArrayList<>();
        // Pedir al usuario que ingrese nombres de peliculas.
        while (seguir){
            System.out.print("Ingrese el nombre de la pelicula o 'exit' para salir: ");
            String pelicula = scanner.nextLine();
            if (pelicula.equals("exit")){
                seguir = false;
            }
            else{
                peliculas.add(pelicula);
            }
        }
        
        // Crear un HashMap con los nombres de las peliculas y el orden en que fueron ingresados. (1. Batman, 2. jumanji, etc)
        Map<Integer, String> diccionario = new HashMap<>();
        for (int i = 0; i < peliculas.size(); i++){
            diccionario.put(i+1,peliculas.get(i));
        }
        // Creamos la ruta del archivo donde se van a guardar las peliculas
        String rutaArchivo = "C:/Users/NoteBook/Downloads/peliculas.txt";

        try {
            // Crear instancia de la clase File
            File archivo = new File(rutaArchivo);

            // Verificar si el archivo ya existe
            if (archivo.exists()) {
                System.out.println("El archivo ya existe.");
                return;
            }

            // Crear el archivo
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado exitosamente.");
            } else {
                System.out.println("No se pudo crear el archivo.");
                return;
            }

            // Escribir contenido en el archivo
            FileWriter escritor = new FileWriter(archivo);
            // BufferedWritter es para escribir en una nueva linea cada vez
            BufferedWriter bufferedWriter = new BufferedWriter(escritor);
            for (Map.Entry<Integer, String> entry : diccionario.entrySet()) {
                Integer clave = entry.getKey();
                String valor = entry.getValue();
                bufferedWriter.write(clave + ". " + valor);
                bufferedWriter.newLine();

            }
            bufferedWriter.close();

            System.out.println("Contenido escrito en el archivo.");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
