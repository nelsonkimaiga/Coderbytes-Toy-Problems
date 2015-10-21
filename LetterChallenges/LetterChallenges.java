// Using the Java language, have the function LetterChanges(str) take the str parameter being passed and modify it using the following algorithm. Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a). 
//Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.

import java.util.Scanner;

public class LetterChallenges{
 
  public static String capital(String str){
    String[] newStr = str.split(" ");
    StringBuffer strbuff = new StringBuffer();

    for(int i = 0; i < newStr.length; i++){
      strbuff.append(Character.toUpperCase(newStr[i].charAt(0)))
      .append(newStr[i].substring(1)).append(" ");
    }

    return strbuff.toString().trim();
  }






}