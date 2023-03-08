package Examen.Ejercicio3;

public class Client {
    public static void main(String[] args) {
        Web web = new Web();
        Usuario u1 = new Usuario("Mateo",true);
        Usuario u2 = new Usuario("Juan ", false);
        Usuario u3 = new Usuario("Marco",true);
        Usuario u4 = new Usuario("Ezequiel ", false);
        Usuario u5 = new Usuario("Lucas",true);

        web.add(u1);
        web.add(u2);
        web.add(u3);
        web.add(u4);
        web.add(u5);

        web.notify(new Video());
        System.out.println();
        web.notify(new Imagen());
       }
}
