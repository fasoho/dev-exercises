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
    Dollar product = five.times(2);
    assertEquals(10, product.amount);
    product = five.times(3);
    assertEquals(15, product.amount);
  }
}
