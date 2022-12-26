import java.util.Scanner;

/**========================================================================
 **                           
 
 *?  What does it do?
 while(boolean cond....){

    loop Statement......;

    increment/decriment;

 }
*========================================================================**/

public class WhileLoopEX {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Start");

        int i=sc.nextInt();

        System.out.println("Enter your End");

        int j=sc.nextInt();
        

        while(i<=j){

            System.out.println(i);

            i++;
        }
    } 
}
