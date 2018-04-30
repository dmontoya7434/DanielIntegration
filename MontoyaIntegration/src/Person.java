/**
 * This is a class to demonstrate how to create a class 
 * @author Daniel Montoya
 *
 */
public class Person {
  // use abstract keyword when you are never going to use that class
  private int age;
  private String address;
  private String name;

  public Person(int a) {
    age = a;
    System.out.println("in person constructor");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void printIntfo() {
    System.out.println("I am a person");
  }

}
