class Data{

    //Public Access / Global Access
    public String name="Evan";
    //Public Access / Global Access
    public int age=20;
    //Public Access / Global Access
    public void msg(){
        System.out.println("This is a Public Msg");
    }
    //if We create a private constructor then we cannot create object of that class out side of the class

    //Private Constructor
    private Data(){
        System.out.println("Private Constructor is Invoked");
    }

    public static void main(String []args){
        Data d1=new Data();
        
        System.out.println(d1.name);
        System.out.println(d1.age);
        d1.msg();
    }


}



public class PrivateConstractorSample {
    public static void main(String []args){

        Data d1=new Data(); //Compile Time Error
        System.out.println(d1.name);
        System.out.println(d1.age);
        d1.msg();
    }
}



