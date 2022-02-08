package mediator;

public class Button extends UIControl {
  public Button(DialogBox dialogBox) {
    super(dialogBox);
  }

  private boolean isEnabled;

  public boolean isEnabled() {
    return isEnabled;
  }

  public void setEnabled(boolean isEnabled) {
    this.isEnabled = isEnabled;
    dialogBox.changed(this);
  }
}
