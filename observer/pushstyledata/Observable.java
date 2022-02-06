package observer.pushstyledata;

import java.util.ArrayList;
import java.util.List;

/**
 * T is the type of the data that is passed
 * from the publisher when notifying observers.
 */
public class Observable<T> {
  private List<Observer<T>> observers = new ArrayList<>();

  public void addObserver(Observer<T> observer) {
    // make sure we won't register the same observer twice
    if (!observers.contains(observer)) {
      observers.add(observer);
    }
  }

  public void removeObserver(Observer<T> observer) {
    observers.remove(observer);
  }

  public void notifyObservers(T value) {
    for (var observer : observers) {
      observer.update(value);
    }
  }
}
