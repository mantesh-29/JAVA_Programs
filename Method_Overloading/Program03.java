//package JAVA_Programs.Method_Overloading;

class Pg03{
  public void accept(int ...d){
    System.out.println("Int");
  }
  public void accept(char ...d){
    System.out.println("Char");
  }
}

public class Program03{
  public static void main(String[] args) {
    Pg03 pg = new Pg03();
    pg.accept();
  }
}