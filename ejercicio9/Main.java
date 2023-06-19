package ejercicio9;

import ejercicio9.Auto;

public class Main {
    static AutoCRUD cocheCRUD = new AutoCRUDImpl();
    public static void main(String[] args) {

        Auto coche1 = new Auto("308", "Peugeot", 4);
        Auto coche2 = new Auto("Fiesta", "Ford", 4);
        Auto coche3 = new Auto("Chronos", "Fiat", 5);


        cocheCRUD.save(coche1);
        cocheCRUD.save(coche2);
        cocheCRUD.save(coche3);

        cocheCRUD.findAll();
        cocheCRUD.findAuto(coche1);
        cocheCRUD.deleteAuto(coche2);
        cocheCRUD.findAll();
    }
}
