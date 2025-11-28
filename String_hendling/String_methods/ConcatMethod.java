//program using concat() method

void main(){
  String s1 = " hello";
  String s2 = " Programmers";
  String s3 = s1.concat(s2);
  IO.println("After concatenation: "+s3); 


  String s4 = " Welcome ";
  String s5 = "to my world";
  String s6 = s4 + s5;
  IO.println("After concatenation: "+s6);

  String s7=" Good ";
  IO.println(s7.concat(" Morning"));
}