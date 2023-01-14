
public class oops1 {
    // This Class is for Student

    //Variable or Properties
    static String Name;
    static int Roll;
    static String Dept;


    //Methods or Function 

    //Set Value to Properties
    static void set(String n,int r,String d){
        oops1.Name=n;
        oops1.Roll=r;
        oops1.Dept=d;
    }

    //Get Value from Properties
    static void get(){
        System.out.println("Student Name is:"+oops1.Name);
        System.out.println("Student Roll is:"+oops1.Roll);
        System.out.println("Student Dept is:"+oops1.Dept);
    }

   public static void main(String args[]){

    oops1.set("Debasish Sahoo",23,"CSE");
    oops1.get();
   }
}
