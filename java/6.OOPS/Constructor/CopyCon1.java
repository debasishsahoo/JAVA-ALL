public class CopyCon1 {
    int id;
    String name;


    CopyCon1(int i,String n){
        this.id=i;
        this.name=n;
    }

    CopyCon1(CopyCon1 cc1){
        this.id=cc1.id;
        this.name=cc1.name;
    }

    void view(){
        System.out.println("id:"+this.id+" Name: "+this.name);
    }
    public static void main(String []args){
        CopyCon1 obj1=new CopyCon1(1,"Sahu");
        CopyCon1 obj2=new CopyCon1(obj1);
        obj1.view();
        obj2.view();
    }
}
