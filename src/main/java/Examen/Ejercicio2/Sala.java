package Examen.Ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sala implements IChat{
    List<IPlayer> players = new ArrayList<>();
    Map<String, Sala> salas = new HashMap<>();

    public Sala addPlayer(IPlayer player){
        players.add(player);
        return this;
    }

    public void setSalas(Map<String, Sala> salas) {
        this.salas = salas;
    }
    public void addSalas(Sala sala, String nombre){
        salas.put(nombre, sala);
    }
    public void recibir(String mensaje, IPlayer emisor){
        send(mensaje, emisor, null, "");
    }
    public void iterar(String mensaje, IPlayer player){
        for (IPlayer j: players){
            if(j != player){
                j.recibir(mensaje, player);
            }
        }
    }

    @Override
    public void send(String mensaje, IPlayer emisor, IPlayer receptor, String sala) {
        if (receptor == null && sala.equals("")){
            iterar(mensaje, emisor);
        }else if(receptor != null && sala.equals("")){
            receptor.recibir(mensaje, emisor);
        } else if (!sala.equals("")) {
            iterar(mensaje, emisor);
            salas.get(sala).recibir(mensaje,emisor);

        }
    }
}
