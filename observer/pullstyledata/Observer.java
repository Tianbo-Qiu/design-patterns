package observer.pullstyledata;

public abstract class Observer<T> {
  protected DataSource<T> dataSource;

  protected Observer(DataSource<T> dataSource) {
    this.dataSource = dataSource;
  }

  public abstract void update();
}
