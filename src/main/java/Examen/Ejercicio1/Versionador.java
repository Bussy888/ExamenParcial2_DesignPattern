package Examen.Ejercicio1;

import org.w3c.dom.Text;

public class Versionador {
    private Texto texto;
    public Texto getTexto(){
        return texto;
    }
    public void setVersion(Texto texto){
        this.texto = texto;
    }

    public Memento createVersion(){
        return new Memento(texto);
    }
    public Texto restoreVersion(Memento memento){
        System.out.println("###### Restaurando Version ######");
        this.texto = memento.getTexto();
        return this.texto;
    }
}

