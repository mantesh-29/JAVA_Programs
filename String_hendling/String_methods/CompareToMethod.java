//program using compareTo() method

void main(){
  String s1 = "apple";
  String s2 = "banana";
  int result = s1.compareTo(s2);
  if(result == 0){
    IO.println("Both strings are equal");
  }
  else if(result < 0){
    IO.println(s1 + " is less than " + s2);
  }
  else{
    IO.println(s1 + " is greater than " + s2);
  }
}

