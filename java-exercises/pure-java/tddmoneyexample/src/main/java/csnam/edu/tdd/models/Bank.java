package csnam.edu.tdd.models;

import csnam.edu.tdd.daos.Expression;

/**
 * @project tddmoneyexample
 * @user jp
 * @date 2019-03-02
 */
public class Bank {

  public Money reduce(Expression source, String to) {
    Sum sum = (Sum) source;
    return sum.reduce(to);
  }
}
