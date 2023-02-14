package Inheritance2.Vehical;

import Inheritance.Parent.Vehical;

public class Bike extends Vehical{

    private String handel;

    public Bike(){
        super();
        this.handel="Short";
    }

    public Bike(String h){
        super();
        this.handel=h;
    }
    
    public String getHandel(){
        return handel;
    }
    
}
