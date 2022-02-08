package mediator;

public class TextBox extends UIControl {
  public TextBox(DialogBox dialogBox) {
    super(dialogBox);
  }

  private String content;

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
    dialogBox.changed(this);
  }
}
