package observer;

public interface Observable<T> {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObserver();
}
