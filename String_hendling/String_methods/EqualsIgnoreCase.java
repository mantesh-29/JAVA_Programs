void main(){
  String s1 = "HelLo";
  String s2 = "heLLo";
  if(s1.equalsIgnoreCase("hello")){
    IO.println("Both strings are equal");
  }
  else{
    IO.println("Strings are not equal");
  }
  if(s1.equalsIgnoreCase(s2)){
    IO.println("Both strings are equal");
  }
  else{
    IO.println("Strings are not equal");
  }

}