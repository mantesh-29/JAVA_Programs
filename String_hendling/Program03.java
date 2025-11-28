//program using intern() method
void main(){
  String s1 = "java";
  String s2 = new String("java");
  IO.println(s1==s2);
  String s3 = s2.intern();
  IO.println(s1==s3);
  IO.println(s1==s2);
}