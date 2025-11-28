//package JAVA_Programs.Method_Overloading;

class Pg07{
  public void accept(byte ...d){
    System.out.println("Byte");
  }
  public void accept(short ...d){
    System.out.println("Short");
  }
}

public class Program07{
  public static void main(String[] args) {
    Pg07 pg = new Pg07();
    // pg.accept(9); 
    /**possible lossy conversion from int to byte)
    method Pg07.accept(short...) is not applicable
      (varargs mismatch; possible lossy conversion from int to short)
1 error */
    pg.accept((byte)9);
    pg.accept((short)9);
  }
}