package ejercicio4.Clases;

public class Persona{
    String nombre;
    int edad;
    String telefono;



//    Declaramos un constructor pero no es usado en este caso.
//
//    public Persona(String nombre, int edad, String telefono){
//        this.nombre = nombre;
//        this.edad = edad;
//        this.telefono = telefono;
//    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
}

