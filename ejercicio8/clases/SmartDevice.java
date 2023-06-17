package ejercicio8.clases;

public class SmartDevice {
    int duracionBateriaHoras;
    String marca;
    String modelo;

    public SmartDevice() {
    }

    public SmartDevice(int duracionBateriaHoras, String marca, String modelo) {
        this.duracionBateriaHoras = duracionBateriaHoras;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void conectarse(){
        System.out.println(this.modelo + " se ha conectado a internet");
    }
}
