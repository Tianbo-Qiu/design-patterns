package iterator;

public class Main {
  public static void main(String[] args) {
    var history = new BrowseHistory();
    history.push("https://a.com");
    history.push("https://b.io");
    history.push("https://c.net");
    var iterator = history.createIterator();
    while (iterator.hasNext()) {
      System.out.println("visited " + iterator.current());
      iterator.next();
    }
  }
}
