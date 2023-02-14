package Inheritance2.Parent;

import java.util.Set;

public class Vehical {
       private String engine;
       private int wheels;
       private int seats;
       private int fuelTank;
       private String light;

    public Vehical(){
        this.engine="Petrol";
        this.wheels=4;
        this.seats=4;
        this.fuelTank=40;
        this.light="Foglight";
    }
    
    public Vehical(String e,int w,int s,int f,String l){
        this.engine=e;
        this.wheels=w;
        this.seats=s;
        this.fuelTank=f;
        this.light=l;
    }
    
    
    
    
    
    
    
    
    public String getEngine(){
        return this.engine;
    }
    public String getLight(){
        return light;
    }
    public int getWheels(){
        return wheels;
    }
    public int getSeats(){
        return seats;
    }
    public int getFuelTank(){
        return fuelTank;
    }
}


