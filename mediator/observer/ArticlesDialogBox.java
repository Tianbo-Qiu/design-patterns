package mediator.observer;

public class ArticlesDialogBox {

  private ListBox articlesListBox = new ListBox();
  private TextBox titleTextBox = new TextBox();
  private Button saveButton = new Button();

  public ArticlesDialogBox() {
    articlesListBox.attach(new Observer() {
      @Override
      public void update() {
        articleSelected();
      }
    });
    titleTextBox.attach(new Observer() {
      @Override
      public void update() {
        titleChanged();
      }
    });
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

  private void articleSelected() {
    titleTextBox.setContent(articlesListBox.getSelection());
    saveButton.setEnabled(true);
  }

  private void titleChanged() {
    var content = titleTextBox.getContent();
    saveButton.setEnabled(content != null && !content.isEmpty());
  }

}
