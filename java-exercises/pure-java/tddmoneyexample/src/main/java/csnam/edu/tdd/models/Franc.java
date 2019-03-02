package csnam.edu.tdd.models;

/**
 * @project tddmoneyexample
 * @user jp
 * @date 2019-03-01
 */
public class Franc extends Money {

  public Franc(int amount) {
    this.amount = amount;
  }

  public Money times(int multiplier) {
    return new Franc(amount * multiplier);
  }
}
