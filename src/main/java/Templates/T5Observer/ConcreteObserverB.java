package Templates.T5Observer;

public class ConcreteObserverB implements  IObserver{
    @Override
    public void update(String msg) {
        System.out.println(">>> ConcreteObserverB <<<");
        System.out.println(">>> Notify <<<");
        System.out.println(msg);
    }
}
