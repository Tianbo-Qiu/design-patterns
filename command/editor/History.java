package command.editor;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Helper of the Command which tracks the history
 * of commands.
 *
 */
public class History {
  private Deque<UndoableCommand> commands = new ArrayDeque<>();

  public void push(UndoableCommand command) {
    commands.add(command);
  }

  public UndoableCommand pop() {
    return commands.pop();
  }

  public int size() {
    return commands.size();
  }
}
