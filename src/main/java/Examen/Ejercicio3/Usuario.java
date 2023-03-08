package Examen.Ejercicio3;

public class Usuario implements IUsuario{
    private String nombre;
    private boolean isVideo;

    public Usuario(String nombre, boolean isVideo) {
        this.nombre = nombre;
        this.isVideo = isVideo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(INotificacion notificacion) {
        System.out.println(nombre+"--> "+notificacion.getMensaje());
    }

    @Override
    public boolean isVideo() {
        return isVideo;
    }
}
