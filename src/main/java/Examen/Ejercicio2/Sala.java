package Examen.Ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sala {
    List<IPlayer> players = new ArrayList<>();
    Map<String, Sala> salas = new HashMap<>();

    public Sala addPlayer(IPlayer player){
        players.add(player);
        return this;
    }
}
