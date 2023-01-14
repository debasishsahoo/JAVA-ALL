public class OOPS{

    static String Name;
    static int Roll;


    static void set(String n,int r){
        Name=n;
        Roll=r;
    }


   static void get(){
        System.out.println("My Name"+Name);
        System.out.println("My Roll"+Roll);
    }

    public static void main(String []args){
        String a="SAHU";
        int b=14;

        set(a,b);

        get();
    }

}