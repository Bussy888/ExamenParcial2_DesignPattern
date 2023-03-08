package Examen.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Web implements IPagina{
    private List<IUsuario> usuarios = new ArrayList<>();


    @Override
    public void add(IUsuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void remove(IUsuario usuario) {
        usuarios.remove(usuario);
    }

    @Override
    public void notify(INotificacion notificacion) {
        System.out.println("Notificacion --> "+notificacion.getMensaje()+"______");
        for(IUsuario u : usuarios){
            if(notificacion instanceof Video && u.isVideo()){
                u.update(notificacion);
            } else if (!u.isVideo()) {
                u.update(notificacion);

            }
        }
    }
}
