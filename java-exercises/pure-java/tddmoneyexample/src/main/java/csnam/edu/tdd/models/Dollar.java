package csnam.edu.tdd.models;

/**
 * @project tddmoneyexample
 * @user jp
 * @date 2019-03-01
 */
public class Dollar {

  public int amount;

  public Dollar(int amount) {
    this.amount = amount;
  }

  public Dollar times(int multiplier) {
    amount *= multiplier;
    return null;
  }
}
