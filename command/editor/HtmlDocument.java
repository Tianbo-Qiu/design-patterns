package command.editor;

/**
 * Business layer of our application.
 * Knows nothing about the command.
 */
public class HtmlDocument {
  private String content;

  public void makeBold() {
    content = "<b>" + content + "</b>";
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

}
