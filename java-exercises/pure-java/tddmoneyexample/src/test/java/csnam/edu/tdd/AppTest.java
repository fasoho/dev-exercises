package csnam.edu.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import csnam.edu.tdd.models.Dollar;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    five.times(2);
    assertEquals(10, five.amount);
  }
}
