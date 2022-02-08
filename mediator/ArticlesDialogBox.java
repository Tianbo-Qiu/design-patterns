package mediator;

/**
 * The concrete class of the mediator of
 * UIControl classes which implements the
 * interaction logic.
 */
public class ArticlesDialogBox extends DialogBox {
  private ListBox articlesListBox = new ListBox(this);
  private TextBox titleTextBox = new TextBox(this);
  private Button saveButton = new Button(this);

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

  @Override
  public void changed(UIControl control) {
    if (control == articlesListBox) {
      articleSelected();
    } else if (control == titleTextBox) {
      titleChanged();
    }
  }

  private void articleSelected() {
    titleTextBox.setContent(articlesListBox.getSelection());
    saveButton.setEnabled(true);
  }

  private void titleChanged() {
    var content = titleTextBox.getContent();
    saveButton.setEnabled(content != null && !content.isEmpty());
  }
}
