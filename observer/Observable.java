package observer;

import java.util.ArrayList;
import java.util.List;

// Subject, or the publisher
public class Observable {
  private List<Observer> observers = new ArrayList<>();

  public void addObserver(Observer observer) {
    // make sure we won't register the same observer twice
    if (!observers.contains(observer)) {
      observers.add(observer);
    }
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObservers() {
    for (var observer : observers) {
      observer.update();
    }
  }
}
