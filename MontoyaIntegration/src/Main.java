
// Daniel Montoya
// This integration project is on skills that I learned.

import java.util.Scanner;

public class Main {

  // The code below this is called a header and in the () they are called the
  // parameters
  // private static double calculateBMI(double weight, int height) {
  //
  // double bmi = (weight * 703) / (height * height);
  // return bmi;
  // }

  private static simpleName getsimpleName() {// static means that it can be
                                             // accessed without requiring an
                                             // instantiation of the class to
                                             // which it belongs.
    String first;
    String last;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter first name");
    first = in.nextLine();
    System.out.println("Enter last name");
    last = in.nextLine();
    return new simpleName(first, last);
  }

  static int smallestNumber(int[] array) {
    int smallest = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i] < smallest) {
        smallest = array[i];
      }
    }
    return smallest;
  }

  static int sumArray(int array[]) {
    int sum = 0;

    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum; // return result
  }

  public static int maxArray(int[] array) {
    int max = array[0];
    for (int num : array) {
      if (num > max) {
        max = num;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    Person edgar = new Person(21);// Example of inheritance
    edgar.setName("Edgar");
    // edgar.printIntfo();

    Student jason = new Student();
    jason.setName("Jason");//
    // jason.printIntfo();

    Person[] people = new Person[2];// example of polymorphism
    people[0] = jason;
    people[1] = edgar;

    for (Person p : people) {
      p.printIntfo();// going to come from the person class and has to exist
    }

    // System.out.println("Welcome to my integration project!");
    // System.out.println("This program will calculate Body Mass Index");
    //
    // System.out.println("Enter the patient's first name: ");
    // String firstName = in.nextLine();
    // System.out.println("Enter the patient's last name: ");
    // String lastName = in.nextLine();
    //
    // System.out.println("Enter the patient's weight in pounds: ");
    // double weight = in.nextDouble();
    // System.out.println("Enter the patient's height in inches: ");
    // int height = in.nextInt();
    //
    // double bmi = calculateBMI(weight, height); // Calling the Calculate
    // // method and inside the () are arguments
    // // and setting it as the value
    // // for BMI
    // System.out.println("The patient " + firstName.substring(0,
    // 1).toUpperCase()
    // + firstName.substring(1) + " " + lastName.substring(0, 1).toUpperCase()
    // + lastName.substring(1) + " has a Body Mass Index of: "
    // + Math.round(bmi)); // Runs a substring to capitalize the first letter
    // // in each word
    //
    // if (bmi < 18.5) {// Determines what your BMI signifies
    // System.out.print("You are considered Underweight");
    // }
    //
    // else if (bmi < 25) {
    // System.out.print("You are considered Normal.");
    // }
    //
    // else if (bmi < 30) {
    // System.out.print("You are considered Overweight.");
    // }
    //
    // else {
    // System.out.print("You are considered Obese.");
    // }
    // System.out.println();
    //
    // if ((int) bmi % 2 == 0) {// Determines if your BMI is even or odd
    // System.out.println("Your BMI is an even number.");
    // } else {
    // System.out.println("Your BMI is an odd number.");
    // }
    // System.out.println();
    //
    // System.out.println("This part ask for two integers");
    // System.out.println("Enter a value:");
    // int value1 = in.nextInt();
    // System.out.println("Enter another value:");
    // int value2 = in.nextInt();
    // System.out.println("The sum is: " + (value1 + value2));
    // System.out.println("The difference is: " + (value2 - value1));
    // System.out.println();
    //
    // // This part displays the color of my car.
    // System.out.println("This part will give you the color of a car.");
    // Car myCar = new Car();
    // myCar.setColor("Black"); // sets the color to a specific color.
    // System.out.println("My car's color is " + myCar.getColor());
    // // gets the color that its set to from the top

    // System.out.println( "The name displayed is in format last name then first
    // name.");
    // simpleName someName = new simpleName("Bob", "Smith");
    // someName.printName("Name is: ");

    simpleName myName;
    myName = getsimpleName();
    System.out.println("Name in first-last formate is: " + myName.getfirstName()
        + " " + myName.getlastName());

    System.out.println();
    int array[] = { 10, 15, 3, 5 };
    int smallest = array[0];
    int index = 0;
    System.out.println(
        "The smallest number in the array is " + smallestNumber(array));
    System.out.println("The sum is " + sumArray(array));
    for (int i = 0; i < array.length; i++) {
      if (smallest > array[i]) {
        smallest = array[i];
        index = i;
      }
    }
    System.out.println(
        "The smallest number in the array is found in position: " + index);
    System.out.println("The numbers in the array are: ");
    int i = 0;
    while (i < 4) {
      System.out.print(array[i] + ",");
      i++;
    }
    System.out.println();
    int max = maxArray(array);
    System.out.println("The max number in the array is: " + max);
    System.out.println();

    System.out.println("Example of palindrome");
    String palindrome = "Dot saw I was Tod";
    StringBuilder sb = new StringBuilder(palindrome);
    sb.reverse();
    System.out.println(sb);

    System.out.println("The length of the word is: " + sb.length());

    System.out.println("The 10th letter is: " + sb.charAt(10));
  }
}

// byte: The byte data type is an 8-bit signed two's complement integer. It has
// a minimum value of -128 and a maximum value of 127 (inclusive). The byte data
// type can be useful for saving memory in large arrays, where the memory
// savings actually matters. They can also be used in place of int where their
// limits help to clarify your code; the fact that a variable's range is limited
// can serve as a form of documentation.

// short: The short data type is a 16-bit signed two's complement integer. It
// has a minimum value of -32,768 and a maximum value of 32,767 (inclusive). As
// with byte, the same guidelines apply: you can use a short to save memory in
// large arrays, in situations where the memory savings actually matters.

// int: By default, the int data type is a 32-bit signed two's complement
// integer, which has a minimum value of -231 and a maximum value of 231-1. In
// Java SE 8 and later, you can use the int data type to represent an unsigned
// 32-bit integer, which has a minimum value of 0 and a maximum value of 232-1.
// Use the Integer class to use int data type as an unsigned integer. See the
// section The Number Classes for more information. Static methods like
// compareUnsigned, divideUnsigned etc have been added to the Integer class to
// support the arithmetic operations for unsigned integers.

// long: The long data type is a 64-bit two's complement integer. The signed
// long has a minimum value of -263 and a maximum value of 263-1. In Java SE 8
// and later, you can use the long data type to represent an unsigned 64-bit
// long, which has a minimum value of 0 and a maximum value of 264-1. Use this
// data type when you need a range of values wider than those provided by int.
// The Long class also contains methods like compareUnsigned, divideUnsigned etc
// to support arithmetic operations for unsigned long.

// float: The float data type is a single-precision 32-bit IEEE 754 floating
// point. Its range of values is beyond the scope of this discussion, but is
// specified in the Floating-Point Types, Formats, and Values section of the
// Java Language Specification. As with the recommendations for byte and short,
// use a float (instead of double) if you need to save memory in large arrays of
// floating point numbers. This data type should never be used for precise
// values, such as currency. For that, you will need to use the
// java.math.BigDecimal class instead. Numbers and Strings covers BigDecimal and
// other useful classes provided by the Java platform.

// double: The double data type is a double-precision 64-bit IEEE 754 floating
// point. Its range of values is beyond the scope of this discussion, but is
// specified in the Floating-Point Types, Formats, and Values section of the
// Java Language Specification. For decimal values, this data type is generally
// the default choice. As mentioned above, this data type should never be used
// for precise values, such as currency.

// boolean: The boolean data type has only two possible values: true and false.
// Use this data type for simple flags that track true/false conditions. This
// data type represents one bit of information, but its "size" isn't something
// that's precisely defined.

// char: The char data type is a single 16-bit Unicode character. It has a
// minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535
// inclusive).
