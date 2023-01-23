public class GetterSetterMeyhodForPrivate {
    private int age;
    private String name;

    //Constructor
    GetterSetterMeyhodForPrivate(int i){
        this.age=i;
    }


    //Without using Constructor we can init private Properties to using getter & setter

    //getter method is return the Value 
    public String getName(){
        return this.name;
    }

    //setter method is assign the Value ,it will not return anything a void method
    public void setName(String n){
         this.name=n;
    }



    
}


class ABC{
    public static void main(String []args){
        GetterSetterMeyhodForPrivate a1=new GetterSetterMeyhodForPrivate(23);


        //Call the Setter Method for assign the value
        a1.setName("Debasish");

        //Call the getter Method for get the value
        System.out.println(a1.getName());

    }


}
