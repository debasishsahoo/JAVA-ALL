package Inherentance;

public class Animal {
    int leg;
    int eye;
    int tell;
    String type;
    String Voice;

    Animal(int l,int e,int t,String ty,String v){
        this.leg=l;
        this.eye=e;
        this.tell=t;
        this.type=ty;
        this.Voice=v;
    }
    public void Sound(){
        System.out.println(this.Voice);
    } 
}


class Dog extends Animal{
    String name;

    Dog(int l,int e,int t,String ty,String v,String n){

        super(l,e,t,ty,v);

        this.name=n;

    }


    public static void main(String []args){

        Dog lalu=new Dog(4, 2, 1, "Steet dog", "Bark", "Lalu");

        lalu.Sound();

    }

}

class Cat extends Animal{
    String name;

    Cat(int l,int e,int t,String ty,String v,String n){

        super(l,e,t,ty,v);

        this.name=n;

    }


    public static void main(String []args){

        Cat lalu=new Cat(4, 2, 1, "Home Cat", "Meu", "Hulo");

        lalu.Sound();

    }

}

   