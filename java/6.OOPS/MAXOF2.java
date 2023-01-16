import java.util.Scanner;

public class MAXOF2 {

//properties
int a;
int b;
MAXOF2(int x,int y){
    this.a=x;
    this.b=y;
}
   

   //! this method is Compare between two Values, and return the Largest number
   public int compare(int m,int n){
    if(m>n){
        return m;
    }else{
        return n;
    }
  }

  //! this method is return the result as Value.
   public int ResultReturn(){
    return compare(this.a, this.b);
   }

  //! this method is print the result as Statement in Output Console.
   public void ResultPrint(){
    System.out.println("Big number is:"+compare(this.a, this.b));
   }

   public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int a = sc.nextInt();

        System.out.println("Enter Second Number:");
        int b = sc.nextInt();




        MAXOF2 abc=new MAXOF2(a, b);

        int result1 = abc.compare(a, b);
        int result2 = abc.ResultReturn();



        abc.ResultPrint();
        System.out.println("Maximum Number is from Result 1:" + result1);
        System.out.println("Maximum Number is from Result 2:" + result2);

        
   }


    
}
