public class Con2 {
    int id;
    String name;
    int age;
    //Constructor Overloading
    Con2(int i,String n){
        this.id=i;
        this.name=n;
        System.out.println("2 Para Invoked");
    }

    Con2(int i,String n,int a){
        this.id=i;
        this.name=n;
        this.age=a;
        System.out.println("3 Para Invoked");
    }
    
    public static void main(String []args){
        Con2 student1=new Con2(23, "Sahu",20);//3
        Con2 student2=new Con2(24, "Poly");//2
        Con2 student3=new Con2(25, "Evan");//2
        Con2 student4=new Con2(26, "Rohit",16);//3
        Con2 student5=new Con2(27, "Bapon",20);//3


    }
}
