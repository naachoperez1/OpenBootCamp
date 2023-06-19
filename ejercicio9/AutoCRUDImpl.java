package ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class AutoCRUDImpl implements AutoCRUD{
    List <Auto> listaCoches = new ArrayList<>();
    @Override
    public void save(Auto coche) {
        listaCoches.add(coche);
        System.out.println(coche + " guardado en la base de datos");;
    }

    @Override
    public List<Auto> findAll() {
        System.out.println(listaCoches);
        return listaCoches;
    }

    @Override
    public void findAuto(Auto coche) {
        for (Auto i : listaCoches){
            if (i == coche){
                System.out.println(i + " se encuentra en la base de datos");
                return;
            }
        }
        System.out.println(coche + " no se encuentra en la base de datos");
    }

    @Override
    public void deleteAuto(Auto coche) {
        for (Auto i : listaCoches){
            if (i == coche) {
                listaCoches.remove(i);
                System.out.println(i + " ha sido eliminado de la base de datos");
                return;
            }
    }
        System.out.println(coche + " no se encuentra en la base de datos");
    }
}
