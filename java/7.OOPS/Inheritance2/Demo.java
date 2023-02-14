package Inheritance2;

import Inheritance.Vehical.Bike;

public class Demo extends Bike{
    public static void main(String[] args) {
        Bike pulser=new Bike();

        System.out.println(pulser.getHandel());
        System.out.println(pulser.getEngine());
    }
    
}
