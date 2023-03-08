package Templates.T5Observer;

public interface ISubject {
    void attach (IObserver observer);
    void deattach (IObserver observer);
    void notifyObservers();
}
