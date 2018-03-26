import java.util.Scanner;

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
 

}
