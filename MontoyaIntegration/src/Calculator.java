/**
 * This is a class to demonstrate a lambda expression
 * @author Daniel Montoya
 *
 */
public class Calculator {
  interface IntegerMath {
    int operation(int a, int b);
  }

  public int operateBinary(int a, int b, IntegerMath op) {
    return op.operation(a, b);
  }

}
