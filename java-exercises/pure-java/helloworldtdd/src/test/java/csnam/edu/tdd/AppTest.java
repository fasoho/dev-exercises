package csnam.edu.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import csnam.edu.tdd.models.Greeting;
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
