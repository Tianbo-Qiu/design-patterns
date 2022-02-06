package observer.pullstyledata;

import java.util.ArrayList;
import java.util.List;

public class Observable<T> {
  private List<Observer<T>> observers = new ArrayList<>();

  public void addObserver(Observer<T> observer) {
    if (!observers.contains(observer)) {
      observers.add(observer);
    }
  }

  public void removeObserver(Observer<T> observer) {
    observers.remove(observer);
  }

  public void notifyObservers() {
    for (var observer : observers) {
      observer.update();
    }
  }
}
