package ejercicio9;

public class Auto {
    public String modelo;
    public String marca;
    public int numeroPuertas;

    //Declaramos un constructor
    public Auto(String modelo, String marca, int puertas) {
        this.modelo = modelo ;
        this.marca = marca;
        this.numeroPuertas = puertas;

    }

    public void sumarPuerta() {
        this.numeroPuertas ++;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", numeroPuertas=" + numeroPuertas +
                '}';
    }
}