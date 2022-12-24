public class Logic4 {
    public static void main(String[] args) {    
        int x = 10;    
        int y = 12; 
        int z = 30; 
        
        if(x+y > z) {
            System.out.println("Inside IF Block");
                if(x>y){System.out.println("x+y is grater then 30 and x is grater then y");}
                else{System.out.println("x+y is grater then 30 and y is grater then x");}
           
        }  
        else{
            System.out.println("Inside ELSE Block");
                if(x>y){System.out.println("x+y is less then 30 and x is grater then y");}
                else{System.out.println("x+y is less then 30 and y is grater then x");} 
                }


        System.out.println("This is Out Side of the any Logic Block"); 
        } 
}
