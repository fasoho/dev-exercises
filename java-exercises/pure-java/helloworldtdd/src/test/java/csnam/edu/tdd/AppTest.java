package csnam.edu.tdd;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

  @Test
  public void testHelloworldEmpty() throws Exception {
    Greeting greeting = new Greeting();
    assertEquals(greeting.getName(), "");
    assertEquals(greeting.getMessage(), "Hello World");
  }
}
