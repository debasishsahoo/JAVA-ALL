public class OP6 {

  //Bitwise OR(|),Bitwise AND(&),Bitwise XOR(^),Bitwise Complement (~)
  //Operand1|Operand2
  public static void main(String[] args) {
    //In Java, bitwise OR operator "|" is a binary operator that operates on the bits. This operator returns 1 if either of the bit is 1. However, if both the bits are 0, it returns 0.

    int a = 8; //Binary of 8 is =   1000
    int b = 2; //Binary of 2 is = | 0010  
    //------------------------------1010---------------------------
    //So a|b means 1000|0010

    System.out.println("Bitwise OR of 8 and 2 is " + (a | b) + " in Decimal");



    

    char c = 'A'; //ASCII CODE 65 and Binary of 65 is =1000001
    //Binary of 2 is                                  =0000010
    //-------------------------------------------------1000011------
    System.out.println("Bitwise OR of A and 2 is " + (c | b) + " in decimal");




    



    //In Java, bitwise AND operator "&" is a binary operator that operates on the bits. This operator returns 1 if both the bits are 1. However, if either of the bit is 0, it returns 0.

    a=7;//Binary of 7 is =     0111
    b=3;//Binary of 3 is =   & 0011
    //-------------------------0011---

    System.out.println("Bitwise AND of 7 and 3 is "+(a&b)+" in decimal");

    c = 'A'; //ASCII CODE 65 and Binary of 65 is =1000001
    //Binary of 3 is                             =0000011
    //--------------------------------------------0000001------

    System.out.println("Bitwise AND of A and 3 is "+(c&b)+" in decimal");











    //In Java, bitwise XOR operator "^" is a binary operator that operates on the bits. This operator returns 1 if both the bits are different. However, if both the bits are same, it returns 0.

    byte x=7;//Binary of 7 is =     0111
    byte y=3;//Binary of 3 is =   ^ 0011
     //-----------------------------0100---
     c = 'A'; //ASCII CODE 65 and Binary of 65 is =1000001
     //Binary of 3 is                             =0000011
     //--------------------------------------------1000010------

    System.out.println("Bitwise XOR of 7 and 3 is "+(x^y)+" in decimal");
    System.out.println("Bitwise XOR of A and 3 is "+(c^y)+" in decimal");









   //In Java, bitwise Complement operator "~" is a unary operator that operates on the bits. This operator returns the inverse or complement of the bit. In other words, it makes every 0 a 1 and every 1 a 0. 

       x=7;//Binary of 7 is =     0111
                            //  ~
    //----------------------------1000---
    c = 'A'; //ASCII CODE 65 and Binary of 65 is =1000001
    //                                          ~
    //--------------------------------------------0111110------

    System.out.println("Bitwise Complement  of 7 "+(~x)+" in decimal");
    System.out.println("Bitwise Complement  of A "+(~c)+" in decimal");



    //  Left Shifting a byte value
        byte m = 64, n;
        int i;
 
        i = m << 2;
        n = (byte)(m << 2);
        System.out.println("Original value of m: " + m);
        System.out.println("i and b: " + i + " " + n);
  }
}
