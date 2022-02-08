package mediator.events;

public class ArticlesDialogBox {

  private ListBox articlesListBox = new ListBox();
  private TextBox titleTextBox = new TextBox();
  private Button saveButton = new Button();

  public ArticlesDialogBox() {
    articlesListBox.addEventHandler(this::articleSelected);
    titleTextBox.addEventHandler(this::titleChanged);
  }

  public void simulateUserInteractionSelect() {
    articlesListBox.setSelection("Article 1");
    System.out.println("TextBox: " + titleTextBox.getContent());
    System.out.println("Button: " + saveButton.isEnabled());
  }

  public void simulateUserInteractionUnSelect() {
    titleTextBox.setContent("");
    System.out.println("TextBox: " + titleTextBox.getContent());
    System.out.println("Button: " + saveButton.isEnabled());
  }

  /**
   * Event handler of articlesListBox.
   */
  private void articleSelected() {
    titleTextBox.setContent(articlesListBox.getSelection());
    saveButton.setEnabled(true);
  }

  /**
   * Event handler of titleTextBox.
   */
  private void titleChanged() {
    var content = titleTextBox.getContent();
    saveButton.setEnabled(content != null && !content.isEmpty());
  }

}
