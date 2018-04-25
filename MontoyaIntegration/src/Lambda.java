
public class Lambda {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
Lambda tester = new Lambda();
    
    // A lambda expression consists of the following: 
    //  A comma-separated list of formal parameters enclosed in parentheses. 
    //  In addition, you can omit the parentheses if there is only one parameter. 
    //  The arrow token, ->
    
  //with type declaration
    MathOperation addition = (int a, int b) -> a + b;
  
    //with out type declaration
    MathOperation subtraction = (a, b) -> a - b;
    
    System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
    System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
  }
  interface MathOperation {
    int operation(int a, int b);
 }

 private int operate(int a, int b, MathOperation mathOperation) {
    return mathOperation.operation(a, b);
 }

  }

