package mediator;

/**
 * The base class for all user interaction classes.
 */
public class UIControl {
  // the mediator
  protected DialogBox dialogBox;

  public UIControl(DialogBox dialogBox) {
    this.dialogBox = dialogBox;
  }
}
