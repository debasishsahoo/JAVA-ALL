package AccessModifier;

class Evan{
    public String name= "Evan";
    private int age=18;
}


public class Pv1 {
    public String name= "Evan";
    private int age=18;
    public static void main(String []args){
        Evan e1=new Evan();
        System.out.println(e1.name);
        System.out.println(e1.age);

        Pv1 s1=new Pv1();
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}


