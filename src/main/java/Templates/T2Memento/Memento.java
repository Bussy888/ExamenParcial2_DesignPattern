package Templates.T2Memento;

public class Memento {

    private ConcreteObject concreteObject;

    public Memento(ConcreteObject concreteObject) {
        this.concreteObject = concreteObject;
    }

    public ConcreteObject getConcreteObject() {
        return concreteObject;
    }
}
