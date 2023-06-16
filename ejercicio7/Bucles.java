package ejercicio7;

public class Bucles {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Nacho", "Jose", "Carlos"};
        String texto = "";

//      Bucle que permite concatenar los nombres del array "nombres" y los muestra como un solo texto.
        for (String nombre : nombres) {
            texto += nombre + " ";
        }

        System.out.println(texto);
    }
}
