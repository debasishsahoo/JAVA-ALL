public class Op4 {

  public static void main(String[] args) {
    // Conditional operator
    int a = 7;
    int b = 8;
    int c = 5;

    // Conditional-AND
    // A      B     A&&B
    // False False  False
    // True  False  False
    // True  True   True
    // True  False  False

    // This condition evaluates to true
    if ((a > c) && (b > c)) {
      System.out.println("Statement one:a and b both are greater than c");
    }
    // This condition evaluates to false
    if ((a < c) && (b > c)) {
      System.out.println("Statement two: a and b both are greater than c");
    }
    //Conditional-OR
    //  A	   B	A||B
    // False False	False
    // True	 False	True
    // True	 True	  True
    // False	 True	True

    // This condition evaluates to true
    if ((a < c) || (b > c)) {
      System.out.println("OR Condition (a < c) OR (b > c) ");
    }

    // This condition evaluates to true
    if (((a > c) && (b > c)) || (c < 3)) {
      System.out.println(
        "Both AND and OR used - First expression (a > c) && (b > c) is true so OR condition is true "
      );
    }

    
  }
}
