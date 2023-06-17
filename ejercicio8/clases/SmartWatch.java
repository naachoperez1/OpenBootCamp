package ejercicio8.clases;

public class SmartWatch extends SmartDevice{
    String material;
    public String horarioActual;

    public SmartWatch(){
    }

    public SmartWatch(String material, String horarioActual, int duracionBateriaHoras, String marca, String modelo ) {
        super(duracionBateriaHoras, marca, modelo);
        this.material = material;
        this.horarioActual = horarioActual;
    }

    public void mostrarHoraActual(String horaActual){
        this.horarioActual = horaActual;
        System.out.println("Actualmente son las " + this.horarioActual);
    }
}
