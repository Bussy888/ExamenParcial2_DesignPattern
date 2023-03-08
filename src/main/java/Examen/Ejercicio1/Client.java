package Examen.Ejercicio1;

public class Client {
    public static void main(String[] args) {
        Repositorio rep = new Repositorio();
        Versionador ver = new Versionador();

        Texto texto = new Texto("este documento es una prueba");
        ver.setVersion(texto);
        rep.createMemento(ver.createVersion());

        texto = new Texto(texto.getTexto()+" el exito solo depende de tu esfuerzo");
        ver.setVersion(texto);
        rep.createMemento(ver.createVersion());

        texto = new Texto(texto.getTexto()+ "prologo");
        ver.setVersion(texto);
        rep.createMemento(ver.createVersion());

        texto = new Texto(texto.getTexto()+"este documento fue actualizado satisfactoriamente");
        ver.setVersion(texto);
        rep.createMemento(ver.createVersion());

        System.out.println(texto.getTexto());

        texto = ver.restoreVersion(rep.getSave("Version #1"));
        System.out.println(texto.getTexto());
    }
}
