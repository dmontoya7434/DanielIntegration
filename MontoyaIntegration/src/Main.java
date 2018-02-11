
// Daniel Montoya
// This integration project is on skills that I learned.
// 50 lines of code 
import java.util.Scanner;

public class main {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to my integration project!");
    System.out.println();
    int num1;
    System.out.println("Enter a number to determine if its odd or even number");
    num1 = in.nextInt();
    if (num1 % 2 == 0)
      System.out.println("The number entered is an even number");
    else
      System.out.println("The number entered is odd");
        
  }

}
