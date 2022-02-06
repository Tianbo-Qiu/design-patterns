package observer.pullstyledata;

public class ConcreteSubscriber extends Observer<Integer> {

  protected ConcreteSubscriber(DataSource<Integer> dataSource) {
    super(dataSource);
  }

  @Override
  public void update() {
    System.out.println("Received update with value:\n\t" + dataSource.getData());
  }

}
