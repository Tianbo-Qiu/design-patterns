package command;

import command.fx.Button;

public class Main {
  public static void main(String[] args) {
    var service = new CustomerService();
    var command = new AddCustomerCommand(service);
    var button = new Button(command);
    button.click();
    // hold commands and support replays
    var composite = new CompositeCommand();
    composite.add(new ResizeCommand());
    composite.add(new CropCommand());
    composite.execute();
    // replay
    composite.execute();
  }
}
