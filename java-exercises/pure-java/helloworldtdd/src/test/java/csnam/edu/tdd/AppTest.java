package csnam.edu.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import csnam.edu.tdd.models.Greeting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

  private Greeting greeting;

  @BeforeEach
  public void setUp() throws Exception {
    greeting = new Greeting();
  }

  @Test
  public void testHelloworldEmpty() throws Exception {
    assertEquals(greeting.getName(), "");
    assertEquals(greeting.getMessage(), "Hello World");
  }

  @Test
  public void testHelloworldWithName() {
    greeting.setName("Tommy");
    assertEquals(greeting.getName(), "Tommy");
    assertEquals(greeting.getMessage(),"Hello Tommy");
  }
}
