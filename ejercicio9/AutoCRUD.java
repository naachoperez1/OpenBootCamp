package ejercicio9;

import java.util.List;

public interface AutoCRUD {
     public void save(Auto coche);
     public List<Auto> findAll();
     public void findAuto(Auto coche);
     public void deleteAuto(Auto coche);

}
