class Data{
    public String name="Evan";

    //Private of the Data Class
    private int age=20;

    //Private of the Data Class
    private void msg(){
        System.out.println("This is a Private Msg");
    }
}



public class PrivateAccessModifireSample {
    public static void main(String []args){
        Data d1=new Data();

        System.out.println(d1.name);

        //We are trying to Access Some Other Class Private Properties and Private Methods 
        //Compile Time Error
        System.out.println(d1.age);
        d1.msg();
    }
}
