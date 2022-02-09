package chainofresponsibility;

public abstract class Handler {
  private Handler next;

  public Handler(Handler next) {
    this.next = next;
  }

  public void handle(HttpRequest request) {
    if (doHandle(request)) {
      return;
    }

    if (next != null) {
      next.handle(request);
    }
  }

  /**
   * Returns true to end the chain of
   * requests, otherwise return true to
   * continue with the chain.
   * 
   * @param request
   * @return
   */
  public abstract boolean doHandle(HttpRequest request);
}
