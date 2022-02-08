package mediator;

public class ListBox extends UIControl {
  public ListBox(DialogBox dialogBox) {
    super(dialogBox);
  }

  private String selection;

  public String getSelection() {
    return selection;
  }

  public void setSelection(String selection) {
    this.selection = selection;
    // hey I'm changed
    dialogBox.changed(this);
  }
}
