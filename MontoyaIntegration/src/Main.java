
// Daniel Montoya
// This integration project is on skills that I learned.

import java.util.Scanner;

public class Main {
  private static double calculateBMI(double weight, int height) {

    double BMI = (weight * 703) / (height * height);
    return BMI;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Welcome to my integration project!");
    System.out.println("This program will calculate your Body Mass Index");

    System.out.println("Enter the patient's first name: ");
    String firstName = in.nextLine();
    System.out.println("Enter the patient's last name: ");
    String lastName = in.nextLine();

    System.out.println("Enter the patients weight in pounds: ");
    double weight = in.nextDouble();
    System.out.println("Enter the patient's height in inches: ");
    int height = in.nextInt();
    
    double BMI = calculateBMI(weight, height); // Calling the Calculate method
                                               // and setting it as the value
                                               // for BMI
    System.out.println("The patient " + firstName.substring(0, 1).toUpperCase()
        + firstName.substring(1) + " " + lastName.substring(0, 1).toUpperCase()
        + lastName.substring(1) + " has a Body Mass Index of: "
        + Math.round(BMI)); // Runs a substring to capitalize the first letter
                            // in each word

    if (BMI < 18.5) {// Determines what your BMI signifies
      System.out.print("You are considered Underweight");
    }

    else if (BMI >= 18.5 && BMI < 25) {
      System.out.print("You are considered Normal.");
    }

    else if ( BMI >= 25 && BMI < 30) {
      System.out.print("You are considered Overweight.");
    }

    else if (BMI >= 30) {
      System.out.print("You are considered Obese.");
    }
    System.out.println();

    if ((int) BMI % 2 == 0) {// Determines if your BMI is even or odd
      System.out.println("Your BMI is an even number.");
    } else {
      System.out.println("Your BMI is an odd number.");
    }
    System.out.println();

    System.out.println("This part ask for two integers");
    System.out.println("Enter a value:");
    int value1 = in.nextInt();
    System.out.println("Enter another value:");
    int value2 = in.nextInt();
    System.out.println("The sum is: " + (value1 + value2));
    System.out.println("The difference is: " + (value2 - value1));
    System.out.println();

    // This part displays the color of my car.
    System.out.println("This part will give you the color of a car.");
    Car myCar = new Car();
    myCar.setColor("Black"); // sets the color to a specific color.
    System.out.println("My car's color is " + myCar.getColor());
    // gets the color that its set to from the top.

  }
}

class Car {
  private String Color;

  public String getColor() { // gets the color
    return Color;
  }

  public void setColor(String b) { // sets to a specific color
    Color = "black";
  } 
}
