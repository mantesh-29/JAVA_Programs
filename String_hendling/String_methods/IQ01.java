//IQ 01 what is the difference between == operator and equals(Object obj) method pf String class while coparing the Strings?
void main(){
  String s1 = "Java";
  String s2 = "Java";
  String s3 = new String("Java");

  IO.println(s1 == s2);
  IO.println(s1 == s3);
  IO.println("===========================");
  IO.println(s1.equals(s2));
  IO.println(s1.equals(s3));
}