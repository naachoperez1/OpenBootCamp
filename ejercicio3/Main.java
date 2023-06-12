package ejercicio3;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setNombre("Nacho");
        persona1.setEdad(25);
        persona1.setTelefono("3654985642");

        System.out.println(persona1.nombre);
        System.out.println(persona1.edad);
        System.out.println(persona1.telefono);
    }

    public static class Persona{
        private int edad;
        private String nombre;
        private String telefono;

            public void setNombre(String nombre){
                this.nombre = nombre;
            }
            public String getNombre(){
                return this.nombre;
            }

            public void setEdad(int edad){
                this.edad = edad;
            }
            public int getEdad(){
                return this.edad;
            }

            public void setTelefono(String telefono){
                this.telefono = telefono;
            }
            public String getTelefono(){
                return this.telefono;
            }
    }
}

