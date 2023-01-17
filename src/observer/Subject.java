package observer;

import java.util.List;

public class Subject {
    List<Observer> observerCollection;

    public List<Observer> registerObserver(Observer a) {
        observerCollection.add(a);
        return observerCollection;
    }

    public List<Observer> unregisterObserver(Observer a) {
        observerCollection.remove(a);
        return observerCollection;
    }

    public void notifyObservers() {
        for (Observer a : observerCollection) {
            a.update();
        }
    }
}