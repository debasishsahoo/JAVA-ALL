public class oops2 {

  // This Class is for Student

  public int sum(int x, int y) {
    return x + y;
  }

  public int sum(int x, int y, int z) {
    return x + y + z;
  }

  public static void main(String args[]) {
    //Object Creation 
    oops2 obj2 = new oops2();

    System.out.println(obj2.sum(2,3));

    System.out.println(obj2.sum(2,3,5));

  }
}
