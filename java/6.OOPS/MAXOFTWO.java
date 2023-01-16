public class MAXOFTWO {

    int x;
    int y;

    MAXOFTWO(int a,int b){
        this.x=a;
        this.y=b;
    }

    public void whoisBig(){
        if(this.x>this.y){
            System.out.println("X is big");
        }else{
            System.out.println("Y is big");
        }
    }

    public static void main(String []args){

        MAXOFTWO Sahu=new MAXOFTWO(3, 4);
        Sahu.whoisBig();






        MAXOFTWO Poly=new MAXOFTWO(6, 2);
        Poly.whoisBig();





        MAXOFTWO Evan=new MAXOFTWO(9, 6);
        Evan.whoisBig();





        MAXOFTWO Suvo=new MAXOFTWO(7, 2);
        Suvo.whoisBig();





        MAXOFTWO Rohit=new MAXOFTWO(123, 223);
        Rohit.whoisBig();



        

        MAXOFTWO Xarox=new MAXOFTWO(1987, 2345);
        Xarox.whoisBig();

    }

    
}
