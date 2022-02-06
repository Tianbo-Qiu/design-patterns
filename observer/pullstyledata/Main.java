package observer.pullstyledata;

public class Main {
  public static void main(String[] args) {
    var pub = new ConcretePublisher();
    var sub = new ConcreteSubscriber(pub);
    pub.addObserver(sub);
    pub.setValue(1);
  }
}
