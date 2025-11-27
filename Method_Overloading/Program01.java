class Pg01{
  public void accept(double d){
    System.out.println("Double");
  }
  public void accept(float d){
    System.out.println("Float");
  }
}

public class Program01{
  public static void main(String[] args) {
    Pg01 pg = new Pg01();
    pg.accept(6);
  }
}