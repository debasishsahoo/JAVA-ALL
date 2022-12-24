public class Logic3 {
    //IF Locgic
    public static void main(String[] args) {    
        int x = 10;    
        int y = 12; 
        int z = 30; 
        
        if(x+y > z) {   
          //if the Condition is True then the this Block will Excute. 
            System.out.println("This is Inside the If Block");
            System.out.println("x + y is greater than 30");  
        }  
        else if(x+y < z){
           //if the top if Condition is false and this condition is true then this Block will Excute. 
            System.out.println("This is Inside the Else-If Block");
            System.out.println("x + y is Less than 30");   
        }
        else{
            //if the all the Condition is False then the this Block will Excute. 
                System.out.println("This is Inside the Else Block");
                System.out.println("x + y is Equal to 30");   
            }


        System.out.println("This is Out Side of the any Logic Block"); 
        }     
}