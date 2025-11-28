//program using varios methods to create String object
void main(){
  String s1 = "JAVA technology";
  String s2 = new String("JAVA technology");
  s2 = s2.intern();
  String s3 = String.valueOf("JAVA technology");
  String s4 = "Java"+" technology";
  IO.println(s1==s2);
  IO.println(s1==s3);
  IO.println(s1==s4);
}