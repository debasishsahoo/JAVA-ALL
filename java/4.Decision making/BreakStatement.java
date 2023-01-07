public class BreakStatement {

  public static void main(String[] args) {
    // for (int i = 0; i < 10; i++) {

    //   if (i == 5) {
    //     break;
    //   }

    //   System.out.println("i:" + i);
    // }

    for (int i = 1; i <= 3; i++) {
        
        for(int j=1;j<=3;j++){

          if(i==2 && j==2){
             break;
          }
          System.out.println(i+" "+j);
        }
    }

    System.out.println("Loop Complete");
  }
}
