package observer.pullstyledata;

public class ConcretePublisher extends Observable<Integer> implements DataSource<Integer> {
  private int value;

  @Override
  public Integer getData() {
    return getValue();
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
    notifyObservers();
  }
}
