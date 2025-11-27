//package JAVA_Programs.Method_Overloading;

class Pg04{
  public void accept(short ...d){
    System.out.println("Int");
  }
  public void accept(char ...d){
    System.out.println("Char");
  }
}

public class Program04{
  public static void main(String[] args) {
    Pg04 pg = new Pg04();
    pg.accept();
  }
}


/**error: reference to accept is ambiguous
    pg.accept();
      ^
  both method accept(short...) in Pg04 and method accept(char...) in Pg04 match
1 error */