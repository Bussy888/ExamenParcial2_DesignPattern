package Examen.Ejercicio2;

public interface IPlayer {
    String getAlias();
    String getNombre();
    String getRanking();

    void recibir(String mensaje, IPlayer emisor);
}
