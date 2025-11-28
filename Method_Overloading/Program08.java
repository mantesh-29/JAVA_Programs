//package JAVA_Programs.Method_Overloading;

class Pg08{
  public void accept(int d){
    System.out.println("Int");
  }
  public void accept(long s){
    System.out.println("Long");
  }
}

public class Program08{
  public static void main(String[] args) {
    Pg08 pg = new Pg08();
    pg.accept(9);
  }
}