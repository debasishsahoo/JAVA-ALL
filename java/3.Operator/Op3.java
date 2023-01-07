import javax.swing.text.Style;

public class Op3 {

  public static void main(String[] args) {
    //Equality and Relational operators
    //Operator	Description
    // ==	equal to
    // !=	not equal to
    // >	greater than
    // >=	greater than or equal to
    // <	less than
    // <=	less than or equal to

    // =  => Assignment Operator

    // == => equal to Operator(it is checked only Value)
    //  5 == "5"  =>true

    // === => equal to Operator(it is checked Value and Data type)
    // 5 === "5"  =>false

    int a = 7;
    int b = 5;
    int c = 7;
    
    // This should get printed
    if(a == c){
      System.out.println("Values of a and c are equal");
    }
        
    // This won't be printed
    if(a == b){
      System.out.println("Values of a and b are equal");
    }
    
    if(a != b){
      System.out.println("Values of and b are not equal");
    }
    
    if(a > b){
      System.out.println("a is greater than b");
    }
        
    if(a >= c){
      System.out.println("a is greater than or equal to c");
    }
    
    // This won't be printed
    if(a < b){
      System.out.println("a is less than b");
    }
    
    if(b < a){
      System.out.println("b is less than a");
    }

   


  }
}
