package chainofresponsibility;

public class Main {
  public static void main(String[] args) {
    // auth -> logger -> compressor
    var compressor = new Compressor(null);
    var logger = new Logger(compressor);
    var auth = new Authenticator(logger);
    var server = new WebServer(auth);
    server.handle(new HttpRequest("test", "test"));
    server.handle(new HttpRequest("", "test"));
  }
}
