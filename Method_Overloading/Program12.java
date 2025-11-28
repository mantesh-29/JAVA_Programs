p//ackage JAVA_Programs.Method_Overloading;

class Pg12{
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

public class Program12{
  public static void main(String[] args) {
    Pg12 pg = new Pg12();
    pg.accept(null); 
  
  }
}
