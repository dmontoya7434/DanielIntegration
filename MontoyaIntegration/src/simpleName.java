import java.util.Scanner;

/**
 * This is a class to demonstrate how to write a class method.
 * 
 * @author Daniel Montoya
 *
 */
public class simpleName {
  String first;
  String last;

  public simpleName() {
    first = "";
    last = "";
  }

  public simpleName(String firstName, String lastName) {
    first = firstName;
    last = lastName;
  }

  public void printName(String name) {
    System.out.println(last + "," + first);
  }

  public String getfirstName() {
    return first;
  }

  public String getlastName() {
    return last;
  }

}
