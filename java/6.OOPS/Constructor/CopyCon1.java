public class CopyCon1 {
    int id;
    String name;

    CopyCon1(int i,String n){
        System.out.println("Normal Constructor Invocked");
        this.id=i;
        this.name=n;
    }

    CopyCon1(CopyCon1 cc1){
        System.out.println("Copy Constructor Invocked");
        this.id=cc1.id;
        this.name=cc1.name;
    }

    void view(){
        System.out.println("id:"+this.id+" Name: "+this.name);
    }
    public static void main(String []args){
        CopyCon1 obj1=new CopyCon1(1,"Sahu");
        
        obj1.view();

        CopyCon1 obj2=new CopyCon1(obj1);
        
        obj2.view();
    }
}
