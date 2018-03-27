
public class Car {
  private String color;

  public Car() { // constructor
    color = "black";
  }

  public Car(String col) { // overloaded constructor
    color = "col";
  }

  public String getColor() { // gets the color
    return color;
  }

  public void setColor(String b) { // sets to a specific color
    color = "black";
  }

  public static int getNumberOfCars() {
    return numberOfCars;
  }

  public static void setNumberOfCars(int numberOfCars) {
    Car.numberOfCars = numberOfCars;
  }

  private static int numberOfCars = 0;

}
