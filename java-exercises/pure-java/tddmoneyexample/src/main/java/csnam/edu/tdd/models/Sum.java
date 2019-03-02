package csnam.edu.tdd.models;

import csnam.edu.tdd.daos.Expression;

/**
 * @project tddmoneyexample
 * @user jp
 * @date 2019-03-02
 */
public class Sum implements Expression {

  public Money augend;
  public Money addend;

  public Sum(Money augend, Money addend) {
  }
}
