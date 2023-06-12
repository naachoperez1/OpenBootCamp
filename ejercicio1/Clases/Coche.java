package ejercicio1.Clases;

public class Coche {
    public String modelo;
    public String marca;
    public int numeroPuertas;

    //Declaramos un constructor
    public Coche(String modelo, String marca, int puertas) {
        this.modelo = modelo ;
        this.marca = marca;
        this.numeroPuertas = puertas;

    }

    public void sumarPuerta() {
        this.numeroPuertas ++;
    }
}