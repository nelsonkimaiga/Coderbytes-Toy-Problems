//Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order
import java.util.*; 
import java.io.*;

class Function {  
  String FirstReverse(String str) { 
 
    StringBuffer sb = new StringBuffer(str);
    sb = sb.reverse();
    str = sb.toString();
 
    return str;
 
  }
}
 
class Main {
  public static void main (String[] args) {
 
    // keep this function call here
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.FirstReverse(s.nextLine()));
 
  }
}           
