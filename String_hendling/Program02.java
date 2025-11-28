//package JAVA_Programs.String_hendling;
//Wap using intern() method


  void main(){
    
   String s1 = "Java";
    String s2 = new String("Java");
IO.println(s1==s2);
s2 = s2.intern();
IO.println(s1==s2); 
 }

  