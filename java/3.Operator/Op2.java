public class Op2 {

  public static void main(String[] args) {
    //Unary operators
    // Operator	Description
    // +	Unary plus operator; indicates positive value (numbers are positive by default though)

    // -	Unary minus operator; negates an expression
    // ++	Increment operator; increments a value by 1
    // --	Decrement operator; decrements a value by 1
    // !	Logical complement operator; inverts the value of a boolean

    // unary plus operator
    int x = +5; // Positive Value
    System.out.println("x = " + x);

    // unary minus operator
    x = -x;
    System.out.println("x = " + x);

    System.out.println("-------------------------------------------");

    // Prefix Increment
    //First Increment,After increment Value Assign into Variable
    int a = 5;
    int b = ++a; // =>first value of "a" become 5+1=6 then assign into Variable b

    System.out.println("a - " + a); //6
    System.out.println("b - " + b); //6

    System.out.println("-------------------------------------------");
    // postfix
    a = 8;
    b = a++; // =>first value of "a" assign into Variable b then in the next call incerment by 1

    System.out.println("a - " + a); //Value of a is increment here: this is the next call
    System.out.println("b - " + b); //9

    System.out.println("-------------------------------------------");
    x = 6;
    int y = --x;
    System.out.println("x - " + x); //5
    System.out.println("y - " + y); //5

    System.out.println("-------------------------------------------");
    a = 9;
    b = a--;
    System.out.println("a - " + a); //8
    System.out.println("b - " + b); //9

    System.out.println("-------------------------------------------");
    boolean flag = false;
    System.out.println("flag = " + flag);
    // logical component operator
    System.out.println("flag = " + !flag);
  }
}
