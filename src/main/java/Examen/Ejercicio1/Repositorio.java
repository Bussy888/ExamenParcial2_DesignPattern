package Examen.Ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class Repositorio {
    private Map<String, Memento> versiones = new HashMap<>();
    private int indice = 1;
    private int tamano = 0;

    public void createMemento(Memento m){
        if (m.getTexto().getTexto().split(" ").length - tamano >= 5){
            versiones.put("Version #"+indice, m);
            indice++;
            tamano = m.getTexto().getTexto().split(" ").length;
        }
    }

    public Memento getSave(String formato){
        return versiones.get(formato);
    }
}
