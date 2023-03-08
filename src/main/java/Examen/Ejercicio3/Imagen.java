package Examen.Ejercicio3;

public class Imagen implements  INotificacion{
    private String mensaje = "NUEVA IMAGEN";


    @Override
    public String getMensaje() {
        return mensaje;
    }
}
