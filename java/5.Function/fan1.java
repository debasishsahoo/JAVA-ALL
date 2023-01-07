public class fun1 {

  static void MyMethod() {
    System.out.println("Method Executed!")
  }
  static void MySum(int a,int b){
   System.out.println(a+b);
  }

  static void MyStr(string a){
    System.out.println("The Value is :"+a);
  }

  public static void main(String[] args) {
    MyMethod();
    MySum(5,7);
    
    for(int i=0; i>=4;i++){
        
        MyStr("the Value is"+i)
    }
  }
}
