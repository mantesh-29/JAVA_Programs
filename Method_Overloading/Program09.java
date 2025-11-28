//package JAVA_Programs.Method_Overloading;

class Pg09{
  public void accept(Object  s){
    System.out.println("Object");
  }
  public void accept(String  s){
    System.out.println("String");
  }
}

public class Program09{
  public static void main(String[] args) {
    Pg09 pg = new Pg09();
    pg.accept(9);
  }
}