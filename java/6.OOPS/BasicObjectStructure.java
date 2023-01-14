public class BasicObjectStructure {
    //! State:Properties Decide State.
    //! Behavior:Methods and response with other Object Decide.
    //! Identity:Name of that object,Should be Unique.

    String FirstName;
    String LastName;
    int id;
    String dept;

    //Constructor 
    //the Name of the Constructor is Same as Class Name
    public BasicObjectStructure(String fn,String ln,int r,String d){
        this.FirstName=fn;
        this.LastName=ln;
        this.id=r;
        this.dept=d;
    }



    public String getFullName(){
        return this.FirstName+" "+this.LastName;
    }

    public String getDept(){
        return this.dept;
    }

    public int getId(){
        return this.id;
    }
    
    public static void main(String[] args){


        BasicObjectStructure bos=new BasicObjectStructure("Debasish", "Sahoo", 23, "CSE");



        
        System.out.println("Full Name:"+ bos.getFullName());
        System.out.println("Dept:"+ bos.getDept());
        System.out.println("Id:"+ bos.getId());

        BasicObjectStructure Bos=new BasicObjectStructure("DE", "BAPAN", 25, "CSE");
        System.out.println("Full Name:"+ Bos.getFullName());
        System.out.println("Dept:"+ Bos.getDept());
        System.out.println("Id:"+ Bos.getId());
    }
}



