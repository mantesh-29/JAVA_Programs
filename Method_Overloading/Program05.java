//package JAVA_Programs.Method_Overloading;

class Pg05{
  public void accept(short ...d){
    System.out.println("Int");
  }
  public void accept(byte ...d){
    System.out.println("Char");
  }
}

public class Program05{
  public static void main(String[] args) {
    Pg05 pg = new Pg05();
    pg.accept();
  }
}