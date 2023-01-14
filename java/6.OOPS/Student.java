public class Student {

    //Properties
    String name;
    int age;
    int roll;
    String dept;


    //Constructor
    public Student(String n,int a,int r,String d){
        this.name=n;
        this.age=a;
        this.roll=r;
        this.dept=d;


        this.printInfo();
    }

    //Methods
    public String getName(){
        return this.name;
    }
    public String getDept(){
        return this.dept;
    }
    public int getAge(){
        return this.age;
    }
    public void printInfo(){
        System.out.println("Name:"+this.name+" "+"Roll:"+this.roll);
        System.out.println("Dept:"+this.getDept()+" "+"Age:"+this.getAge());
    }







    public static void main(String []args){
        Student sahuObj=new Student("SAHU",23,101,"ME"); 
        System.out.println("------------------------------------------------------");

        Student evanObj=new Student("Evan",20,100,"CSE"); 
        System.out.println("------------------------------------------------------");

        Student suvhoObj=new Student("Suvho",26,103,"ME"); 
        System.out.println("------------------------------------------------------");



        
    }
    
}
