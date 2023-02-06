public class ObjectBasic {
    int a;
    String b;
    boolean c;

    int a1;
    String b1;
    boolean c1;

    ObjectBasic(int x,String y,boolean z){
        this.a1=x;
        this.b1=y;
        this.c1=z;
    }







    public void Show(){
        System.out.println("a:"+this.a);
        System.out.println("b:"+this.b);
        System.out.println("c:"+this.c);
    }
    public void Show1(){
        System.out.println("a:"+this.a1);
        System.out.println("b:"+this.b1);
        System.out.println("c:"+this.c1);
    }


    public static void main(String []args){

        ObjectBasic object; // Object Created with out value and with out memory Allowction
        
        //!to allowcate memory
        //!new keyword is allocate memory location for object.
        //!and insilazion of properties with user defind value or default value

          //Default Value 
          //int => 0 String =>null boolean=> flase
          //Custom Value
          object=new ObjectBasic(23,"Evan",true);

          object.Show();
          object.Show1();
    }
}

