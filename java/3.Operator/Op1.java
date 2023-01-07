public class Op1 {
    public static void main(String []args){
        //Void means the main function is return nothing
        //Compound assignment operators**
        // Operator	Description
        // +=	Addition assignment
        // –=	Subtraction assignment
        // *=	Multiplication assignment
        // /=	Division assignment
        // %=	Modulus assignment

        //n=n+1
        //n +=1

        int x = 5;
        int y = 6;
        int z = 7;
        int p = 4;
        int q = 16;
        
        x += 4;
        //5 += 4=> 5+4=9
        System.out.println("x - " + x);
        
        y -= 2;
        //6 -=2 =>6-2=4
        System.out.println("y - " + y);
        
        z *= 3;
        //7 *=3  =>7*3 =21
        System.out.println("z - " + z);
        
        p /= 2;
        // 4 /=2 =>4/2 = 2
        System.out.println("p - " + p);
        
        q %= 3;
        // 16 %=3 => 16%3 =1        
        System.out.println("q - " + q);
      








    }
}