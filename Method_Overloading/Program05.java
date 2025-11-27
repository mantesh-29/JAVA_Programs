//package JAVA_Programs.Method_Overloading;

class Pg04{
  public void accept(short ...d){
    System.out.println("Int");
  }
  public void accept(byte ...d){
    System.out.println("Char");
  }
}

public class Program05{
  public static void main(String[] args) {
    Pg04 pg = new Pg04();
    pg.accept();
  }
}