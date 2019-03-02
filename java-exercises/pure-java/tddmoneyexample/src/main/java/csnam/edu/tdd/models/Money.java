package csnam.edu.tdd.models;

/**
 * @project tddmoneyexample
 * @user jp
 * @date 2019-03-01
 */
public abstract class Money {

  protected int amount;

  public static Money dollar(int amount) {
    return new Dollar(amount);
  }

  public static Franc franc(int amount) {
    return new Franc(amount);
  }

  @Override
  public boolean equals(Object object) {
    Money money = (Money) object;

    return amount == money.amount && getClass().equals(money.getClass());
  }

  public abstract Money times(int multiplier);
}
