public class Op5 {

  public static void main(String[] args) {
    //Short-circuiting behavior

    
    if (getCompValue1(7) && getCompValue2(5)) {
      System.out.println("Conditional expression evaluates to true");
    } 
    else 
    {
      System.out.println("Conditional expression evaluates to false");
    }
  }

  static boolean getCompValue1(int num) {
    System.out.println("In getCompValue1 with value " + num);
    return num > 8;
  }

  static boolean getCompValue2(int num) {
    System.out.println("In getCompValue2 with value " + num);
    return num > 6;
  }
}
