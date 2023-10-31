import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Queue210Test {

  @Test
  public void testGetters() {
    OurQueue<Double> buffer = new Queue210<>();
    assertTrue(buffer.isEmpty());
    assertEquals(0, buffer.size());
    buffer.enqueue(1.1);
    buffer.enqueue(2.2);
    assertEquals(2, buffer.size());
  }
}
