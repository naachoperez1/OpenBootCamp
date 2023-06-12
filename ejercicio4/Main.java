package ejercicio4;
import ejercicio4.Clases.Persona;
import ejercicio4.Clases.Cliente;
import ejercicio4.Clases.Trabajador;
public class Main {
    public static void main(String[] args){
        Persona persona1 = new Persona();
        persona1.setNombre("Ignacio");
        persona1.setEdad(25);
        persona1.setTelefono("3568974512");
        System.out.print("Nombre persona: " + persona1.getNombre() + ". \n" + "Edad: " + persona1.getEdad() +
                ". \n" + "Telefono: " + persona1.getTelefono() +".\n" +persona1.getClass() +".\n\n");


        Cliente miCliente = new Cliente();
        miCliente.setCredito(25000);
        miCliente.setNombre("Juan");
        miCliente.setEdad(30);
        miCliente.setTelefono("546231548");
        System.out.print("Nombre cliente: " + miCliente.getNombre() + ". \n" + "Edad: " + miCliente.getEdad() + ". \n"
                + "Telefono: " + miCliente.getTelefono() + ". \n" + "Credito: $" + miCliente.getCredito() + ".\n" + miCliente.getClass() + ".\n\n");


        Trabajador miTrabajador = new Trabajador();
        miTrabajador.setNombre("Pedro");
        miTrabajador.setSalario(150000);
        miTrabajador.setEdad(35);
        miTrabajador.setTelefono("547812546");
        System.out.print("Nombre trabajador: " + miTrabajador.getNombre() + ". \n" + "Edad: " + miTrabajador.getEdad() + ". \n"
                + "Telefono: " + miTrabajador.getTelefono() + ". \n" + "Salario: $" + miTrabajador.getSalario() + ".\n" + miTrabajador.getClass() + ".\n\n");

    }

}
