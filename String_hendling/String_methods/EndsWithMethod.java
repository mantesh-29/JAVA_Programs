//program using endsWith() method

void main(){
  String str = "Hii bro , kaise ho ?";
  String str1 = " ?";
  if(str.endsWith(str1)){
    IO.println("String ends with given suffix");
  }
  else{
    IO.println("String does not end with given suffix");
  }
}