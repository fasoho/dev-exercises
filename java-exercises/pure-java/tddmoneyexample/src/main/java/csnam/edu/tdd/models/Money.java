package csnam.edu.tdd.models;

/**
 * @project tddmoneyexample
 * @user jp
 * @date 2019-03-01
 */
public class Money {
  protected int amount;

  @Override
  public boolean equals(Object object) {
    Money money = (Money) object;

    return amount == money.amount;
  }
}
