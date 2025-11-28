//WAP to show that String object created by using String Literal will be referred by multiple reference variable

public class Program01 {
  void main(){
    String s1 = "India";
    IO.println(s1.hashCode());

    s1 = null;
    System.gc();
    String s2 = "India";
    IO.println(s2.hashCode());

  }
  
}
