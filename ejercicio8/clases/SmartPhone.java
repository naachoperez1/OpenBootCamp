package ejercicio8.clases;

public class SmartPhone extends SmartDevice{
    String numeroTelefono;
    boolean camaraFrontal;

    public SmartPhone(){
    }

    public SmartPhone(String numeroTelefono, boolean camaraFrontal, int duracionBateriaHoras, String marca, String modelo){
        super(duracionBateriaHoras, marca, modelo);
        this.numeroTelefono = numeroTelefono;
        this.camaraFrontal = camaraFrontal;
    }

    public void sacarFoto(String objeto){
        System.out.println("Se ha tomado una foto de " + objeto + " con " + this.modelo);
    }


}
