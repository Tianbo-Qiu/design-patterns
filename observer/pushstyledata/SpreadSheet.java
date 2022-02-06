package observer.pushstyledata;

public class SpreadSheet implements Observer<Integer> {
  private String name;

  public SpreadSheet(String name) {
    this.name = name;
  }

  @Override
  public void update(Integer value) {
    System.out.println(name + ": received value from the publisher\n\t" + value);
  }
}
