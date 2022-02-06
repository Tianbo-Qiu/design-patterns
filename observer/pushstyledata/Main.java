package observer.pushstyledata;

public class Main {
  public static void main(String[] args) {
    var dataSource = new DataSource();
    var sheet1 = new SpreadSheet("Sheet1");
    var sheet2 = new SpreadSheet("Sheet2");
    dataSource.addObserver(sheet1);
    // no effect, the same observer won't be registered twice
    dataSource.addObserver(sheet1);
    dataSource.addObserver(sheet2);
    dataSource.setValue(1);
  }
}
