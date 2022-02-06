package command.editor;

/**
 * Another way to undo while the momento pettern
 * will save snapshots of the state.
 */
public interface UndoableCommand extends Command {
  void unexecute();
}
