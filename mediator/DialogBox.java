package mediator;

/**
 * The abstract mediator class for UIControl
 */
public abstract class DialogBox {
  /**
   * When the state of a UIControl changes,
   * it will call this method.
   * 
   * @param control
   */
  public abstract void changed(UIControl control);

  /**
   * Optionally provide some common
   * behaviors to all dialog boxes.
   */
  // public method1...
  // protected method2...
}
