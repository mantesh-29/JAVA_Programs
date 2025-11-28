//package JAVA_Programs.Method_Overloading;

class Pg10{
  public void accept(Object  s){
    System.out.println("Object");
  }
  public void accept(String  s){
    System.out.println("String");
  }
}

public class Program10{
  public static void main(String[] args) {
    Pg10 pg = new Pg10();
    pg.accept("NIT");
  }
}