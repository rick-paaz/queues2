/**
 * You can use this in Queue210 like this: throw new CapacityException();
 */
public class CapacityException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public CapacityException() {
    super("You either tried to dequeue() or peek() and empty queue");
  }
}