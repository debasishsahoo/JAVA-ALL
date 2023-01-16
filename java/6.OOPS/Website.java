public class Website {
    //http://www.google.com
    //https://google.com

    //Properties
    String isW3;
    String Domain;
    String Technology;
    String Extension;
    String Protocol;

    //Constructor(to initial the Properties)
    //Auto Executed when Object is Created.Automatic Call hoi
    //By Default Constructor is Method

    Website(String w, String d,String t,String e,String p){
        this.isW3=w;
        this.Domain=d;
        this.Technology=t;
        this.Extension=e;
        this.Protocol=p;
    }

   //Method
    public void getURL(){
        System.out.println(this.Protocol+this.isW3+this.Domain+this.Extension);

        //return this.Protocol+this.isW3+this.Domain+this.Extension;
    }

    //Method
    public String getTech(){
        return this.Technology;

    }


    public static void main(String []args){

     //! We can use Class as Datatype => Custom Datatype for Object only.

        Website googleObj=new Website("www", ".google", "C++", ".com", "http://");

        Website bingObj=new Website("", "bing", "VB", ".org", "https://");

        Website yahooObj=new Website("www", ".yahoo", "C++", ".in", "http://");

        


        googleObj.getURL();
        System.out.println(googleObj.getTech());
        
        bingObj.getURL();
        System.out.println(bingObj.getTech());

        yahooObj.getURL();
        System.out.println(yahooObj.getTech());



    }


    
    
}
