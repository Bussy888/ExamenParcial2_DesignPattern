package Examen.Ejercicio1;

public class Memento {
    private Texto texto;
    public Memento(Texto texto){
        this.texto = texto;
    }
    public Texto getTexto(){
        return texto;
    }
}
