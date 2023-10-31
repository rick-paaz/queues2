/**
 * This collection class model a queue. When attempting to add new elements and the
 * queue is full or dequeue from an empty OurQueue, throw new CapacityException();
 */
public class Queue210<Type> implements OurQueue<Type> {

//  public static double SAMPLING_RATE = 44100;
  private int n;
  private Object[] values;
  private int first, last;
  
  public Queue210() {
    n = 0;
    values = new Object[10000];
    first = 0;
    last = -1;
  }

  /**
   * The size() method returns the number of elements currently in this Queue
   */
  public int size() {
    return n;
  }

  /**
   * Returns true if the Queue is empty
   */
  public boolean isEmpty() {
    // TODO: Implement this method
    return n == 0;
  }

  /**
   * This method puts element x into the Queue. Since the Queue is a
   * The element being inserted should be added at the end of the queue
   * 
   * @throws CapacityException
   *           when attempting to enqueue to a full queue
   */
  public void enqueue(Type x) {
    last = (last + 1) % values.length;
    values[last] = x;
    n++;
  }

  /**
   * Removes the first element from the Queue and returns it.
   * 
   * @throws CapacityException
   *           when attempting to dequeue from an empty queue
   */
  public Type dequeue() throws CapacityException {
    if (this.isEmpty())
      throw new CapacityException();

    @SuppressWarnings("unchecked")
    Type temp = (Type)values[first];
    first = (first + 1) % values.length;
    n--;
    return temp;
  }

  /**
   * Returns the first element from the Queue and does NOT remove it from
   * this Queue
   * 
   * @throws CapacityException
   *           when attempting to peek an empty queue
   */
  @SuppressWarnings("unchecked")
  public Type peek() throws CapacityException {
    if (this.isEmpty())
      throw new CapacityException();
    return (Type)values[first];
  }
}
