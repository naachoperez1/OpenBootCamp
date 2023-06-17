package ejercicio8;

import ejercicio8.clases.SmartDevice;
import ejercicio8.clases.SmartPhone;
import ejercicio8.clases.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartPhone iPhone = new SmartPhone("348754625", true, 30,"Apple","iPhone 14 Pro Max" );
        SmartWatch relojSmart = new SmartWatch("cuero", "18:30 pm", 15, "Samsung", "SmartWatch Air Zero");

        System.out.println(iPhone.getClass());
        System.out.println(relojSmart.getClass());

        iPhone.conectarse();
        relojSmart.conectarse();

        iPhone.sacarFoto("la luna");
        System.out.println(relojSmart.horarioActual);
        relojSmart.mostrarHoraActual("20:05 pm");
        System.out.println(relojSmart.horarioActual);
    }
}
