//package JAVA_Programs.Method_Overloading;

class Pg06{
  public void accept(double ...d){
    System.out.println("Double");
  }
  public void accept(long ...d){
    System.out.println("Long");
  }
}

public class Program06{
  public static void main(String[] args) {
    Pg06 pg = new Pg06();
    pg.accept();
  }
}