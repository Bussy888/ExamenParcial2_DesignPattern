package Examen.Ejercicio5;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        PC pc = new PC();
        pc.setState(new Off());
        pc.resManager();

        pc.setState(new On());
        pc.resManager();

        pc.setState(new Restart());
        pc.resManager();
    }
}
