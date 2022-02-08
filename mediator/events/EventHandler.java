package mediator.events;

// Functional interface (single method)
public interface EventHandler {
  void handle();
}

// () -> {} or this::method for lambdas
