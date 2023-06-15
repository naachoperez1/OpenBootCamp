package ejercicio5;

public class TiposDeDatos {
    public static void main(String[] args) {
/*
      Tipos de datos.
      1. Numericos.
 */
//      1.1 Enteros.
        byte datoByte = 5;
        System.out.println("Byte" + " " + datoByte);

        short datoShort = 12;
        System.out.println("Short" + " " + datoShort);

        int datoInt = 123;
        System.out.println("Int" + " " + datoInt);

        long datoLong = 12341234;
        System.out.println("Long" + " " + datoLong);


//      1.2 Decimales.
        float datoFloat = 1.4F;
        System.out.println("Float" + " " + datoFloat);

        double datoDouble = 2.343d;
        System.out.println("Double" + " " + datoDouble);


//      2 Booleano.
        boolean datoTrue = true;
        System.out.println("Boolean" + " " + datoTrue);

        boolean datoFalse = false;
        System.out.println("Boolean" + " " + datoFalse);


//      Texto.
        char tipoChar = 'a';
        System.out.println("Char" + " " + tipoChar);

        String tipoString = "hola mundo!";
        System.out.println("String" + " " + tipoString);




    }
}
