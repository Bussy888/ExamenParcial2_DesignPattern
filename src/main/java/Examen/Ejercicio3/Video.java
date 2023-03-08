package Examen.Ejercicio3;

public class Video implements  INotificacion{
    private String mensaje = "NUEVO VIDEO";


    @Override
    public String getMensaje() {
        return mensaje;
    }
}
