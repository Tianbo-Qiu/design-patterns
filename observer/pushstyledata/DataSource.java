package observer.pushstyledata;

public class DataSource extends Observable<Integer> {
  private int value;

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
    notifyObservers(value);
  }
}
