
public class Con1{
    // Constructor is a block of code that initializes the newly created object.
    //Name of Constructor is same with class name
    //Constructor dose not have any return type
      int id;
      String name;
    //Constructor
    // Con1(){
    //     System.out.println("Constructur invoked");
    // }
    //parameterized Constructor
    Con1(int i,String n){
        this.id=i;
        this.name=n;
    }
    public static void main(String []args){
        //object of Con1 Class



        Con1 obj=new Con1(12,"Debasish");



        


        System.out.println(obj.id);
        System.out.println(obj.name);
    }
}