package csnam.edu.tdd.models;

/**
 * @project tddmoneyexample
 * @user jp
 * @date 2019-03-01
 */
public class Dollar extends Money {

  public Dollar(int amount) {
    this.amount = amount;
  }

  public Dollar times(int multiplier) {
    return new Dollar(amount * multiplier);
  }
}
