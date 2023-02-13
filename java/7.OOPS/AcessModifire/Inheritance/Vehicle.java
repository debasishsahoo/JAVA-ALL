package Inheritance;

public class Vehicle {
    protected String name="Audi";
    protected String type="Laxury";
    private float crashrating=2.7f;
    int cost=10000000;

    public void Promotion(){
        System.out.println("Very good Car");

    }
}

class Car extends Vehicle{
    private String modelname="A6";
    public static void main(String[] args) {
        Car MyCar=new Car();
        MyCar.Promotion();
        System.out.println(MyCar.name);
        System.out.println(MyCar.type);
        System.out.println(MyCar.modelname);
        System.out.println(MyCar.crashrating);
        System.out.println(MyCar.cost);
    }
}
