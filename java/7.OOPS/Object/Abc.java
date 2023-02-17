package Object;

class xyz{
    int x;
    int y;

    void printFun(){
        System.out.println("Hello this is function");
    }

}

public class Abc {

    // !STATE: its represent attribute of an Object. it also reflect the Properties
    int a;
    int b;

    //! BEHAVIORS: its represent Methods of an Object. it also reflect the response of an Object with other object
    void printFun(){
        System.out.println("Hello this is function");
    }

    public static void main(String[] args) {

        //!IDENTITY: its gives a unique name to an object enables one object to interact with other Object
        Abc obj=new Abc();
        System.out.println(obj.a);
        System.out.println(obj.b);
         

        //! not Possible
        xyz obj=new Abc();
        
        xyz obj=new xyz();

        

    }
    
}
