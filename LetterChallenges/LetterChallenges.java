// Using the Java language, have the function LetterChanges(str) take the str parameter being passed 
//and modify it using the following algorithm. 
//Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a). 
//Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.

import java.util.Scanner; 
import java.io.*;

class Function {  
 public static String LetterChanges(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
  StringBuilder shifted = new StringBuilder();

  for (char c : str.toCharArray ()){
  	if (isLowercase(c)){
  		//replace
  		char newChar = (char)((c -'a' + 1) % ('z'-'a') + 'a');
  		switch (newChar) {
                    case 'a': case 'e': case 'i': case 'o': case 'u': 
                        newChar -= 'a' - 'A'; 
                        break;
                shifted.append(newChar);
            } else {
                shifted.append(c);
            }
        }

    return str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.LetterChanges(s.nextLine())); 
  }   
  
}

