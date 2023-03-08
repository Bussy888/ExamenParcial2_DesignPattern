package Examen.Ejercicio3;

public class Video implements  INotificacion{
    private String mensaje = "NUEVA VIDEO";


    @Override
    public String getMensaje() {
        return mensaje;
    }
}
