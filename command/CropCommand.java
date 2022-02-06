package command;

import command.fx.Command;

public class CropCommand implements Command {

  @Override
  public void execute() {
    System.out.println("crop");
  }
}
