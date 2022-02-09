package chainofresponsibility;

public class Authenticator extends Handler {
  public Authenticator(Handler next) {
    super(next);
  }

  @Override
  public boolean doHandle(HttpRequest request) {
    var isValid = (request.getUsername() == "test" &&
        request.getPassword() == "test");
    System.out.println("Authentication user:" + request.getUsername());
    return !isValid;
  }
}
