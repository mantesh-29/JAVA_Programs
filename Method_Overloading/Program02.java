//package JAVA_Programs.Method_Overloading;

class Pg02{
  public void accept(int d){
    System.out.println("Int");
  }
  public void accept(char d){
    System.out.println("Char");
  }
}

public class Program02{
  public static void main(String[] args) {
    Pg02 pg = new Pg02();
    pg.accept(6);
  }
}