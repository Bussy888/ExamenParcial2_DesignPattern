package Examen.Ejercicio3;

public interface IPagina {
    void add(IUsuario usuario);
    void remove(IUsuario usuario);
    void notify(INotificacion notificacion);
}
