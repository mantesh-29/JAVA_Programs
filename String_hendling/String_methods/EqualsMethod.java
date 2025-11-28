//Program using equals() method

void main(){
  String s1 = "hello";
  String s2 = new String("hello");
  if(s1.equals(s2)){
    IO.println("Both strings are equal");
  }
  else if(s1.equals("Nit")){
    IO.println("No strings are equal");
  }
}