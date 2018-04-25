
public class Student extends Person { // inheritance is an "is a" relationship

  public Student() { // this demonstrates inheritance
    super(22);
  }

  public void printIntfo() {
    super.printIntfo();
    System.out.println("I am a student");
    
  }

}
