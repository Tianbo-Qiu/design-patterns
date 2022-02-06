package command.editor;

public class Main {
  public static void main(String[] args) {
    // stores a list of commands instead of
    // snapshots of states in momento pattern
    var history = new History();
    var document = new HtmlDocument();
    document.setContent("Hello World");
    var boldCommand = new BoldCommand(document, history);
    boldCommand.execute();
    System.out.println(document.getContent());
    var undoCommand = new UndoCommand(history);
    undoCommand.execute();
    System.out.println(document.getContent());
  }
}
