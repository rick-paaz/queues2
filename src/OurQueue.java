/**
 * A queue ADT
 * 
 * @param <Type> Allow for a queue of any type.
 * 
 * @author Rick Mercer
 */
public interface OurQueue<Type> {
  
	/**
	 * Returns the number of elements currently in the queue.
	 */
	public int size();

	/**
	 * Returns true if this queue has zero elements.
	 */
	public boolean isEmpty();

	/**
	 * Add element as the "last" element in this Queue.
	 */
	public void enqueue(Type element);

	/**
	 * Removes the element at the front" of the queue and returns its value.
	 * If the queue is empty, throw new CapacityException();
	 */
	public Type dequeue() throws CapacityException;

	/**
	 * Returns the value of the element at the front of the Queue.
   * If the queue is empty, throw new CapacityException();
	 */
	public Type peek() throws CapacityException;
}