package Examen.Ejercicio2;

public class Client {
    public static void main(String[] args) {
        Sala s1 = new Sala();
        Sala s2 = new Sala();

        Jugador j1 = new Jugador("Bussy888","Mateo","286",s1);
        Jugador j2 = new Jugador("DorianAR","Dorian","123",s1);
        Jugador j3 = new Jugador("Lutyvr02","Luciano","286",s1);
        Jugador j4 = new Jugador("CArlos1","Carlos","421",s1);

        Docente d1 = new Docente("CAr123","Arturo","124",s2);
        Docente d2 = new Docente("as154","Alan","34",s2);
        Docente d3 = new Docente("Doni15","Nicolas","654",s2);
        Docente d4 = new Docente("Nicko_N","Juan","55",s2);


        s1.addSalas(s2,"docentes");
        s2.addSalas(s1,"jugadores");

        s1.addPlayer(j1).addPlayer(j2).addPlayer(j3).addPlayer(j4);
        s2.addPlayer(d1).addPlayer(d2).addPlayer(d3).addPlayer(d4);

        j1.send("Rush B", j3);
        j1.send("Atacamos o defendemos?");
        j1.sendAll("GG boyz", "docentes");


    }
}
