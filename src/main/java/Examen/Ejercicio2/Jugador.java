package Examen.Ejercicio2;

public class Jugador implements IPlayer{
    private String alias;
    private String nombre;
    private String ranking;
    private IChat chat;

    public Jugador(String alias, String nombre, String ranking, IChat chat) {
        this.alias = alias;
        this.nombre = nombre;
        this.ranking = ranking;
        this.chat = chat;
    }
    public void send(String mensaje){
        chat.send(mensaje, this, null, "");
    }
    public void send(String mensaje, IPlayer receptor){
        chat.send(mensaje, this, receptor, "");
    }
    public void sendAll(String mensaje, String sala){
        chat.send(mensaje,this,null,sala);
    }

    @Override
    public String getAlias() {
        return alias;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getRanking() {
        return ranking;
    }

    @Override
    public void recibir(String mensaje, IPlayer emisor) {
        System.out.println(nombre+" tienes un mensaje:" + mensaje);
        System.out.println("Del jugador: "+emisor.getNombre());
    }
}
