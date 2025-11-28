//package JAVA_Programs.Method_Overloading;

class Pg11{
  public void accept(Object  s){
    System.out.println("Object");
  }
  public void accept(String  s){
    System.out.println("String");
  }
  public void accept(Integer i){
    System.out.println("Integer");
  }
}

public class Program11{
  public static void main(String[] args) {
    Pg11 pg = new Pg11();
    //pg.accept(null); 
    /*reference to accept is ambiguous
    pg.accept(null);
      ^
  both method accept(String) in Pg11 and method accept(Integer) in Pg11 match */
  }
}